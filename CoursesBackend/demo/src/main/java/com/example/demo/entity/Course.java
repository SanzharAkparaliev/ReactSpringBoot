package com.example.demo.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    @Id
    private Long id;
    private String title;
    private String description;
}
