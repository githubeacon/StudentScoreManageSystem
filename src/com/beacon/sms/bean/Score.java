package com.beacon.sms.bean;
/**
 * 
 * 作者:beacon
 * 创建日期:2017年11月6日上午9:35:48
 * 描述:成绩实体类
 */
public class Score
{
	private int id;					//id

	private Teaching teaching;		//授课老师

	private Student student;		//学生

	private int score;				//考试分数，为了方便，此处不再更名

	private DailyScore dailyScore;	//平时成绩

	private int finalScore;			//最终成绩

	private int flag;				//状态，已登记或未登记

	@Override
	public String toString()
	{
		return "Score{" + "id=" + id + ", teaching=" + teaching
				+ ", student=" + student + ", score=" + score
				+ ", dailyScore=" + dailyScore + ", finalScore="
				+ finalScore + ", flag=" + flag + '}';
	}

	public DailyScore getDailyScore()
	{
		return dailyScore;
	}

	public void setDailyScore(DailyScore dailyScore)
	{
		this.dailyScore = dailyScore;
	}

	public int getFinalScore()
	{
		return finalScore;
	}

	public void setFinalScore(int dailyScore, int testScore)
	{
		this.finalScore = (dailyScore + testScore) / 2;
	}

	public Teaching getTeaching() {
		return teaching;
	}

	public void setTeaching(Teaching teaching) {
		this.teaching = teaching;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}
