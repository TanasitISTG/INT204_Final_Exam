package sit.int204.exam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Subject {
    @Id
    private Integer subjectId;
    private String subjectCode;
    private String title;
    private Double credit;
}
