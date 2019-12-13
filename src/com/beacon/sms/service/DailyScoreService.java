package com.beacon.sms.service;

import com.beacon.sms.bean.DailyScore;
import com.beacon.sms.bean.ScoreSearchBean;

import java.util.List;

/**
 * @see: 处理关于平时成绩的逻辑类
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-11 16:19
 */
public interface DailyScoreService
{
    public List<DailyScore> getDailyScoreList(ScoreSearchBean scoreSearchBean);
    public int getDailyScoreListSize(ScoreSearchBean scoreSearchBean);
    public void updateDailyScore(DailyScore dailyScore);
}
