<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<div class="container" role="main">
	<h2 class="d-none">게시판 디테일</h2>
	<div class="bg-white rounded shadow-sm">
		<c:forEach var="detail" items="${detail}">
			<div class="board_title">
					${detail.title}
				</div>
				<div class="board_info_box">
					<span class="board_author">
						작성자 : ${detail.writerId}
					</span>
					<span class="board_date">
						작성일 : ${detail.regDate}
					</span>
				</div>
				<div class="board_content">
				<textarea>${detail.content}</textarea>
				
				</div>
				
		</c:forEach>
	</div>
	<div style="margin-top: 20px; margin-left:13px;">
		<button type="button" class="btn btn-sm btn-primary" id="btnUpdate">수정</button>
		<button type="button" class="btn btn-sm btn-primary" id="btnDelete">삭제</button>
		<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
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