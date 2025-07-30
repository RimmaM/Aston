import java.util.List;

public class Student {
    public final String name;

    private List <Book> book;

    List <Book> getBook() {
        return book;
    }
    public void setBook(List <Book> book) {
        this.book = book;
    }

    public Student (String name , List <Book> book) {
        this.name = name;
        if (book != null) {
            this.book = book;
        }
    }

    public String toString() {
        return "Student name = " + name + ", book = " + book;
    }
}
