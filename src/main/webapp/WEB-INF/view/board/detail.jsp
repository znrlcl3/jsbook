<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script defer src="/js/board/detail.js"></script>
<div class="container" role="main">
	<h2 class="d-none">게시판 디테일</h2>
	<div class="bg-white rounded shadow-sm">
		<c:forEach var="detail" items="${detail}">
		<div class="board-id d-none">${detail.id}</div>
			<div class="board-title">
					${detail.title}
				</div>
				<div class="board-info-box">
					<span class="board-author">
						작성자 : ${detail.writerId}
					</span>
					<span class="board-date">
						작성일 : ${detail.regDate}
					</span>
				</div>
				<div class="board-content">
				<textarea readonly="readonly">${detail.content}</textarea>
				
				</div>
				
	<div style="margin-top: 20px; margin-left:13px;">
		<button type="button" class="btn btn-sm btn-primary" id="btnUpdate" onclick="location.href='edit?id=${detail.id}'">수정</button>
		<button type="button" class="btn btn-sm btn-primary" id="btnDelete">삭제</button>
		<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
	</div>
		</c:forEach>
	</div>
</div>





<%-- <c:forEach var="detail" items="${detail}">
${detail.id}
${detail.title}
${detail.writerId}
${detail.regDate}
${detail.content}
${detail.hit}
</c:forEach> --%>