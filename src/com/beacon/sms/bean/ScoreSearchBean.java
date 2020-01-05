package com.beacon.sms.bean;
/**
 * 
 * 作者:beacon
 * 创建日期:2017年11月6日下午9:08:46
 * 描述:成绩查询实体类
 */
public class ScoreSearchBean extends PageBean
{

	private int semesterId;			//学期id

	private String className;		//班级名称

	private String courseName;		//课程名称

	private int flag;				//登记状态

	private int teacherId;			//教师id

	private int studentId;			//学生id

	private String teacherName;		//教师姓名

	private int order;				//排序；由低到高或由高到低

	@Override
	public String toString() {
		return super.toString()+"ScoreSearchBean [semesterId=" + semesterId
				+ ", className=" + className + ", courseName=" + courseName
				+ ", flag=" + flag + ", teacherId=" + teacherId + ", studentId="
				+ studentId + ", teacherName="
				+ teacherName + ", order=" + order + "]";
	}
	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(int semesterId) {
		this.semesterId = semesterId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
