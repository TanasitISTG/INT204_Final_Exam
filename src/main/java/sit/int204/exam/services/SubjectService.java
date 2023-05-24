package sit.int204.exam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.int204.exam.entities.Subject;
import sit.int204.exam.exceptions.SubjectNotFound;
import sit.int204.exam.repositories.SubjectRepository;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public void init() {
        Subject subject101 = new Subject(101, "INT101", "Computer Programming 1", 3.0);
        Subject subject102 = new Subject(102, "INT102", "Computer Programming 2", 2.0);
        Subject subject201 = new Subject(201, "INT201", "Front-End Dev 1", 3.0);
        Subject subject202 = new Subject(202, "INT202", "Back-End Dev 1", 3.0);
        Subject subject203 = new Subject(203, "INT203", "Front-End Dev 2", 2.5);
        Subject subject204 = new Subject(204, "INT204", "Back-End Dev 2", 1.0);

        List<Subject> subjectList = List.of(subject101, subject102, subject201, subject202, subject203, subject204);
        saveAll(subjectList);
    }

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    public Subject findById(Integer subjectId) {
        return subjectRepository.findById(subjectId).orElseThrow(() -> new SubjectNotFound("Subject with id " + subjectId + " not found"));
    }

    public Subject save(Subject subject) {
        return subjectRepository.saveAndFlush(subject);
    }

    public List<Subject> saveAll(List<Subject> subjectList) {
        return subjectRepository.saveAllAndFlush(subjectList);
    }
}
