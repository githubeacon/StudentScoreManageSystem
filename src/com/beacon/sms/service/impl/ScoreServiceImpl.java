package com.beacon.sms.service.impl;

import java.util.List;

import com.beacon.sms.bean.Score;
import com.beacon.sms.bean.ScoreSearchBean;
import com.beacon.sms.dao.ScoreDao;
import com.beacon.sms.service.ScoreService;

public class ScoreServiceImpl implements ScoreService
{
	private ScoreDao scoreDao;

	public ScoreDao getScoreDao() {
		return scoreDao;
	}

	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}

	public List<Score> getScoreList(ScoreSearchBean scoreSearchBean) {
		return scoreDao.getScoreListByTeacherId(scoreSearchBean);
	}

	public int getScoreListSize(ScoreSearchBean scoreSearchBean) {
		return scoreDao.getScoreListSizeByTeacherId(scoreSearchBean);
	}

	public void updateScore(Score score) {
		scoreDao.updateScore(score);
	}
}
