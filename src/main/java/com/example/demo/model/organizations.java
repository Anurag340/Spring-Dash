package com.example.demo.model;

import jakarta.persistence.*;
@Entity
@Table(name = "organizations")
public class organizations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "unitno", nullable = false)
    private int unitno;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "orgname", nullable = false)
    private String orgname;
}
