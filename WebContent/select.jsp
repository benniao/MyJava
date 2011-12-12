<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.xiaoxiao.es.db.*"%>
<%@ page import="org.xiaoxiao.es.model.*"%>
<%@ page import="org.xiaoxiao.es.util.*"%>

<%
	if (session.getAttribute("student") == null) {
		response.sendRedirect("index.jsp");
	} else {
		Integer courseId = Integer.parseInt(request
				.getParameter("courseId"));
		Integer studentId = ((Student) session.getAttribute("student"))
				.getId();
		int result = StudentCourseDAO.add(studentId, courseId);
		if (result == 1) {
			response.sendRedirect("courses.jsp");
		} else {
			response.sendRedirect("courses.jsp?error=1");
		}
	}
%>