package sit.int204.exam.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int204.exam.DTOs.StudentDTO;
import sit.int204.exam.entities.Student;
import sit.int204.exam.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/64130500034/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("")
    public List<StudentDTO> findAll() {
        List<Student> studentList = studentService.findAll();
        return studentList.stream().map(student -> modelMapper.map(student, StudentDTO.class)).toList();
    }

    @DeleteMapping("/{studentId}")
    public void deleteById(@PathVariable Integer studentId) {
        studentService.deleteById(studentId);
    }
}
