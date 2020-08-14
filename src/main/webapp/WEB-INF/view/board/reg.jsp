<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<div class="container" role="main">
	<h2 class="d-none">게시물 등록</h2>
	<form action="reg" method="POST"> 
		<div class="bg-white rounded shadow-sm">			
				<div class="board-title">
					<input placeholder="제목을 입력해주세요" name="title">
				</div>
				<div class="board-info-box">
					<label>작성자 : </label>
					<input class="board-author" name="writerId" value="성진 " readonly="readonly"> 
				</div>
				<div class="board-content">
					<textarea name="content" placeholder="내용을 입력해주세요"></textarea>
				</div>
		</div>
		<div style="margin-top: 20px; margin-left: 13px;">
			<button type="submit" class="btn btn-sm btn-primary" id="btnUpdate">등록</button>
		</div>
	</form>
</div>





<%-- <c:forEach var="detail" items="${detail}">
${detail.id}
${detail.title}
${detail.writerId}
${detail.regDate}
${detail.content}
${detail.hit}
</c:forEach> --%>