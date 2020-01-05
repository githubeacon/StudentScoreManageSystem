package com.beacon.sms.bean;
/**
 * 
 * 作者:beacon
 * 创建日期:2017年11月4日上午9:42:14
 * 描述:授课实体类
 */
public class Teaching
{
	private int id;				//授课关系id

	private Teacher teacher;	//教师

	private Class class1;		//班级

	private Semester semester;	//学期

	private Course course;		//课程

	@Override
	public String toString() {
		return "Teaching [id=" + id + ", teacher=" + teacher + ", class1="
				+ class1 + ", semester=" + semester + ", course=" + course + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Class getClass1() {
		return class1;
	}

	public void setClass1(Class class1) {
		this.class1 = class1;
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}