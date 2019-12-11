package com.beacon.sms.bean;
/**
 * 
 * 作者:beacon
 * 创建日期:2017年10月31日下午5:29:12
 * 描述:教师实体类
 */
public class Teacher
{
	private int id;					//教师id

	private String teacherNo;		//教师工号

	private String teacherName;		//姓名

	private String cellphone;		//电话

	private String sex;				//性别

	private String birthday;		//生日

	private Department department;	//所属学院

	private String education;		//学历

	private Address address;		//住址

	private String idCard;			//身份证

	private String voucher;			//密码找回码

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherNo=" + teacherNo + ", teacherName=" + teacherName + ", cellphone="
				+ cellphone + ", sex=" + sex + ", birthday=" + birthday + ", department=" + department + ", education="
				+ education + ", address=" + address + ", idCard=" + idCard + ", voucher=" + voucher + "]";
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
