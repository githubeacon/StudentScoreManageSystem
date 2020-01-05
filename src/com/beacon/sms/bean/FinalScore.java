package com.beacon.sms.bean;

import org.mybatis.spring.mapper.MapperFactoryBean;

/**
 * @see:
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-21 15:34
 */
public class FinalScore
{
    private int id;

    private int studentId;

    private DailyScore dailyScore;

    private Score testScore;

    private int finalScore;

    private Teaching teaching;		//授课老师

    private Student student;		//学生

    private int flag;

    private int weight;             //权重


    public int getFinalScore()
    {
        return finalScore;
    }

    public void setFinalScore(int finalScore)
    {
        this.finalScore = finalScore;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public DailyScore getDailyScore()
    {
        return dailyScore;
    }

    public void setDailyScore(DailyScore dailyScore)
    {
        this.dailyScore = dailyScore;
    }

    public Score getTestScore()
    {
        return testScore;
    }

    public void setTestScore(Score testScore)
    {
        this.testScore = testScore;
    }

    public Teaching getTeaching()
    {
        return teaching;
    }

    public void setTeaching(Teaching teaching)
    {
        this.teaching = teaching;
    }

    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student)
    {
        this.student = student;
    }

    public int getFlag()
    {
        return flag;
    }

    public void setFlag(int flag)
    {
        this.flag = flag;
    }
}
