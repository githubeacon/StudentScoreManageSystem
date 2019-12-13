package com.beacon.sms.dao;

import com.beacon.sms.bean.DailyScore;
import com.beacon.sms.bean.ScoreSearchBean;

import java.util.List;

/**
 * @see: 平时成绩相关方法的接口
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-11 16:26
 */
public interface DailyScoreDao
{
    public void addDailyScore(DailyScore dailyScore);
    public List<DailyScore> getDailyScoreListByTeacherId(ScoreSearchBean scoreSearchBean);
    public int getDailyScoreListSizeByTeacherId(ScoreSearchBean scoreSearchBean);
    public void updateDailyScore(DailyScore dailyScore);
    public void deleteDailyScoreByTeachingId(int teachingId);
}
