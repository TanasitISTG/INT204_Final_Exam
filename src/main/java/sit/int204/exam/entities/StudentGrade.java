package sit.int204.exam.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class StudentGrade {
    @Id
    private Integer gradeId;
    @JsonIgnore
    @ManyToOne
    private Subject subject;
    @JsonIgnore
    @ManyToOne
    private Student student;
    private Double grade;
}
