package com.analysisplatform.model;

import java.util.Date;
import javax.persistence.*;

public class Test {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 原测试ID
     */
    @Column(name = "origin_id")
    private String originId;

    /**
     * 日期
     */
    private Date date;

    /**
     * 原考核ID
     */
    @Column(name = "origin_exam_id")
    private String originExamId;

    /**
     * 原学期ID
     */
    @Column(name = "origin_term_id")
    private String originTermId;

    /**
     * 原科目ID
     */
    @Column(name = "origin_subject_id")
    private String originSubjectId;

    /**
     * 原班级ID
     */
    @Column(name = "origin_class_id")
    private String originClassId;

    /**
     * 原年级ID
     */
    @Column(name = "origin_grade_id")
    private String originGradeId;

    /**
     * 分制
     */
    @Column(name = "full_score")
    private Integer fullScore;

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
     * 获取原测试ID
     *
     * @return origin_id - 原测试ID
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * 设置原测试ID
     *
     * @param originId 原测试ID
     */
    public void setOriginId(String originId) {
        this.originId = originId;
    }

    /**
     * 获取日期
     *
     * @return date - 日期
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置日期
     *
     * @param date 日期
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取原考核ID
     *
     * @return origin_exam_id - 原考核ID
     */
    public String getOriginExamId() {
        return originExamId;
    }

    /**
     * 设置原考核ID
     *
     * @param originExamId 原考核ID
     */
    public void setOriginExamId(String originExamId) {
        this.originExamId = originExamId;
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

    /**
     * 获取原科目ID
     *
     * @return origin_subject_id - 原科目ID
     */
    public String getOriginSubjectId() {
        return originSubjectId;
    }

    /**
     * 设置原科目ID
     *
     * @param originSubjectId 原科目ID
     */
    public void setOriginSubjectId(String originSubjectId) {
        this.originSubjectId = originSubjectId;
    }

    /**
     * 获取原班级ID
     *
     * @return origin_class_id - 原班级ID
     */
    public String getOriginClassId() {
        return originClassId;
    }

    /**
     * 设置原班级ID
     *
     * @param originClassId 原班级ID
     */
    public void setOriginClassId(String originClassId) {
        this.originClassId = originClassId;
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
     * 获取分制
     *
     * @return full_score - 分制
     */
    public Integer getFullScore() {
        return fullScore;
    }

    /**
     * 设置分制
     *
     * @param fullScore 分制
     */
    public void setFullScore(Integer fullScore) {
        this.fullScore = fullScore;
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

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", date=" + date +
                ", originExamId='" + originExamId + '\'' +
                ", originTermId='" + originTermId + '\'' +
                ", originSubjectId='" + originSubjectId + '\'' +
                ", originClassId='" + originClassId + '\'' +
                ", originGradeId='" + originGradeId + '\'' +
                ", fullScore=" + fullScore +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                '}';
    }
}