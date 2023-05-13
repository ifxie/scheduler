package com.analysisplatform.model;

import javax.persistence.*;

public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**原年级ID*/
    @Column(name = "origin_id")
    private String originId;

    /**年级名称*/
    @Column(name = "name")
    private String name;

    /**标注小初高*/
    @Column(name = "section_id")
    private String sectionId;

    /**标注年级*/
    @Column(name = "section_level")
    private String sectionLevel;

    /**学校ID*/
    @Column(name = "origin_school_id")
    private String originSchoolId;

    /**校区ID*/
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

    public String getSectionId() {
        return sectionId;
    }
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionLevel() {
        return sectionLevel;
    }
    public void setSectionLevel(String sectionLevel) {
        this.sectionLevel = sectionLevel;
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
        return "Grade{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", sectionId='" + sectionId + '\'' +
                ", sectionLevel='" + sectionLevel + '\'' +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                '}';
    }
}