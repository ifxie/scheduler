package com.analysisplatform.model;

import java.util.Date;
import javax.persistence.*;

public class Student {
    /** ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**原学生ID*/
    @Column(name = "origin_id")
    private String originId;
    /**姓名*/
    private String name;
    /** 性别*/
    private String sex;
    /**出生日期*/
    private Date birthdate;
    /**民族*/
    private String nation;
    /**财富状况*/
    private String wealth;
    /**籍贯*/
    @Column(name = "native_place")
    private String nativePlace;
    /**居住地址*/
    @Column(name = "residence_place")
    private String residencePlace;
    /**居住住址类型*/
    @Column(name = "residence_type")
    private String residenceType;
    /**家庭地址*/
    @Column(name = "home_address")
    private String homeAddress;
    /**政治面貌*/
    private String member;
    /**原班级ID*/
    @Column(name = "origin_class_id")
    private String originClassId;
    /**班级名称*/
    @Column(name = "class_name")
    private String className;
    /**原年级ID*/
    @Column(name = "origin_grade_id")
    private String originGradeId;
    /**年级名称*/
    @Column(name = "grade_name")
    private String gradeName;
    /**是否住校*/
    @Column(name = "is_boarding")
    private String isBoarding;
    /** 原寝室ID*/
    @Column(name = "origin_dormitory_building_id")
    private String originDormitoryBuildingId;
    /**原寝室房间ID*/
    @Column(name = "dormitory_room_name")
    private String dormitoryRoomName;
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

    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getWealth() {
        return wealth;
    }
    public void setWealth(String wealth) {
        this.wealth = wealth;
    }

    public String getNativePlace() {
        return nativePlace;
    }
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getResidencePlace() {
        return residencePlace;
    }
    public void setResidencePlace(String residencePlace) {
        this.residencePlace = residencePlace;
    }

    public String getResidenceType() {
        return residenceType;
    }
    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getMember() {
        return member;
    }
    public void setMember(String member) {
        this.member = member;
    }

    public String getOriginClassId() {
        return originClassId;
    }
    public void setOriginClassId(String originClassId) {
        this.originClassId = originClassId;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getOriginGradeId() {
        return originGradeId;
    }
    public void setOriginGradeId(String originGradeId) {
        this.originGradeId = originGradeId;
    }

    public String getGradeName() {
        return gradeName;
    }
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getIsBoarding() {
        return isBoarding;
    }
    public void setIsBoarding(String isBoarding) {
        this.isBoarding = isBoarding;
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

    public String getDormitoryRoomName() {
        return dormitoryRoomName;
    }
    public void setDormitoryRoomName(String dormitoryRoomName) {
        this.dormitoryRoomName = dormitoryRoomName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdate=" + birthdate +
                ", nation='" + nation + '\'' +
                ", wealth='" + wealth + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", residencePlace='" + residencePlace + '\'' +
                ", residenceType='" + residenceType + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", member='" + member + '\'' +
                ", originClassId='" + originClassId + '\'' +
                ", className='" + className + '\'' +
                ", originGradeId='" + originGradeId + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", isBoarding='" + isBoarding + '\'' +
                ", originDormitoryBuildingId='" + originDormitoryBuildingId + '\'' +
                ", dormitoryRoomName='" + dormitoryRoomName + '\'' +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                '}';
    }
}