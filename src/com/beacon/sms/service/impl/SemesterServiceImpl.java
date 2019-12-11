package com.beacon.sms.service.impl;

import java.util.List;

import com.beacon.sms.bean.Semester;
import com.beacon.sms.dao.SemesterDao;
import com.beacon.sms.service.SemesterService;

public class SemesterServiceImpl implements SemesterService
{
	private SemesterDao semesterDao;

	public SemesterDao getSemesterDao() {
		return semesterDao;
	}

	public void setSemesterDao(SemesterDao semesterDao) {
		this.semesterDao = semesterDao;
	}

	public List<Semester> getSemesterList() {
		return semesterDao.getSemesterList();
	}
}
