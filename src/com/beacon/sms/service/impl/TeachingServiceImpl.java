package com.beacon.sms.service.impl;

import java.util.List;

import com.beacon.sms.bean.*;
import com.beacon.sms.dao.DailyScoreDao;
import com.beacon.sms.dao.ScoreDao;
import com.beacon.sms.dao.StudentDao;
import com.beacon.sms.dao.TeachingDao;
import com.beacon.sms.service.TeachingService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeachingServiceImpl implements TeachingService
{
	private TeachingDao teachingDao;
	private StudentDao studentDao;
	private ScoreDao scoreDao;
	@Autowired
	private DailyScoreDao dailyScoreDao;

	public DailyScoreDao getDailyScoreDao()
	{
		return dailyScoreDao;
	}

	public void setDailyScoreDao(DailyScoreDao dailyScoreDao)
	{
		this.dailyScoreDao = dailyScoreDao;
	}

	public ScoreDao getScoreDao() {
		return scoreDao;
	}

	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public TeachingDao getTeachingDao() {
		return teachingDao;
	}

	public void setTeachingDao(TeachingDao teachingDao) {
		this.teachingDao = teachingDao;
	}

	public List<Teaching> getTeachingList(TeachingSearchBean teachingSearchBean){
		return teachingDao.getTeachingList(teachingSearchBean); 
	}
	
	public int getTeachingListSize(TeachingSearchBean teachingSearchBean){
		return teachingDao.getTeachingListSize(teachingSearchBean);
	}
	public void addTeaching(Teaching teaching){
		teachingDao.addTeaching(teaching);
		addScore(teaching);
		addDailyScore(teaching);
	}
	public void updateTeaching(Teaching teaching){
		teachingDao.updateTeaching(teaching);
		scoreDao.deleteScoreByTeachingId(teaching.getId());
		dailyScoreDao.deleteDailyScoreByTeachingId(teaching.getId());
		addScore(teaching);
	    addDailyScore(teaching);
	}

	//初始化考试成绩，默认全为0
	public void addScore(Teaching teaching) {
		List<Integer> list=studentDao.getListOfStudentIdByClassId(teaching.getClass1().getId());
		for(int i=0;i<list.size();i++){
			Score score=new Score();
			Student student=new Student();
			student.setId(list.get(i));
			score.setStudent(student);
			score.setTeaching(teaching);
			score.setScore(0);
			score.setFlag(2);
			System.out.println(score);
			scoreDao.addScore(score);
		}
	}
	//初始化平时成绩，默认全为0
	public void addDailyScore(Teaching teaching)
	{
		List<Integer> list = studentDao.getListOfStudentIdByClassId(teaching.getClass1().getId());
		for(int i = 0;i < list.size(); i++){
			DailyScore dailyScore=new DailyScore();
			Student student=new Student();
			student.setId(list.get(i));
			dailyScore.setStudent(student);
			dailyScore.setTeaching(teaching);
			dailyScore.setHomeworkScore(0);
			dailyScore.setAttendanceScore(0);
			dailyScore.setExperimentScore(0);
			dailyScore.setTotalScore(0,0,0);
			dailyScore.setFlag(2);
			System.out.println(dailyScore);
			dailyScoreDao.addDailyScore(dailyScore);
		}
	}

	public void deleteTeaching(List<Integer> ids){
		for(int i=0;i<ids.size();i++){
			int teachingId=ids.get(i);
			teachingDao.deleteTeaching(teachingId);
			System.out.println(teachingId);
			scoreDao.deleteScoreByTeachingId(teachingId);
			dailyScoreDao.deleteDailyScoreByTeachingId(teachingId);
		}
	}
	public List<Teaching> getTeachingByTeacherId(TeachingSearchBean teachingSearchBean){
		return teachingDao.getTeachingByTeacherId(teachingSearchBean);
	}
	public int getTeachingByTeacherIdSize(TeachingSearchBean teachingSearchBean){
		return teachingDao.getTeachingByTeacherIdSize(teachingSearchBean);
	}
}
