package com.beacon.sms.bean;

/**
 * 课程查询
 */
public class CourseSearchBean extends PageBean
{
	private String name;	//课程名

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return super.toString()+"CourseSearchBean [name=" + name + "]";
	}
}
