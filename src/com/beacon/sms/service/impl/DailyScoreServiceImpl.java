package com.beacon.sms.service.impl;

import com.beacon.sms.bean.Score;
import com.beacon.sms.bean.ScoreSearchBean;
import com.beacon.sms.dao.ScoreDao;
import com.beacon.sms.service.DailyScoreService;
import org.mybatis.spring.mapper.MapperFactoryBean;

import java.util.List;

/**
 * @see:
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-11 16:32
 */
public class DailyScoreServiceImpl implements DailyScoreService
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

    public void setDailyScoreDao(MapperFactoryBean dailyScoreDao)
    {
    }
}
