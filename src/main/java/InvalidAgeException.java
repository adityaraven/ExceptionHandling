

//Inherit from base class Exception
public class InvalidAgeException extends Exception{
    String message;

    public InvalidAgeException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidAgeException{" +
                "message='" + this.message + '\'' +
                '}';
    }
}
