package sit.int204.exam.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sit.int204.exam.DTOs.StudentGradeDTO;
import sit.int204.exam.entities.StudentGrade;
import sit.int204.exam.services.StudentGradeService;

import java.util.List;

@RestController
@RequestMapping("/api/64130500034/student_grades")
public class StudentGradeController {
    @Autowired
    private StudentGradeService studentGradeService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("")
    public List<StudentGradeDTO> findAll() {
        List<StudentGrade> studentGradeList = studentGradeService.findAll();
        return studentGradeList.stream().map(studentGrade -> modelMapper.map(studentGrade, StudentGradeDTO.class)).toList();
    }
}
