package com.analysisplatform.model;

import javax.persistence.*;

@Table(name = "dormitory_room")
public class DormitoryRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**原寝室楼房间ID*/
    @Column(name = "origin_id")
    private String originId;

    /**寝室楼房间名称*/
    private String name;

    /** 原寝室楼ID*/
    @Column(name = "origin_dormitory_building_id")
    private String originDormitoryBuildingId;

    @Column(name = "origin_school_id")
    private String originSchoolId;
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

    public String getOriginDormitoryBuildingId() {
        return originDormitoryBuildingId;
    }
    public void setOriginDormitoryBuildingId(String originDormitoryBuildingId) {
        this.originDormitoryBuildingId = originDormitoryBuildingId;
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
        return "DormitoryRoom{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", originDormitoryBuildingId='" + originDormitoryBuildingId + '\'' +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                '}';
    }
}