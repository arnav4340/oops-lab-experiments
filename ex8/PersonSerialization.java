import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PersonSerialization {
    public static void main(String[] args) {
        try {
            
            Person person = new Person("Arnav", 19);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"));
            out.writeObject(person);
            out.close();
            
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"));
            Person p = (Person) in.readObject();
            in.close();
            
            System.out.println("Name: " + p.name + ", Age: " + p.age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}