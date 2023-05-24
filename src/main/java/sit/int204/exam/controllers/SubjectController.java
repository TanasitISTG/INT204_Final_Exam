package sit.int204.exam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sit.int204.exam.entities.Subject;
import sit.int204.exam.services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/api/64130500034/subjects")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("")
    public List<Subject> findAll() {
        return subjectService.findAll();
    }
}
