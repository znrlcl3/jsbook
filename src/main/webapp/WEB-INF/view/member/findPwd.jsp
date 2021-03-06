<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <script defer src="/js/member/join.js"></script> -->

<main class="editProfile-main">
	<section class="member-information">
			<h1>비밀번호 바꾸기</h1>
			<div class="member-profile">
				<form action="find-pwd" method="post">
					<div class="profile-content">
						<c:set var="result" value="${result}"/>
							<div>
								아이디는
								<input name="uid" type="text" class="findId-uid"value="${result}">
							</div>
							<div>
								이름
								<input name="name" type="text" class="findId-name">
							</div>
							<div>
								전화번호
								<input name="phone1" type="text" class="findId-phone1" pattern="^\w{3}$" value="010"> 
							<input name="phone2" type="text" class="findId-phone2" pattern="^\w{4}$"> 
							<input name="phone3" type="text" class="findId-phone3" pattern="^\w{4}$">
							</div>
							<div class="find-button-form">
								<button class="submit-button" type="submit">비밀번호 바꾸기</button>	
							</div>
					</div>
				</form>
			</div>
	</section>
	</main>