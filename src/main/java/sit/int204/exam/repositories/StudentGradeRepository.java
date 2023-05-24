package sit.int204.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.exam.entities.StudentGrade;

public interface StudentGradeRepository extends JpaRepository<StudentGrade, Integer> {
}
