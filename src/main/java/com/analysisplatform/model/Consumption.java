package com.analysisplatform.model;

import java.util.Date;
import javax.persistence.*;

public class Consumption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**原消费记录ID*/
    @Column(name = "origin_id")
    private String originId;

    /**交易时间*/
    @Column(name = "deal_time")
    private Date dealTime;

    /**原学生ID*/
    @Column(name = "origin_student_id")
    private String originStudentId;

    /**交易金额*/
    @Column(name = "deal_amount")
    private Double dealAmount;

    /**交易地点ID*/
    @Column(name = "deal_area_id")
    private String dealAreaId;

    /**账户余额*/
    @Column(name = "account_amount")
    private Double accountAmount;

    /**原学校ID*/
    @Column(name = "origin_school_id")
    private String originSchoolId;

    /**原校区ID*/
    @Column(name = "origin_campus_id")
    private String originCampusId;

    /**学生名称*/
    @Column(name = "student_name")
    private String studentName;

    /**学生性别*/
    @Column(name = "student_sex")
    private String studentSex;

    /**学生民族 */
    @Column(name = "student_naiton")
    private String studentNaiton;


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

    @Column(name = "is_boarding")
    private String isBoarding;

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

    public Date getDealTime() {
        return dealTime;
    }
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getOriginStudentId() {
        return originStudentId;
    }
    public void setOriginStudentId(String originStudentId) {
        this.originStudentId = originStudentId;
    }

    public Double getDealAmount() {
        return dealAmount;
    }
    public void setDealAmount(Double dealAmount) {
        this.dealAmount = dealAmount;
    }

    public String getDealAreaId() {
        return dealAreaId;
    }
    public void setDealAreaId(String dealAreaId) {
        this.dealAreaId = dealAreaId;
    }

    public Double getAccountAmount() {
        return accountAmount;
    }
    public void setAccountAmount(Double accountAmount) {
        this.accountAmount = accountAmount;
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

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }
    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentNaiton() {
        return studentNaiton;
    }
    public void setStudentNaiton(String studentNaiton) {
        this.studentNaiton = studentNaiton;
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

    @Override
    public String toString() {
        return "Consumption{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", dealTime=" + dealTime +
                ", originStudentId='" + originStudentId + '\'' +
                ", dealAmount=" + dealAmount +
                ", dealAreaId='" + dealAreaId + '\'' +
                ", accountAmount=" + accountAmount +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", studentNaiton='" + studentNaiton + '\'' +
                ", originClassId='" + originClassId + '\'' +
                ", className='" + className + '\'' +
                ", originGradeId='" + originGradeId + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", isBoarding='" + isBoarding + '\'' +
                '}';
    }
}