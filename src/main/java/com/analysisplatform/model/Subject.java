package com.analysisplatform.model;

import javax.persistence.*;

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**原科目ID*/
    @Column(name = "origin_id")
    private String originId;

    /**科目名称*/
    private String name;

    /** 科目简称*/
    @Column(name = "short_name")
    private String shortName;
    /**原学校ID*/
    @Column(name = "origin_school_id")
    private String originSchoolId;

    /** 原校区ID*/
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

    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
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


    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                '}';
    }
}