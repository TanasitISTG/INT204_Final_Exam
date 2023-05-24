package sit.int204.exam.exceptions;

public class StudentGradeNotFound extends RuntimeException  {
    public StudentGradeNotFound(String message) {
        super(message);
    }
}
