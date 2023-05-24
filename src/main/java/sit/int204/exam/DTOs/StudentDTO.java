package sit.int204.exam.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class StudentDTO {
    private Integer studentId;
    private String name;
    @JsonIgnore
    private Set<StudentGradeDTO> studentGrades;

    public List<String> getGrades() {
        if (studentGrades == null) {
            return null;
        }

        List<String> grades = new ArrayList<>();
        for (StudentGradeDTO studentGrade : studentGrades) {
            grades.add(studentGrade.getInformation());
        }
        grades.sort(String::compareTo);
        return grades;
    }
}
