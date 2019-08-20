package com.braisedpanda.shirotest.bean.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class StudentGradesCustom implements Serializable {

    /**
     * 学生成绩信息表
     */

    private String stuId;
    private String stuName;
    private String classId;
    private String testDescribe;
    private String testTime;
    private double total;
    private double average;
    private double maxScore;
    private double minScore;
    private double chinese;
    private double mathematics;
    private double english;
    private double politics;
    private double history;
    private double geography;
    private double biology;
    private double chemistry;
    private double physics;
    private double music;
    private double arts;
    private double sports;


}
