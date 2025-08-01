package src;

import java.io.IOException;

public class FileReadException extends Exception {
    public FileReadException(String ErrorR, Throwable cause) {
        super(ErrorR, cause);
    }
}
