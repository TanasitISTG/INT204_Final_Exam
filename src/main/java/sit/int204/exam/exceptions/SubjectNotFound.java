package sit.int204.exam.exceptions;

public class SubjectNotFound extends RuntimeException{
    public SubjectNotFound(String message) {
        super(message);
    }
}
