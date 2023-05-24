package sit.int204.exam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.int204.exam.entities.Student;
import sit.int204.exam.exceptions.StudentNotFound;
import sit.int204.exam.repositories.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void init() {
        Student student01 = new Student(3401, "Tanasit-01", null);
        Student student02 = new Student(3402, "Tanasit-02", null);
        Student student03 = new Student(3403, "Tanasit-03", null);
        Student student04 = new Student(3404, "Tanasit-04", null);
        Student student05 = new Student(3405, "Tanasit-05", null);

        List<Student> studentList = List.of(student01, student02, student03, student04, student05);
        saveAll(studentList);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Integer id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFound("Student with id " + id + " not found"));
    }

    public Student save(Student student) {
        return studentRepository.saveAndFlush(student);
    }
    public List<Student> saveAll(List<Student> studentList) {
        return studentRepository.saveAllAndFlush(studentList);
    }

    public void deleteById(Integer studentId) {
        findById(studentId).getStudentGrades().forEach(studentGrade -> {
            if (studentGrade.getGrade() != null) {
                throw new RuntimeException("Student have grade info in StudentGrade");
            }
        });

        studentRepository.deleteById(studentId);
    }
}
