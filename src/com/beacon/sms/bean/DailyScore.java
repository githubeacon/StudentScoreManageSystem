package com.beacon.sms.bean;

/**
 * @see:
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-11 12:07
 */
public class DailyScore
{
    private int id;

    private Teaching teaching;		//授课老师

    private Student student;		//学生

    private int homeworkScore;      //作业分数

    private int attendanceScore;    //考勤分数

    private int experimentScore;    //实验分数

    private int totalScore;         //平时总成绩

    private int flag;				//状态，已登记或未登记

    public void setTotalScore(int homeworkScore, int attendanceScore, int experimentScore)
    {
        this.totalScore = homeworkScore + attendanceScore + experimentScore;
    }

    public int getHomeworkScore()
    {
        return homeworkScore;
    }

    public void setHomeworkScore(int homeworkScore)
    {
        this.homeworkScore = homeworkScore;
    }

    public int getAttendanceScore()
    {
        return attendanceScore;
    }

    public void setAttendanceScore(int attendanceScore)
    {
        this.attendanceScore = attendanceScore;
    }

    public int getExperimentScore()
    {
        return experimentScore;
    }

    public void setExperimentScore(int experimentScore)
    {
        this.experimentScore = experimentScore;
    }

    public int getTotalScore()
    {
        return totalScore;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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
