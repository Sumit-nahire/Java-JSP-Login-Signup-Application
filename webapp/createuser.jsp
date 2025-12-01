<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="Model.Login"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>

<jsp:useBean id="dao" class="Model.LoginDao"></jsp:useBean>

<%
	boolean r = dao.createuser(bean);
if(r){

         out.print("User Created..");
%>
<jsp:include page="index.jsp"></jsp:include>
<% 
}
%>
</body>
</html>