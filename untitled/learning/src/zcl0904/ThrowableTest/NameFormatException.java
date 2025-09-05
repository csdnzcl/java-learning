package zcl0904.ThrowableTest;

public class NameFormatException extends RuntimeException{

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }

}
