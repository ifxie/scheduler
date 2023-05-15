package com.aston.model;

import javax.persistence.*;

@Table(name = "tb_cron")
public class TbCron {
    /**
     * 动态定时任务时间表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 定时任务表达式
     */
    @Column(name = "cron_expression")
    private String cronExpression;

    /**
     * 描述
     */
    @Column(name = "cron_describe")
    private String cronDescribe;

    /**
     * 获取动态定时任务时间表
     *
     * @return id - 动态定时任务时间表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置动态定时任务时间表
     *
     * @param id 动态定时任务时间表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取定时任务表达式
     *
     * @return cron_expression - 定时任务表达式
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * 设置定时任务表达式
     *
     * @param cronExpression 定时任务表达式
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * 获取描述
     *
     * @return cron_describe - 描述
     */
    public String getCronDescribe() {
        return cronDescribe;
    }

    /**
     * 设置描述
     *
     * @param cronDescribe 描述
     */
    public void setCronDescribe(String cronDescribe) {
        this.cronDescribe = cronDescribe;
    }
}