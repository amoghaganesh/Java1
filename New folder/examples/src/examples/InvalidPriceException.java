package examples;

// Custom Unchecked Exception
public class InvalidPriceException extends RuntimeException {
    public InvalidPriceException(String message) {

        super(message);
    }
}

