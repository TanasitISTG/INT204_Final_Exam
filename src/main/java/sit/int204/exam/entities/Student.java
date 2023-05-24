package sit.int204.exam.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {
    @Id
    private Integer studentId;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private Set<StudentGrade> studentGrades;
}
