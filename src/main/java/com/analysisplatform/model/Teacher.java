package com.analysisplatform.model;

import javax.persistence.*;
import java.util.Date;

public class Teacher {
    /** ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /** 原教师ID*/
    @Column(name = "origin_id")
    private String originId;
    /** 教师姓名*/
    @Column(name = "name")
    private String name;
    /**教师性别*/
    @Column(name = "sex")
    private String sex;
    /**教师生日*/
    @Column(name = "birthdate")
    private Date birthdate;
    /**教师政治面貌*/
    @Column(name = "member")
    private String member;
    /**教师职称*/
    @Column(name = "title")
    private String title;
    /**原学校ID*/
    @Column(name = "origin_school_id")
    private String originSchoolId;
    /**原校区ID*/
    @Column(name = "origin_campus_id")
    private String originCampusId;



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginId() {
        return originId;
    }
    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOriginSchoolId() {
        return originSchoolId;
    }
    public void setOriginSchoolId(String originSchoolId) {
        this.originSchoolId = originSchoolId;
    }

    public String getOriginCampusId() {
        return originCampusId;
    }
    public void setOriginCampusId(String originCampusId) {
        this.originCampusId = originCampusId;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getMember() {
        return member;
    }
    public void setMember(String member) {
        this.member = member;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdate=" + birthdate +
                ", member='" + member + '\'' +
                ", title='" + title + '\'' +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                '}';
    }
}