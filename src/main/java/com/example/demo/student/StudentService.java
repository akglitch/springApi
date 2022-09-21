package com.example.demo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class StudentService {
    @Autowired
  public StudentRepository studentRepository;

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return studentRepository.saveAll(students);
    }

    public  List<Student> getStudents(){
        return studentRepository.findAll();
    }


    public Student getStudentById(Long id){
        return studentRepository.findAllById(id);
    }

    public Student getStudentByName(String name){
        return studentRepository.findByName(name);
    }

    public  Student getStudentByEmail(String email){
        return studentRepository.findByEmail(email);
    }

    public String deleteStudent(Long id){
        studentRepository.deleteById(id);
        return "student removed !" + id;
    }


    public Student updateStudent(Student student){
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDob(student.getDob());
        return studentRepository.save(existingStudent);
    }


}
