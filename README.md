# StudentScoreManageSystem
---
   
## 一个前端基于easyui框架，后端基于Struts2、Mybatis、Spring框架的学生成绩管理系统

	使用该项目的麻烦点下右上角的***star***，感激不尽。
## 系统功能简述  

- 学生成绩管理系统中，系统的用户是学校的学生、教师和管理员。各类用户经登录认证后方可使用系统。
- 学生使用本系统可以查询自己的信息和成绩。
- 教师使用本系统查询个人信息、查询自己所授课程信息和自己所授课程考试成绩。
- 管理员可以添加班级，学生的增删改查，教师的增删改查，课程的增删改查，授课的增删改查和查询教师已经批改成绩的成绩信息。(所有查询均支持多条件查询,支持导入学生教师信息/导出成绩信息)   

## 使用注意事项  

- Eclipse使用者：在Eclipse直接导入解压后的整个文件夹即可,
- Tomcat使用者：只需将sms1.war放进你的tomcat目录下的webapps文件夹下面，然后启动tomcat即可.   
- 完成上述步骤其一,将db.sql导入到你的数据库.  
- 然后进入applicationContext.xml文件将bean的id为dataSource下的用户名，密码，数据库名改为你自己的数据库相对应的.  
- 登录账号密码自行查admin表，列power代表权限，1代表管理员，2代表学生，3代表教师
- 管理员添加学生，教师会自动生成学号/职工号，并将登录账号、密码、权限添加到admin表中,初始化密码为学号/职工号.
- 导入文件要符合相对应的student.xls/teacher.xls格式.     

## 程序截图如下:  

#### 1.登录界面:
![](https://i.imgur.com/cO7dAD2.png)
#### 2.管理员界面:  
##### 1)主页
![](https://i.imgur.com/r9QJDiB.png)
##### 2)学生管理
![](https://i.imgur.com/MDdVJz6.png)
##### 3)教师管理
![](https://i.imgur.com/Tl8CQv3.png)
##### 4)课程管理
![](https://i.imgur.com/HXFcowy.png)
##### 5)授课管理
![](https://i.imgur.com/1U2SJCK.png)
##### 6)成绩管理
![](https://i.imgur.com/3UYuwiz.png)
#### 3.学生界面:  
##### 1)主页
![](https://i.imgur.com/1LkNvgs.png)
##### 2)学生信息
![](https://i.imgur.com/UOAa96v.png)
##### 3)学生成绩
![](https://i.imgur.com/bDv9xYZ.png)
#### 4.教师界面:  
##### 1)主页
![](https://i.imgur.com/zfs4NpJ.png)
##### 2)教师信息
![](https://i.imgur.com/G8Hi3hO.png)
##### 3)教师课程
![](https://i.imgur.com/jLAJCw4.png)
##### 4)教师成绩管理
![](https://i.imgur.com/T7ddQ3y.png)
