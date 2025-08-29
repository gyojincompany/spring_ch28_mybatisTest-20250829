<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글목록</title>
</head>
<body>
	<h2>게시판 글목록</h2>
	<h3 style="color:green;">총 게시글 수 : ${bCount }개</h3>
	<hr>
	글번호 / 글제목 / 글쓴이 / 조회수 / 등록일<br><br>
	<c:forEach items="${boardDtos }" var="boardDto">
		${boardDto.bnum } / <a href="content_view?bnum=${boardDto.bnum }">${boardDto.btitle }</a> / ${boardDto.bname } / ${boardDto.bhit } / ${boardDto.bdate } <br> 
	</c:forEach>
	<hr>
	<input type="button" value="글쓰기" onclick="javascript:window.location.href='write_form'">
</body>
</html>