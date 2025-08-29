<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 수정</title>
</head>
<body>
	<h2>글 내용</h2>
	<hr>
	<form action="content_modifyOk">
	<input type="hidden" name="bnum" value="${boardDto.bnum }">	
	글 제목 : <input type="text" name="btitle" value="${boardDto.btitle }"><br><br>
	글 내용 : <input type="text" name="bcontent" value="${boardDto.bcontent }"><br><br>
	글 작성자 : <input type="text" name="bname" value="${boardDto.bname }"><br><br>
	글 등록일 : ${boardDto.bdate }<br><br>	
	<hr>
	<input type="submit" value="수정완료">	
	<input type="button" value="수정취소" onclick="javascript:history.go(-1)">
	</form>
</body>
</html>