package com.beacon.sms.dao;

import com.beacon.sms.bean.Score;
import com.beacon.sms.bean.ScoreSearchBean;

import java.util.List;

/**
 * @see:
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-11 16:26
 */
public interface DailyScoreDao
{
    public void addScore(Score score);
    public List<Score> getScoreListByTeacherId(ScoreSearchBean scoreSearchBean);
    public int getScoreListSizeByTeacherId(ScoreSearchBean scoreSearchBean);
    public void updateScore(Score score);
    public void deleteScoreByTeachingId(int teachingId);
}
