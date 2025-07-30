import java.util.HashSet;

public class CollectionsStudent {
    private static int CollectionsStudent2;

    public static void main(String[] args) {
        HashSet <String> Student = new HashSet<>();
        Student.add("Alex");
        Student.add("Den");
        Student.add("Sem");
        Student.add("Ben");
        Student.add("Alex");
        System.out.println(Student);

        Student.remove("Den");
        Student.add("Mark");
        System.out.println("List after removing Den and adding New student: " + Student);

    }
}
