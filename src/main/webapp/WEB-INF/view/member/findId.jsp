<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <script defer src="/js/member/join.js"></script> -->

<main class="editProfile-main">
	<section class="member-information">
			<h1>아이디 찾기</h1>
			<div class="member-profile">
				<h2>전화번호로 찾기</h2>
				<form action="find-id" method="post">
					<div class="profile-content">
						<div>
							이름
							<input name="name" type="text" class="findId-name" pattern="^[가-힣]{2,6}$">
						</div>
						<div>
							핸드폰 번호 
							<input name="phone1" type="text" class="findId-phone1" pattern="^\w{3}$" value="010"> 
							<input name="phone2" type="text" class="findId-phone2" pattern="^\w{4}$"> 
							<input name="phone3" type="text" class="findId-phone3" pattern="^\w{4}$">
						</div>
						<button class="submit-button" type="submit">아이디찾기</button>	
					</div>
				</form>
			</div>
	</section>
	<script defer src="/js/member/editProfile.js"></script>
</main>