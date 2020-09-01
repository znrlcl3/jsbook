<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <script defer src="/js/member/join.js"></script> -->

<main class="editProfile-main">
	<section class="member-information">
			<h1>비밀번호 바꾸기</h1>
			<div class="member-profile">
				<form action="changePwd" method="post">
					<div class="profile-content">
						<c:set var="uid" value="${uid}"/>
						<div class="d-none">
							<input class="d-none" name="uid" value="${uid}">
						</div>
							<div>
								비밀번호
								<input name="pwd1" type="text" class="findId-uid">
							</div>
							<div>
								비밀번호 확인
								<input name="pwd2" type="text" class="findId-name">
							</div>
							
							<div class="find-button-form">
								<button class="submit-button" type="submit">비밀번호 바꾸기</button>	
							</div>
					</div>
				</form>
			</div>
	</section>
	</main>