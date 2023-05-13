package com.analysisplatform.model;

import javax.persistence.*;

public class Score {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**原测试ID*/
    @Column(name = "origin_test_id")
    private String originTestId;
    /**测试日期*/

    @Column(name = "date")
    private String date;
    /**原学生ID*/
    @Column(name = "origin_student_id")
    private String originStudentId;

    /**
     * 学生姓名
     */
    @Column(name = "student_name")
    private String studentName;

    /**
     * 原班级ID
     */
    @Column(name = "origin_class_id")
    private String originClassId;

    /**
     * 班级名称
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 原年级ID
     */
    @Column(name = "origin_grade_id")
    private String originGradeId;

    /**
     * 年级名称
     */
    @Column(name = "grade_name")
    private String gradeName;

    /**
     * 原始成绩
     */
    private Double score;

    @Column(name = "z_score")
    private Double zScore;

    @Column(name = "t_score")
    private Double tScore;

    private Double level;

    /**
     * 原科目ID
     */
    @Column(name = "origin_subject_id")
    private String originSubjectId;

    /**
     * 科目名称
     */
    @Column(name = "subject_name")
    private String subjectName;

    /**
     * 原考核ID
     */
    @Column(name = "origin_exam_id")
    private String originExamId;

    /**
     * 考核名称
     */
    @Column(name = "exam_name")
    private String examName;

    /**
     * 原学期ID
     */
    @Column(name = "origin_term_id")
    private String originTermId;

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
     * 原教师ID
     */
    @Column(name = "origin_teacher_id")
    private String originTeacherId;

    /**
     * 教师名称
     */
    @Column(name = "teacher_name")
    private String teacherName;

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
     * @return origin_test_id - 原测试ID
     */
    public String getOriginTestId() {
        return originTestId;
    }

    /**
     * 设置原测试ID
     *
     * @param originTestId 原测试ID
     */
    public void setOriginTestId(String originTestId) {
        this.originTestId = originTestId;
    }

    /**
     * 获取原学生ID
     *
     * @return origin_student_id - 原学生ID
     */
    public String getOriginStudentId() {
        return originStudentId;
    }

    /**
     * 设置原学生ID
     *
     * @param originStudentId 原学生ID
     */
    public void setOriginStudentId(String originStudentId) {
        this.originStudentId = originStudentId;
    }

    /**
     * 获取学生姓名
     *
     * @return student_name - 学生姓名
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * 设置学生姓名
     *
     * @param studentName 学生姓名
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
     * 获取年级名称
     *
     * @return grade_name - 年级名称
     */
    public String getGradeName() {
        return gradeName;
    }

    /**
     * 设置年级名称
     *
     * @param gradeName 年级名称
     */
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    /**
     * 获取原始成绩
     *
     * @return score - 原始成绩
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置原始成绩
     *
     * @param score 原始成绩
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * @return z_score
     */
    public Double getzScore() {
        return zScore;
    }

    /**
     * @param zScore
     */
    public void setzScore(Double zScore) {
        this.zScore = zScore;
    }

    /**
     * @return t_score
     */
    public Double gettScore() {
        return tScore;
    }

    /**
     * @param tScore
     */
    public void settScore(Double tScore) {
        this.tScore = tScore;
    }

    /**
     * @return level
     */
    public Double getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Double level) {
        this.level = level;
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
     * 获取考核名称
     *
     * @return exam_name - 考核名称
     */
    public String getExamName() {
        return examName;
    }

    /**
     * 设置考核名称
     *
     * @param examName 考核名称
     */
    public void setExamName(String examName) {
        this.examName = examName;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}