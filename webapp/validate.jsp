<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Validation</title>
</head>
<body>

<jsp:useBean id="bean" class="Model.Login" />
<jsp:setProperty name="bean" property="*" />

<jsp:useBean id="dao" class="Model.LoginDao" />

<%
    boolean r = dao.validate(bean);

    if(r){
%>
        <jsp:forward page="welcome.jsp" />
<%
    } else {
        out.print("<h3>Invalid Credentials</h3>");
%>
        <jsp:include page="index.jsp" />
<%
    }
%>

</body>
</html>
