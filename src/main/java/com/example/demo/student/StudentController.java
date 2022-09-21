package com.example.demo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/api/students")
@RestController
public class StudentController {
    @Autowired
    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    @GetMapping("/students")
    public  List<Student> findAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

        @GetMapping("/student/{name}")
        public Student findStudentByName(@RequestBody String name){
            return studentService.getStudentByName(name);
        }

        @GetMapping("/student/{email}")
        public Student findStudentByEmail(@RequestBody String email){
        return studentService.getStudentByEmail(email);
        }

        @PutMapping("/update")
        public Student updateStudent(@RequestBody Student student){
            return studentService.updateStudent(student);
        }

        @DeleteMapping("/delete/{id}")
        public  String deleteStudent(@PathVariable Long id){
        return  studentService.deleteStudent(id);
        }

}
