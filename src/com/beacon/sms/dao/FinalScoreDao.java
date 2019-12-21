package com.beacon.sms.dao;

import com.beacon.sms.bean.DailyScore;
import com.beacon.sms.bean.FinalScore;
import com.beacon.sms.bean.ScoreSearchBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @see:
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-21 15:41
 */
@Repository
public interface FinalScoreDao
{
    public void addFinalScore(FinalScore finalScore);
    public List<DailyScore> getFinalScoreListByTeacherId(ScoreSearchBean scoreSearchBean);
    public int getFinalScoreListSizeByTeacherId(ScoreSearchBean scoreSearchBean);
    public void updateFinalScore(FinalScore finalScore);
    public void deleteFinalScoreByTeachingId(int teachingId);
}
