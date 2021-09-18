package com.example.demo.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.*;

@Entity
@Data
@Table(name = "todo")
public class Todo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "deadline")
    private LocalDate deadline;

    @Column(name = "status")
    private Boolean status = false;
    // private Integer status = 0;

    @Column(name = "title")
    private String title;

    @Column(name = "created_time")
    private LocalDateTime createdTime;
}
