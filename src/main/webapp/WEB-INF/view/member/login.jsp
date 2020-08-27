<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<main>
	<div class="login">
	<div class="login-form">
		<h1>Login</h1>
		<form method="post">
			<input type="text" name="username" autocomplete="off" placeholder="Username" 
																	required="required" /> 
			<input type="password" name="password" placeholder="Password" required="required" />
			<button type="submit" class="login-submit">로그인</button>
			<ul class="find-form">
				<li><a href="/member/findId">아이디찾기</a></li>
				<li><a href="/member/findPwd">비밀번호찾기</a></li>
			</ul>	
		</form>
	</div>
</div>
</main>