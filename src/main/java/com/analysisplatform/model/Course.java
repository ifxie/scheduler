package com.analysisplatform.model;

import javax.persistence.*;

public class Course {
    /**ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**原班级ID*/
    @Column(name = "origin_class_id")
    private String originClassId;

    /**原科目ID*/
    @Column(name = "origin_subject_id")
    private String originSubjectId;

    /**原教师ID*/
    @Column(name = "origin_teacher_id")
    private String originTeacherId;

    /**原学期ID*/
    @Column(name = "origin_term_id")
    private String originTermId;

    /**班级名称*/
    @Column(name = "class_name")
    private String className;

    /**科目名称*/
    @Column(name = "subject_name")
    private String subjectName;

    /**教师名称*/
    @Column(name = "teacher_name")
    private String teacherName;

    /**原学校ID*/
    @Column(name = "origin_school_id")
    private String originSchoolId;

    /**原校区ID*/
    @Column(name = "origin_campus_id")
    private String originCampusId;

    @Column(name = "origin_grade_id")
    private String originGradeId;

    @Column(name = "grade_name")
    private String gradeName;

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
     * 获取班级名称
     *
     * @return class_name - 班级名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置班级名称
     *
     * @param className 班级名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取科目名称
     *
     * @return subject_name - 科目名称
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * 设置科目名称
     *
     * @param subjectName 科目名称
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    /**
     * 获取教师名称
     *
     * @return teacher_name - 教师名称
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置教师名称
     *
     * @param teacherName 教师名称
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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
     * @return origin_grade_id
     */
    public String getOriginGradeId() {
        return originGradeId;
    }

    /**
     * @param originGradeId
     */
    public void setOriginGradeId(String originGradeId) {
        this.originGradeId = originGradeId;
    }

    /**
     * @return grade_name
     */
    public String getGradeName() {
        return gradeName;
    }

    /**
     * @param gradeName
     */
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", originClassId='" + originClassId + '\'' +
                ", originSubjectId='" + originSubjectId + '\'' +
                ", originTeacherId='" + originTeacherId + '\'' +
                ", originTermId='" + originTermId + '\'' +
                ", className='" + className + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                ", originGradeId='" + originGradeId + '\'' +
                ", gradeName='" + gradeName + '\'' +
                '}';

    }


}