//import java.awt.print.Book;
import java.util.*;

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("John", Arrays.asList(
                        new Book("Книга  1", 1995, 300),
                        new Book("Книга  2", 2000, 450),
                        new Book("Книга  3", 2003, 170),
                        new Book("Книга  4", 2010, 200),
                        new Book("Книга  5", 2015, 310)
                        )
                ),
                new Student("Mark", Arrays.asList(
                        new Book("Книга  6", 1996, 900),
                        new Book("Книга  7", 2002, 150),
                        new Book("Книга  8", 2016, 700),
                        new Book("Книга  9", 2016, 250),
                        new Book("Книга 10", 2015, 300)
                        )
                ),
                new Student("Alex", Arrays.asList(
                        new Book("Книга 11", 1996, 400),
                        new Book("Книга 12", 1986, 143),
                        new Book("Книга 13", 1993, 185),
                        new Book("Книга 14", 2016, 250),
                        new Book("Книга 15", 1994, 340)
                )
                )
        );

               students.stream()
                .peek(student -> System.out.println("Студент: " + student))
                .flatMap(student -> student.getBook().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .peek(book -> System.out.println("Первая книга после 2000: " + book))
                .limit(3)
                .map(Book::getYear)
                .findFirst() // Короткое замыкание
                .ifPresentOrElse(
                        year -> System.out.println("Год книги: " + year),
                        () -> System.out.println("Книги нет")
                );
         }