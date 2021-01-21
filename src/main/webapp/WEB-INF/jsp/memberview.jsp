<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>회원정보 상세조회</title>
</head>
<body>
<h1>회원정보 상세 조회</h1
<p>아이디: ${mvo.userid}</p>
<p>이름: ${mvo.name}</p>
<p>회원등급: ${mvo.grade}</p>
<p>마일리지: ${mvo.points}</p>
<p>가입일: ${mvo.regdate}</p>
</body>
</html>
