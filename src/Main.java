import entities.Student;
import es1.Esercizio1;

public class Main {
    public static void main(String[] args) {
        Student aldo = new Student("Aldo", "Baglio");
        Student giovanni = new Student("Giovanni", "Storti");
        Student giacomo = new Student("Giacomo", "Poretti");

        Student ajeje = new Student(aldo.name, aldo.surname); // Creare un nuovo oggetto invece di assegnare direttamente

        ajeje.name = "Ajeje"; // Modifica solo il nome di ajeje

        System.out.println(aldo.id);
        System.out.println(aldo.name);
        System.out.println(aldo.surname);

        System.out.println(giovanni.id);
        System.out.println(giovanni.name);
        System.out.println(giovanni.surname);

        System.out.println(giacomo.id);
        System.out.println(giacomo.name);
        System.out.println(giacomo.surname);

        aldo.sayHello();
        giovanni.sayHello();
        giacomo.sayHello();
        ajeje.sayHello();

        System.out.println(Student.school); // Accedere all'attributo statico correttamente
        System.out.println(Esercizio1.isBisestile(2024)); // Passare direttamente l'anno come argomento
    }
}
