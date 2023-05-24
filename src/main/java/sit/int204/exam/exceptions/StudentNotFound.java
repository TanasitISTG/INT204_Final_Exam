package sit.int204.exam.exceptions;

public class StudentNotFound extends RuntimeException{
    public StudentNotFound(String message) {
        super(message);
    }
}
