package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String unitNo;
    private String department;

    public Team() {}

    public Team(String unitNo, String department) {
        this.unitNo = unitNo;
        this.department = department;
    }

    public Long getId() { return id; }
    public String getUnitNo() { return unitNo; }
    public void setUnitNo(String unitNo) { this.unitNo = unitNo; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
