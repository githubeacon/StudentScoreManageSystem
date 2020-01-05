package com.beacon.sms.bean;

import java.math.BigDecimal;

/**
 * 
 * 作者:beacon
 * 创建日期:2017年10月31日下午9:08:12
 * 描述:课程实体类
 */
public class Course
{
	private int id;					//课程id

	private String courseName;		//课程名称

	private int credit;				//学分

	private int courseTime;			//学时

	private String type;			//类型；选修或必修

	private BigDecimal weight;		//权重

	@Override
	public String toString()
	{
		return "Course{" + "id=" + id + ", courseName='" + courseName + '\''
				+ ", credit=" + credit + ", courseTime=" + courseTime + ", type='"
				+ type + '\'' + ", weight=" + weight + '}';
	}

	public BigDecimal getWeight()
	{
		return weight;
	}

	public void setWeight(BigDecimal weight)
	{
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(int courseTime) {
		this.courseTime = courseTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
