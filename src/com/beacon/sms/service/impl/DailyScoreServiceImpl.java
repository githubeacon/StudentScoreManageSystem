package com.beacon.sms.service.impl;

import com.beacon.sms.bean.DailyScore;
import com.beacon.sms.bean.Score;
import com.beacon.sms.bean.ScoreSearchBean;
import com.beacon.sms.dao.DailyScoreDao;
import com.beacon.sms.service.DailyScoreService;

import java.util.List;

/**
 * @see:
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-11 16:32
 */
public class DailyScoreServiceImpl implements DailyScoreService
{
    private DailyScoreDao dailyScoreDao;

    public List<DailyScore> getDailyScoreList(ScoreSearchBean scoreSearchBean) {
        return dailyScoreDao.getDailyScoreListByTeacherId(scoreSearchBean);
    }

    public int getDailyScoreListSize(ScoreSearchBean scoreSearchBean) {
        return dailyScoreDao.getDailyScoreListSizeByTeacherId(scoreSearchBean);
    }

    public void updateDailyScore(DailyScore dailyScore) {
        dailyScoreDao.updateDailyScore(dailyScore);
    }

    public DailyScoreDao getDailyScoreDao()
    {
        return dailyScoreDao;
    }

    public void setDailyScoreDao(DailyScoreDao dailyScoreDao)
    {
        this.dailyScoreDao = dailyScoreDao;
    }
}
