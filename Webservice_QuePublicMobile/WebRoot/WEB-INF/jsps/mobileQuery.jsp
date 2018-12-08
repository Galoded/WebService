<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>手机号码查询网站</title>
</head>
<body>
	<form action="queryMobile.action" method="post">
		手机号码<input type="text" name="mobileNumber" /><input type="submit"
			value="查询" /><br /> 
		查询结果${result }
	</form>
</body>
</html>