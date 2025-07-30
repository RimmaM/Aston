import java.util.ArrayList;
import java.util.List;

public class CollectionsStudent {
    public static void main(String[] args) {
        List<String> Student = new ArrayList<>();
        Student.add("Alex");
        Student.add("Ben");
        Student.add("Sem");
        Student.add("Den");
        System.out.println(Student);

        System.out.println(Student.get(2));

        Student.remove("Sem");
        System.out.println(Student);

        Student.add("Eva");
        System.out.println(Student);
    }
}
