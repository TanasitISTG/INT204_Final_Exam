package sit.int204.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.exam.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
