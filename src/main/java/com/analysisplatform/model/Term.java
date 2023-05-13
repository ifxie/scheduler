package com.analysisplatform.model;

import java.util.Date;
import javax.persistence.*;

public class Term {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 原学期ID
     */
    @Column(name = "origin_id")
    private String originId;

    /**
     * 学期名称
     */
    private String name;

    /**
     * 学期开始日期
     */
    private Date start;

    /**
     * 学期结束日期
     */
    private Date end;

    /**
     * 下学期开始日期
     */
    private Date next;

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
     * 获取原学期ID
     *
     * @return origin_id - 原学期ID
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * 设置原学期ID
     *
     * @param originId 原学期ID
     */
    public void setOriginId(String originId) {
        this.originId = originId;
    }

    /**
     * 获取学期名称
     *
     * @return name - 学期名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学期名称
     *
     * @param name 学期名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学期开始日期
     *
     * @return start - 学期开始日期
     */
    public Date getStart() {
        return start;
    }

    /**
     * 设置学期开始日期
     *
     * @param start 学期开始日期
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * 获取学期结束日期
     *
     * @return end - 学期结束日期
     */
    public Date getEnd() {
        return end;
    }

    /**
     * 设置学期结束日期
     *
     * @param end 学期结束日期
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * 获取下学期开始日期
     *
     * @return next - 下学期开始日期
     */
    public Date getNext() {
        return next;
    }

    /**
     * 设置下学期开始日期
     *
     * @param next 下学期开始日期
     */
    public void setNext(Date next) {
        this.next = next;
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
        return "Term{" +
                "id=" + id +
                ", originId='" + originId + '\'' +
                ", name='" + name + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", next=" + next +
                ", originSchoolId='" + originSchoolId + '\'' +
                ", originCampusId='" + originCampusId + '\'' +
                '}';
    }
}