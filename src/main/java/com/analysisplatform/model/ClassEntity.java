package com.analysisplatform.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "class")
public class ClassEntity {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 原班级ID
     */
    @Column(name = "origin_id")
    private String originId;

    /**
     * 班级名称
     */
    private String name;

    /**
     * 原教师ID
     */
    @Column(name = "origin_teacher_id")
    private String originTeacherId;

    /**
     * 原年级ID
     */
    @Column(name = "origin_grade_id")
    private String originGradeId;

    /**
     * 班级创建日期
     */
    private Date builddate;

    /**
     * 原学校ID
     */
    @Column(name = "origin_school_id")
    private String originSchoolId;

    /**
     * 原校区ID
     */
    @Column(name = "origin_campus_id")
    private String originCampusId;

    /**
     * 原学期ID
     */
    @Column(name = "origin_term_id")
    private String originTermId;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取原班级ID
     *
     * @return origin_id - 原班级ID
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * 设置原班级ID
     *
     * @param originId 原班级ID
     */
    public void setOriginId(String originId) {
        this.originId = originId;
    }

    /**
     * 获取班级名称
     *
     * @return name - 班级名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置班级名称
     *
     * @param name 班级名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取原教师ID
     *
     * @return origin_teacher_id - 原教师ID
     */
    public String getOriginTeacherId() {
        return originTeacherId;
    }

    /**
     * 设置原教师ID
     *
     * @param originTeacherId 原教师ID
     */
    public void setOriginTeacherId(String originTeacherId) {
        this.originTeacherId = originTeacherId;
    }

    /**
     * 获取原年级ID
     *
     * @return origin_grade_id - 原年级ID
     */
    public String getOriginGradeId() {
        return originGradeId;
    }

    /**
     * 设置原年级ID
     *
     * @param originGradeId 原年级ID
     */
    public void setOriginGradeId(String originGradeId) {
        this.originGradeId = originGradeId;
    }

    /**
     * 获取班级创建日期
     *
     * @return builddate - 班级创建日期
     */
    public Date getBuilddate() {
        return builddate;
    }

    /**
     * 设置班级创建日期
     *
     * @param builddate 班级创建日期
     */
    public void setBuilddate(Date builddate) {
        this.builddate = builddate;
    }

    /**
     * 获取原学校ID
     *
     * @return origin_school_id - 原学校ID
     */
    public String getOriginSchoolId() {
        return originSchoolId;
    }

    /**
     * 设置原学校ID
     *
     * @param originSchoolId 原学校ID
     */
    public void setOriginSchoolId(String originSchoolId) {
        this.originSchoolId = originSchoolId;
    }

    /**
     * 获取原校区ID
     *
     * @return origin_campus_id - 原校区ID
     */
    public String getOriginCampusId() {
        return originCampusId;
    }

    /**
     * 设置原校区ID
     *
     * @param originCampusId 原校区ID
     */
    public void setOriginCampusId(String originCampusId) {
        this.originCampusId = originCampusId;
    }

    /**
     * 获取原学期ID
     *
     * @return origin_term_id - 原学期ID
     */
    public String getOriginTermId() {
        return originTermId;
    }

    /**
     * 设置原学期ID
     *
     * @param originTermId 原学期ID
     */
    public void setOriginTermId(String originTermId) {
        this.originTermId = originTermId;
    }

    @Override
    public String toString() {
        return "ClassEntity{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", originTeacherId='" + originTeacherId + '\'' +
                ", originGradeId='" + originGradeId + '\'' +
                ", builddate=" + builddate +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                ", originTermId='" + originTermId + '\'' +
                '}';
    }
}