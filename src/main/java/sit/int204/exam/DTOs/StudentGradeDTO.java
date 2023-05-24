package sit.int204.exam.DTOs;

import lombok.Getter;
import lombok.Setter;
import sit.int204.exam.entities.Subject;

@Getter
@Setter
public class StudentGradeDTO {
    private Subject subject;
    private Double grade;

    public String getInformation() {
        return subject.getSubjectCode() + " : " +  grade;
    }
}
