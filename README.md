## 学生成绩考评系统操作说明书(2019.12版)

## 简介

本系统是一个学生成绩管理系统，系统相关人员使用本系统可实现学生平时及考试成绩录入、查询，学生和教师信息修改，授课分配等基础的教学成绩管理考评功能。

## 系统功能简介

> 系统分为成绩、用户、课程、系统四大主要管理模块。
>
> 角色分为学生、教师、管理员三种，各类用户经登录认证后方可使用系统。

### 成绩管理模块

- 任课老师能根据学生平时的考勤情况、作业、实验情况完成学生平时成绩的评定；
- 任课老师需将课程考试成绩录入系统，获得学生的考试成绩；
- 管理员能为课程设置要求的评分比率，将学生的平时成绩与考试成绩进行计算，得出课程总评成绩，并进行相关的统计查询；
- 管理员和教师可根据筛选条件导出成绩（教师平时成绩的导出未实现）；

### 用户管理模块

- 管理员能学生、教师的信息数据进行相应的管理（增加、修改、删除、查询）
- 管理员能批量录入学生、教师的信息数据；
- 管理员能按学期班级给教师分配所授课程；
- 学生和教师可看到自己的相关信息，但无法修改；
- 教师可看到自己教授的所有的课程信息，只能对自己所教授课程的成绩进行考评；
- 学生只能看到自己的学习成绩。

### 课程管理模块

- 管理员根据教学大纲设置课程的相关信息（学期，学分，性质，平时成绩考试成绩权重）
- 学生根据兴趣选择想选修的课程（未实现）

### 系统管理模块

- 管理员能根据学院专业信息添加班级；
- 可在后台设置用户的权限

## 使用技术

- 前端：EasyUI
- 后端：Struts2、Mybatis、Spring框架
- 数据库：MySQL

## 快速上手

### 1、运行环境和所需工具

以下适用于此版本（2019.12）

- 编译器：IntelliJ IDEA 2019.2.3
- 数据库：MySQL
- JDK版本：JDK1.8
- Tomcat版本：Tomcat9.0.26

### 2、初始化项目

#### 1、IDEA使用者

- 在MySQL数据库中导入项目中doc文件夹下的db_new.sql文件，配置数据库
- 进入src/修改db.properties配置文件,将数据库登录名和密码、驱动、URL改为用户本地的
- 在IDEA中导入项目
- 配置Tomcat
- 运行

#### 2、 Tomcat使用者

-  将db_new.sql导入到你的MySQL数据库中

-  进入项目out/artifacts/sms1_war目录，将sms1.war放进你的tomcat安装目录下的webapps文件夹下，之后启动tomcat即可 

#### 3、项目部署须知

​    1）账号密码请查数据库中admin表，列power代表权限，1代表管理员，2代表学生，3代表教师 ；

​    2）管理员添加学生，教师会自动生成学号/职工号，并将登录账号、密码、权限添加到admin表中,初始化密码为学号/职工号 ；

​	3）导入文件应该符合相对应的student.xls/teacher.xls格式 ；

​	4）如果遇到乱码错误请检查自己的数据库及Tomcat编码设置。

## 程序运行截图示例

登陆界面：

![image-20191229004508534](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\登录界面.png)

管理员界面：

1）主页

![image-20191229004741807](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\管理员主页.png)

2）学生管理

![image-20191229005017962](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\学生管理.png)

3）教师管理

![image-20191229005049608](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\教师管理.png)

4）课程管理

![image-20191229005110087](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\课程管理)

5）授课管理

![image-20191229005129169](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\授课管理)

6）成绩管理

![image-20191229005155096](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\管理员成绩管理.png)

学生界面：

1）主页

![image-20191229005700029](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\学生主页.png)

2）个人信息

![image-20191229005629797](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\学生个人信息.png)

3）学生成绩

![image-20191229005722154](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\学生成绩.png)

教师界面：

1）主页

![image-20191229005402219](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\教师主页.png)

2）授课信息

![image-20191229005339179](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\教师个人信息.png)

3）平时成绩管理

![image-20191229005451551](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\平时成绩管理.png)

4）考试成绩管理

![image-20191229005509116](D:\SpringBootPractice\StudentScoreManageSystem\doc\运行截图\考试成绩管理.png)