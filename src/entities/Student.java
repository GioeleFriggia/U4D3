package entities;

import java.util.Random;

public class Student {
    // Attributi
    public int id;
    public String name;
    public String surname;
public static String school = "Epicode"; // metodo statico
    // Costruttore
    public Student(String name, String surname) {
        Random rndm = new Random();
        this.name = name;
        this.surname = surname;
        this.id = rndm.nextInt(1000);
    }

    // Metodo sayHello
    public void sayHello() {
        System.out.println("Ciao, sono " + this.name + " " + this.surname + ", ID: " + this.id);
    }
}
