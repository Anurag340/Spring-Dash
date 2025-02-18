package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(name = "unitno", nullable = false)
    private String unitno;
    private String department;
    @Column(name = "orgid",nullable = false)
    private String orgid;

    public Team() {}

    public Team(String unitno, String department , String orgid) {
        this.unitno = unitno;
        this.department = department;
        this.orgid = orgid;
    }

    public Long getId() { return id; }
    public String getUnitno() { return unitno; }
    public void setUnitno(String unitno) { this.unitno = unitno; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public void setOrgid(String orgid) { this.orgid = orgid; }
    public String getOrgid() { return orgid; }
}
