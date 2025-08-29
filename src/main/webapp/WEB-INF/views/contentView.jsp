<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
	<h2>글 내용</h2>
	<hr>
	글 제목 : ${boardDto.btitle }<br><br>
	글 내용 : ${boardDto.bcontent }<br><br>
	글 작성자 : ${boardDto.bname }<br><br>
	글 등록일 : ${boardDto.bdate }
	<hr>
	<input type="button" value="글수정" onclick="javascript:window.location.href='content_modify?bnum=${boardDto.bnum}'">
</body>
</html>