<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选课系统-首页</title>
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
<link rel="stylesheet" type="text/css" href="./css/reset.css" />
<link rel="stylesheet" type="text/css" href="./css/common.css" />
<link rel="stylesheet" type="text/css" href="./css/index.css" />
</head>
<body>
	<div id="header-wrapper">
		<div id="header">
			<h1>国际软件学院选课系统</h1>
		</div>
	</div>
	<div id="content">
		<form action="courses.jsp" method="POST">
			<fieldset class="items">
				<fieldset class="item">
					<label for="studentNo"> 学号: </label> <input type="text" class="txt"
						name="studentNo" />
				</fieldset>
				<fieldset class="item">
					<label for="password"> 密码: </label> <input type="password"
						class="txt" name="password" />
				</fieldset>
				<%
					String error = (String) request.getParameter("error");
					if (error != null) {
				%>
				<fieldset class="error">
					学号或者密码错误
				</fieldset>
				<%
					}
				%>
				<fieldset class="item">
					<label>&nbsp;</label> <input type="submit" class="btn"
						value="登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;陆" />
				</fieldset>
			</fieldset>
		</form>
	</div>
	<div id="footer">Copyright &copy; 2011-2012 All rights reserved</div>
</body>
</html>