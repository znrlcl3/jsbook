<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <script defer src="/js/member/join.js"></script> -->

<main class="editProfile-main">
	<section class="member-information">
			<h1>아이디 찾기 결과</h1>
			<div class="member-profile">
				<form action="find-id" method="post">
					<div class="profile-content">
					<c:set var="result" value="${result}"/>
					<c:choose>
						<c:when test="${result == null}">
							<div>
								아이디를 찾을 수 없습니다.
							</div>
							<div class="find-button-form">
								<a class="find-button" href="/member/findId">아이디찾기</a>
							</div>
						</c:when>
						
						<c:otherwise>
							<div>
								아이디는
								<input name="name" type="text" class="findId-name" pattern="^[가-힣]{2,6}$" value="${result}" readonly="readonly">
							</div>
							<div class="find-button-form">
								<a class="find-button" href="/member/findPwd?id=${result}">비밀번호찾기</a>
							</div>
						</c:otherwise>
					</c:choose>
					</div>
				</form>
			</div>
	</section>
	<script defer src="/js/member/editProfile.js"></script>
</main>