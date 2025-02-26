package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String unitno;
    private String department;
    private String orgname;
    private String indvid;

    public User() {}

    public User(String name, String unitno ,String department , String orgname , String indvid) {
        this.name = name;
        this.unitno = unitno;
        this.department=department;
        this.orgname=orgname;
        this.indvid = indvid;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getunitno() { return unitno; }
    public void setunitno(String unitno) { this.unitno = unitno; }
    public String getdepartment() { return department; }
    public void setdepartment(String department) { this.department = department; }
    public String getorgname() { return orgname; }
    public void setorgname(String orgname) { this.orgname = orgname; }
    public void setindvid(String indvid){this.indvid=indvid;}
    public String getindvid(){return indvid;}

}
