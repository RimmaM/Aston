import src.FileReadException;
import src.FileWriteException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws FileWriteException, FileReadException {
        try {
            Files.write(Paths.get("D:\\Aston\\Aston_3\\file.txt"), "Hello Aston\n".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new FileWriteException("ошибка при записи", e);
        }

        try {
            String content = String.join(System.lineSeparator(),Files.readAllLines(Paths.get("D:\\Aston\\Aston_3\\file.txt")));
            System.out.println("Содержимое файла:");
            System.out.println(content);
        } catch (IOException e) {
            throw new FileReadException("ошибка при чтении", e);
        }


    }
}