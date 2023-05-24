package sit.int204.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.exam.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
