package com.example.demo.student;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface StudentRepository extends MongoRepository<Student,Long> {
    Student findByName(String name);

     Student findAllById(Long id);

    Student findByEmail(String email);

}
