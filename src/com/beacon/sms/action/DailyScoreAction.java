package com.beacon.sms.action;

import com.alibaba.fastjson.JSON;
import com.beacon.sms.bean.*;
import com.beacon.sms.service.DailyScoreService;
import com.beacon.sms.service.ScoreService;
import com.beacon.sms.service.impl.ScoreServiceImpl;
import com.beacon.sms.utils.JsonUtil;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @see: 学生平时成绩Action
 * @program: StudentScoreManageSystem
 * @author: axxdllw
 * @create: 2019-12-11 16:17
 */
public class DailyScoreAction
{
    private DailyScoreService dailyScoreService;
    private DailyScore dailyScore;
    private ScoreSearchBean scoreSearchBean;

    private JsonUtil jsonUtil;
    private int page;
    private int rows;

    public DailyScoreService getDailyScoreService()
    {
        return dailyScoreService;
    }

    public void setDailyScoreService(DailyScoreService dailyScoreService)
    {
        this.dailyScoreService = dailyScoreService;
    }

    public DailyScore getDailyScore()
    {
        return dailyScore;
    }

    public void setDailyScore(DailyScore dailyScore)
    {
        this.dailyScore = dailyScore;
    }

    public ScoreSearchBean getScoreSearchBean() {
        return scoreSearchBean;
    }

    public void setScoreSearchBean(ScoreSearchBean scoreSearchBean) {
        this.scoreSearchBean = scoreSearchBean;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public JsonUtil getJsonUtil() {
        return jsonUtil;
    }

    public void setJsonUtil(JsonUtil jsonUtil) {
        this.jsonUtil = jsonUtil;
    }

    public void list()
    {
        scoreSearchBean.setPage(page);
        scoreSearchBean.setRows(rows);
        System.out.println(scoreSearchBean);

        List<DailyScore> list = dailyScoreService.getDailyScoreList(scoreSearchBean);

        int total = dailyScoreService.getDailyScoreListSize(scoreSearchBean);
        DatagridBean<DailyScore> datagridBean = new DatagridBean<DailyScore>();
        datagridBean.setRows(list);
        datagridBean.setTotal(total);

        String result = JSON.toJSONString(datagridBean);
        System.out.println(result);

        jsonUtil.writeJson(result);
    }

    public void init() {
        HttpSession session= ServletActionContext.getRequest().getSession();
        scoreSearchBean=new ScoreSearchBean();
        Admin admin=(Admin)session.getAttribute("user");
        int power=admin.getPower();
        if(power==3){
            //教师
            Teacher teacher=(Teacher) session.getAttribute("teacher");
            scoreSearchBean.setTeacherId(teacher.getId());
            scoreSearchBean.setStudentId(0);
            scoreSearchBean.setFlag(0);
        }else{
            scoreSearchBean.setFlag(1);
            scoreSearchBean.setTeacherId(0);
            if(power==1){
                //admin
                scoreSearchBean.setStudentId(0);
            }
            if(power==2){
                //学生
                Student student=(Student) session.getAttribute("student");
                scoreSearchBean.setStudentId(student.getId());
            }
        }
    }

    public void update()
    {
        System.out.println(dailyScore);
        dailyScoreService.updateDailyScore(dailyScore);
    }

    public void setDailyScoreService(ScoreServiceImpl dailyScoreService)
    {
    }
}
