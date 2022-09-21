package com.example.demo.student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collection = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dob;

}
