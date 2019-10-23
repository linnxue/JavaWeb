
### 题目：客户管理
1. 语言和环境

- A、实现语言：Java 
- B、实现技术：JSP 、Servlet 
- C、环境要求：Eclipse、Tomcat 6.0、oracle 

2. 题目要求  
实现用户注册功能 ，登录功能，浏览功能，添加修改删除用户功能。  
功能设计要求：  
注册后，用户通过用户名和密码（用户名为addmin密码为123），进入系统主页面。进入主页面之后，可以浏览用户信息。通过点击左边的菜单，可以查看不同部门不同用户信息。并且对用户可以进行增加，删除，修改，修改用户一次只能修改一个用户，删除用户一次可以删除多个。  
数据库设计要求：自主设计 
3.  项目页面  

<img src="webcontent/img/test1.png" width = "300"/>  



**注意事项：** 
1. 请注意代码的书写、命名符合规范，在代码中添加必要的注释；
2. 请注意操作数据库时进行必要的异常处理。

### 思路分析
1. 实现首页页面
    1. 菜单+列表拼接（EL表达式）