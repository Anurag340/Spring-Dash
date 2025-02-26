package com.example.demo.model;

import jakarta.persistence.*;
@Entity
@Table(name = "userpersonals")
public class userpersonals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "indvid", nullable = false, unique = true)
    private int indvId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "bldgrp", nullable = false)
    private String bloodGroup;
}
