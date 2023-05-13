package com.analysisplatform.model;

import java.util.Date;
import javax.persistence.*;

public class
Exam {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 原考核ID
     */
    @Column(name = "origin_id")
    private String originId;

    /**
     * 考核名称
     */
    private String name;

    /**
     * 原学期ID
     */
    @Column(name = "origin_term_id")
    private String originTermId;

    /**
     * 考核类型ID
     */
    @Column(name = "origin_type_id")
    private String originTypeId;

    /**
     * 考核开始日期
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 考核结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

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
     * 获取原考核ID
     *
     * @return origin_id - 原考核ID
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * 设置原考核ID
     *
     * @param originId 原考核ID
     */
    public void setOriginId(String originId) {
        this.originId = originId;
    }

    /**
     * 获取考核名称
     *
     * @return name - 考核名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置考核名称
     *
     * @param name 考核名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取考核类型ID
     *
     * @return origin_type_id - 考核类型ID
     */
    public String getOriginTypeId() {
        return originTypeId;
    }

    /**
     * 设置考核类型ID
     *
     * @param originTypeId 考核类型ID
     */
    public void setOriginTypeId(String originTypeId) {
        this.originTypeId = originTypeId;
    }

    /**
     * 获取考核开始日期
     *
     * @return start_date - 考核开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置考核开始日期
     *
     * @param startDate 考核开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取考核结束日期
     *
     * @return end_date - 考核结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置考核结束日期
     *
     * @param endDate 考核结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
        return "Exam{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", originTermId='" + originTermId + '\'' +
                ", originTypeId='" + originTypeId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                '}';
    }
}