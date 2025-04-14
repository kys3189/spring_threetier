package com.app.threetier.controller;

import com.app.threetier.domain.StudentVO;
import com.app.threetier.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/student/*")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("register")
    public void goToRegister(Model model) {
        model.addAttribute("studentVO", new StudentVO());
    }

    @PostMapping("register")
    public RedirectView register(StudentVO studentVO) {
        studentService.register(studentVO);
        return new RedirectView("/student/result");
    }

    @GetMapping("result")
    public void goToResult(Model model) {
        List<StudentVO> students = studentService.getStudents();
        model.addAttribute("students", students);
    }
}
