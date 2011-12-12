<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.xiaoxiao.es.db.*"%>
<%@ page import="org.xiaoxiao.es.model.*"%>
<%@ page import="org.xiaoxiao.es.util.*"%>
<%
	if (session.getAttribute("student") == null) {
		String studentNo = (String) request.getParameter("studentNo");
		String password = (String) request.getParameter("password");
		Student student = StudentDAO.findStudent(studentNo, password);
		if (student == null) {
			response.sendRedirect("index.jsp?error=1");
			return;
		} else {
			session.setAttribute("student", student);
		}
	}
	Student student = (Student) session.getAttribute("student");
	List<Course> courseList = CourseDAO
			.findByStudentId(student.getId());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选课系统-我的课表</title>
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
<link rel="stylesheet" type="text/css" href="./css/reset.css" />
<link rel="stylesheet" type="text/css" href="./css/common.css" />
<link rel="stylesheet" type="text/css" href="./css/courses.css" />
</head>
<body>
	<div id="header-wrapper">
		<div id="header">
			<h1>国际软件学院选课系统</h1>
			<div id="nav">
				<ul>
					<li><a href="courses.jsp">选课</a></li>
					<li><a href="mycourses.jsp" class="active">我的课表</a></li>
					<li><a href="logout.jsp">退出</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div id="content">
		<table>
			<thead>
				<tr>
					<td class="f-td">课程名称</td>
					<td>任课老师</td>
					<td>开课时间</td>
					<td>上课地点</td>
					<td>学分</td>
					<td class="l-td"></td>
				</tr>
			</thead>
			<tbody>
				<%
					for (int i = 0, size = courseList.size(); i < size; i++) {
						Course c = courseList.get(i);
				%>
				<tr>
					<td class="f-td"><%=c.getName()%></td>
					<td><%=c.getTeacher()%></td>
					<td>
						<%
							List<String> strs = CourseUtil.getTimeDetail(c);
								for (int j = 0, l = strs.size(); j < l; j++) {
						%> <%=strs.get(j)%> <%
 	}
 %>
					</td>
					<td><%=c.getAddress()%></td>
					<td><%=c.getGrade()%></td>
					<%
						if (!StudentCourseDAO.hasSelected(student.getId(), c.getId())) {
					%>
					<td class="l-td"><a href="select.jsp?courseId=<%=c.getId()%>"
						class="yes">选课</a></td>
					<%
						} else {
					%>
					<td class="l-td"><a
						href="deselect.jsp?courseId=<%=c.getId()%>" class="no" onclick="return window.confirm('您确定要撤课?');">撤课</a></td>
					<%
						}
					%>

				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
	<div id="footer">Copyright &copy; 2011-2012 All rights reserved</div>
</body>
</html>