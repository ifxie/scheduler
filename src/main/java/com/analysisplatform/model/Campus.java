package com.analysisplatform.model;

import javax.persistence.*;

public class Campus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**原校区ID*/
    @Column(name = "origin_id")
    private String originId;
    /**校区名称*/
    private String name;
    /** 原学校ID*/
    @Column(name = "origin_school_id")
    private String originSchoolId;
    /**行政区划*/
    @Column(name="administrative_division")
    private String administrativeDivision;
    /**地址*/
    @Column(name = "address")
    private String address;
    /**占地面积*/
    @Column(name = "area")
    private String area;
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

    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(String administrativeDivision) {
        this.administrativeDivision = administrativeDivision;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", administrativeDivision='" + administrativeDivision + '\'' +
                ", address='" + address + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}