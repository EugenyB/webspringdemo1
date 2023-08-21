package ua.mk.berkut.webspringdemo1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.mk.berkut.webspringdemo1.data.Student;
import ua.mk.berkut.webspringdemo1.service.StudentService;

@Controller
@AllArgsConstructor
public class MainController {

    private StudentService studentService;

    @RequestMapping("/hello/{color}")
    public String hello(@PathVariable String color, Model model) {
        model.addAttribute("username", "Student");
        model.addAttribute("color", color);
        return "hello";
    }

    @PostMapping("/add_student")
    public String addStudent(@RequestParam String name, @RequestParam int age) {
        studentService.addStudent(new Student(name, age));
        return "redirect:/students";
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute(studentService.findAll());
        return "students";
    }
}
