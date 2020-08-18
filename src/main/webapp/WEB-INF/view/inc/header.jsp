<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>
<!-- ---------------------------<header>--------------------------------------- -->
<!-- header 부분 -->
<section id="header" class="header">
	<div class="header_logo">
		<a class="aside-button" href=""> <i class="fas fa-bars sidemenu"></i></a>
		<a href="/index"><img class="logo" src="../images/indexlogo.png"
			width="230px" alt="campnic_logo"></a>
	</div>
	<s:authorize access="isAnonymous()">
	<ul class="header-menu">
			<li><a href="/member/join">회원가입</a></li>
			<li><a href="/member/login">로그인</a></li>
	</ul>
	</s:authorize>
	<s:authorize access="isAuthenticated()">
	<ul class="header-menu">
			<li><a href="/member/editProfile">정보수정</a></li>
			<li><a href="/member/logout">로그아웃</a></li>
	</ul>
	</s:authorize>
</section>
