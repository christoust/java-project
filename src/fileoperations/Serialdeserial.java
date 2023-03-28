package fileoperations;

import java.io.Serializable;
import java.io.*;

public class Serialdeserial implements Serializable
{
	
	
	    private String name;
	    private int age;

	    public  Serialdeserial(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {
	        Serialdeserial person = new Serialdeserial("John Doe", 30);

	        // Serialization
	        try {
	            FileOutputStream fileOut = new FileOutputStream("D:\\person.ser");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(person);
	            out.close();
	            fileOut.close();
	            System.out.println("Serialized data is saved in person.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialization
	        try {
	            FileInputStream fileIn = new FileInputStream("D:\\person.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            Serialdeserial deserializedPerson = (Serialdeserial) in.readObject();
	            in.close();
	            fileIn.close();
	            System.out.println("Deserialized data: " + deserializedPerson.getName() + " " + deserializedPerson.getAge());
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}


