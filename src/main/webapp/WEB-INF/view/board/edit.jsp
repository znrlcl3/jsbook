<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script defer src="/js/board/detail.js"></script>
<div class="container" role="main">
	<h2 class="d-none">게시판 디테일</h2>
	<form method="POST">
		<div class="bg-white rounded shadow-sm">
			<c:forEach var="detail" items="${detail}">
				<div class="board-id d-none">${detail.id}</div>
				<div class="board-title">
					<input value="${detail.title}" name="title">
				</div>
				<div class="board-info-box">
					<span class="board-author"> 작성자 : ${detail.writerId} </span> 
					<span class="board-date"> 작성일 : ${detail.regDate} </span>
				</div>
				<div class="board-content">
					<textarea name="content">${detail.content}</textarea>

				</div>

				<div style="margin-top: 20px; margin-left: 13px;">
					<button type="submit" class="btn btn-sm btn-primary" id="btnUpdate">수정</button>
					<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
				</div>
			</c:forEach>
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