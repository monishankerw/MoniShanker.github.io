package org.example.corejava.serilizationAndDeselization;

/*
Serialization: Convert an object into a byte stream.
Deserialization: Reconstruct the object from the byte stream.

Serializable Interface:
A class must implement the Serializable interface to be serialized.
This interface does not have any methods; it's a marker interface that tells the JVM that the object can be serialized.

Important Concepts:
serialVersionUID: It's a unique identifier for a class. It ensures that the object can be deserialized correctly by matching the serialVersionUID during serialization and deserialization.
transient Keyword: Fields marked with transient are not serialized.
Customization: You can customize serialization by implementing writeObject and readObject methods in your class.
Advantages:
Persistence: Save the state of an object.
Network Communication: Send objects over a network.
Disadvantages:
Performance: Serialization can be slower compared to other mechanisms.
Security: Serialized objects can be vulnerable if not handled carefully.
 */
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Create an object of Person
        Person person = new Person("John Doe", 30);

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
            System.out.println("Object has been serialized: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Object has been deserialized: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
