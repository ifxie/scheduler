package com.analysisplatform.model;

import javax.persistence.*;

public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**学校原ID*/
    @Column(name = "origin_id")
    private String originId;

    /**学校名称*/
    @Column(name = "name")
    private String name;

    /**学校登录认证用户名,密码*/
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    /**行政区划*/
    @Column(name="administrative_division")
    private String administrativeDivision;

    /**地址*/
    @Column(name = "address")
    private String address;

    /**校长*/
    @Column(name = "principle")
    private String principle;

    /**是否公立*/
    @Column(name = "is_public")
    private String isPublic;

    /**教学层次*/
    @Column(name = "education_range")
    private int educationRange;

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

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username;}

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

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

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }


    public int getEducationRange() {
        return educationRange;
    }

    public void setEducationRange(int educationRange) {
        this.educationRange = educationRange;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", administrativeDivision='" + administrativeDivision + '\'' +
                ", address='" + address + '\'' +
                ", principle='" + principle + '\'' +
                ", isPublic='" + isPublic + '\'' +
                ", educationRange=" + educationRange +
                '}';
    }
}