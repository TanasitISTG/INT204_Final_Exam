package sit.int204.exam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.int204.exam.entities.StudentGrade;
import sit.int204.exam.exceptions.StudentGradeNotFound;
import sit.int204.exam.repositories.StudentGradeRepository;

import java.util.List;

@Service
public class StudentGradeService {
    @Autowired
    private StudentGradeRepository studentGradeRepository;
    @Autowired
    private StudentService studentService;
    @Autowired
    private SubjectService subjectService;

    public void init() {
        List<StudentGrade> studentGradeList01 = List.of(
                new StudentGrade(1, subjectService.findById(101), studentService.findById(3401), 3.0),
                new StudentGrade(2, subjectService.findById(102), studentService.findById(3401), 3.5),
                new StudentGrade(3, subjectService.findById(201), studentService.findById(3401), 3.5),
                new StudentGrade(4, subjectService.findById(203), studentService.findById(3401), 0.0),
                new StudentGrade(5, subjectService.findById(203), studentService.findById(3401), 2.0)
        );

        List<StudentGrade> studentGradeList02 = List.of(
                new StudentGrade(6, subjectService.findById(101), studentService.findById(3405), 3.0),
                new StudentGrade(7, subjectService.findById(102), studentService.findById(3405), 2.5),
                new StudentGrade(8, subjectService.findById(201), studentService.findById(3405), 2.5),
                new StudentGrade(9, subjectService.findById(203), studentService.findById(3405), 1.0)
        );

        saveAll(studentGradeList01);
        saveAll(studentGradeList02);
    }

    public List<StudentGrade> findAll() {
        return studentGradeRepository.findAll();
    }

    public StudentGrade findById(Integer gradeId) {
        return studentGradeRepository.findById(gradeId).orElseThrow(() -> new StudentGradeNotFound("StudentGrade with id " + gradeId + " not found"));
    }

    public StudentGrade save(StudentGrade studentGrade) {
        return studentGradeRepository.saveAndFlush(studentGrade);
    }

    public List<StudentGrade> saveAll(List<StudentGrade> studentGradeList) {
        return studentGradeRepository.saveAllAndFlush(studentGradeList);
    }
}
