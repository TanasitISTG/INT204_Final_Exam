package sit.int204.exam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sit.int204.exam.services.StudentGradeService;
import sit.int204.exam.services.StudentService;
import sit.int204.exam.services.SubjectService;

@RestController
@RequestMapping("/api/64130500034/init")
public class Initialize {
    @Autowired
    private StudentService studentService;
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private StudentGradeService studentGradeService;

    @GetMapping("")
    public String init() {
        studentService.init();
        subjectService.init();
        studentGradeService.init();
        return "Initialize completed.";
    }
}
