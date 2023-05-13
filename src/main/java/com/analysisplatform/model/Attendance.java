package com.analysisplatform.model;

import java.util.Date;
import javax.persistence.*;

public class Attendance {
    /**ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**原考勤记录ID*/
    @Column(name = "origin_id")
    private String originId;

    /**原学生ID*/
    @Column(name = "origin_student_id")
    private String originStudentId;

    /**日期*/
    private Date date;

    /**
     * 进校考勤
     */
    @Column(name = "in_status")
    private Integer inStatus;

    /**
     * 离校考勤
     */
    @Column(name = "out_status")
    private Integer outStatus;

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
     * 迟到时长
     */
    @Column(name = "late_minute")
    private Integer lateMinute;

    /**
     * 早退时长
     */
    @Column(name = "early_minute")
    private Integer earlyMinute;

    /**
     * 进校实际时间
     */
    @Column(name = "in_time")
    private Date inTime;

    /**
     * 进校规定时间
     */
    @Column(name = "in_attend_time")
    private Date inAttendTime;

    /**
     * 离校实际时间
     */
    @Column(name = "out_time")
    private Date outTime;

    /**
     * 离校规定时间
     */
    @Column(name = "out_attend_time")
    private Date outAttendTime;

    /**
     * 假期
     */
    @Column(name = "is_rest")
    private Boolean isRest;

    /**
     * 进校考勤备注
     */
    @Column(name = "in_remark")
    private String inRemark;

    /**
     * 离校考勤备注
     */
    @Column(name = "out_remark")
    private String outRemark;

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
     * 获取原考勤记录ID
     *
     * @return origin_id - 原考勤记录ID
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * 设置原考勤记录ID
     *
     * @param originId 原考勤记录ID
     */
    public void setOriginId(String originId) {
        this.originId = originId;
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
     * 获取进校考勤
     *
     * @return in_status - 进校考勤
     */
    public Integer getInStatus() {
        return inStatus;
    }

    /**
     * 设置进校考勤
     *
     * @param inStatus 进校考勤
     */
    public void setInStatus(Integer inStatus) {
        this.inStatus = inStatus;
    }

    /**
     * 获取离校考勤
     *
     * @return out_status - 离校考勤
     */
    public Integer getOutStatus() {
        return outStatus;
    }

    /**
     * 设置离校考勤
     *
     * @param outStatus 离校考勤
     */
    public void setOutStatus(Integer outStatus) {
        this.outStatus = outStatus;
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
     * 获取迟到时长
     *
     * @return late_minute - 迟到时长
     */
    public Integer getLateMinute() {
        return lateMinute;
    }

    /**
     * 设置迟到时长
     *
     * @param lateMinute 迟到时长
     */
    public void setLateMinute(Integer lateMinute) {
        this.lateMinute = lateMinute;
    }

    /**
     * 获取早退时长
     *
     * @return early_minute - 早退时长
     */
    public Integer getEarlyMinute() {
        return earlyMinute;
    }

    /**
     * 设置早退时长
     *
     * @param earlyMinute 早退时长
     */
    public void setEarlyMinute(Integer earlyMinute) {
        this.earlyMinute = earlyMinute;
    }

    /**
     * 获取进校实际时间
     *
     * @return in_time - 进校实际时间
     */
    public Date getInTime() {
        return inTime;
    }

    /**
     * 设置进校实际时间
     *
     * @param inTime 进校实际时间
     */
    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    /**
     * 获取进校规定时间
     *
     * @return in_attend_time - 进校规定时间
     */
    public Date getInAttendTime() {
        return inAttendTime;
    }

    /**
     * 设置进校规定时间
     *
     * @param inAttendTime 进校规定时间
     */
    public void setInAttendTime(Date inAttendTime) {
        this.inAttendTime = inAttendTime;
    }

    /**
     * 获取离校实际时间
     *
     * @return out_time - 离校实际时间
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * 设置离校实际时间
     *
     * @param outTime 离校实际时间
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * 获取离校规定时间
     *
     * @return out_attend_time - 离校规定时间
     */
    public Date getOutAttendTime() {
        return outAttendTime;
    }

    /**
     * 设置离校规定时间
     *
     * @param outAttendTime 离校规定时间
     */
    public void setOutAttendTime(Date outAttendTime) {
        this.outAttendTime = outAttendTime;
    }

    /**
     * 获取假期
     *
     * @return is_rest - 假期
     */
    public Boolean getIsRest() {
        return isRest;
    }

    /**
     * 设置假期
     *
     * @param isRest 假期
     */
    public void setIsRest(Boolean isRest) {
        this.isRest = isRest;
    }

    /**
     * 获取进校考勤备注
     *
     * @return in_remark - 进校考勤备注
     */
    public String getInRemark() {
        return inRemark;
    }

    /**
     * 设置进校考勤备注
     *
     * @param inRemark 进校考勤备注
     */
    public void setInRemark(String inRemark) {
        this.inRemark = inRemark;
    }

    /**
     * 获取离校考勤备注
     *
     * @return out_remark - 离校考勤备注
     */
    public String getOutRemark() {
        return outRemark;
    }

    /**
     * 设置离校考勤备注
     *
     * @param outRemark 离校考勤备注
     */
    public void setOutRemark(String outRemark) {
        this.outRemark = outRemark;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", originStudentId='" + originStudentId + '\'' +
                ", date=" + date +
                ", inStatus=" + inStatus +
                ", outStatus=" + outStatus +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                ", lateMinute=" + lateMinute +
                ", earlyMinute=" + earlyMinute +
                ", inTime=" + inTime +
                ", inAttendTime=" + inAttendTime +
                ", outTime=" + outTime +
                ", outAttendTime=" + outAttendTime +
                ", isRest=" + isRest +
                ", inRemark='" + inRemark + '\'' +
                ", outRemark='" + outRemark + '\'' +
                '}';
    }
}