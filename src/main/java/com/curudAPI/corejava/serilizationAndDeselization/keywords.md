
Serialization: Convert an object into a byte stream.
Deserialization: Reconstruct the object from the byte stream.
Marker Interface: Empty Interface is called Marker Interface.
Serializable, cloneable,Random Access


Transient Keyword: During Serialization Transient keyword when applied on a variable it will skip written the content 
into the object.

public class A implements Serializable{
String name="mike";
String city="delhi"
transient password="testing";

Volatile Keyword:
-> It is used to indicate that a variable's value may be concurrently accessed and modified by multiple threads.
-> It is Thread safe
-> By using volatile keyword, you ensure that changes to variable made by one thread and immediately visible to other thread, even if they are running on different parameter.