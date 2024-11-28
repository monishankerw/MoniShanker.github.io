Object
 An entity that state and behaviour is known as object.

5 ways to create object:
1. Java new operator
2. clone() method
3. serialization and deserialization
4. Java class new instance() method
5. Java class new instance() method of constructor.


### In Java, an object is an instance of a class, which has both state (attributes) and behavior (methods). There are several ways to create objects in Java, and here are 5 of them with examples.

---

### 1. **Using the `new` operator**
This is the most common way to create objects in Java.

```java
class Car {
    String model;
    int year;
    
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2022); // Object created using `new` keyword
        car.display();
    }
}
```

### 2. **Using `clone()` method**
The `clone()` method is used to create a copy of an existing object. For this, the class must implement the `Cloneable` interface.

```java
class Car implements Cloneable {
    String model;
    int year;
    
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Create a clone of the object
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Car car1 = new Car("Tesla", 2022);
            Car car2 = (Car) car1.clone(); // Clone the car1 object
            car2.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

### 3. **Using Serialization and Deserialization**
In this method, an object is serialized (converted to a byte stream) and then deserialized (converted back to an object). The class must implement `Serializable` interface.

```java
import java.io.*;

class Car implements Serializable {
    String model;
    int year;
    
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Serialization
            Car car = new Car("Tesla", 2022);
            FileOutputStream fileOut = new FileOutputStream("car.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(car);
            out.close();
            fileOut.close();

            // Deserialization
            FileInputStream fileIn = new FileInputStream("car.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Car deserializedCar = (Car) in.readObject();
            in.close();
            fileIn.close();

            deserializedCar.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

### 4. **Using `newInstance()` method of `Class`**
This method creates a new instance using reflection, calling the default (no-argument) constructor.

```java
class Car {
    String model = "Tesla";
    int year = 2022;

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Car car = (Car) Class.forName("Car").newInstance(); // Create object using reflection
            car.display();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

### 5. **Using `newInstance()` method of `Constructor` class**
This is similar to the previous one, but it uses the `Constructor` class from the reflection API.

```java
import java.lang.reflect.Constructor;

class Car {
    String model;
    int year;
    
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Constructor<Car> constructor = Car.class.getConstructor(String.class, int.class);
            Car car = constructor.newInstance("Tesla", 2022); // Object created using reflection
            car.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```



