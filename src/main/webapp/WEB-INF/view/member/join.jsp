<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script defer src="/js/member/join.js"></script>

<main>
	<div class="login-background">

		<div class="join">
			<form id="form1" method="post" action="join">
				<div class="join-form">
					<fieldset>
						<legend class="d-none">회원정보</legend>
						<table class="margin-top first">
							<tbody class="signup-body">
								<th class="body-th">
									<label>아이디</label>
								</th>
								<tr style="display: block">
									<td colspan="3" class="text-align-left indent">
										<input id="id-text" type="text" name="uid"autocomplete="off" title="영문과 숫자4~11자 이내"
											   pattern="^\w{4,11}$" class="width-half" required value="" placeholder="영문과 숫자 4~11자 이내" />
									</td>
								</tr>
								<tr>
									<td id="id-danger" class="d-none" style="color: #d92742; font-weight: bold;">아이디가이미 존재합니다.</td>
								</tr>
									<th class="body-th"><label>비밀번호</label>
									</th>
								<tr>

									<td colspan="3" class="text-align-left indent">
									<input type="password" name="pwd" class="pwd1" pattern="^\w{6,12}$" title="영문과 숫자6~12자 이내" required placeholder="영문과숫자 6~10" /></td>

								</tr>
								<th class="body-th">
									<label>비밀번호 확인</label>
								</th>
								<tr>
									<td colspan="3" class="text-align-left indent ">
										<!-- <span id="alert-success" style="display: none;">비밀번호가 일치합니다.</span> -->
										<input name="pwd2" type="password" class="pwd2" required />
									</td>
								</tr>
								<tr>
									<td id="pwd-danger" class="d-none" style="color: #d92742; font-weight: bold;">일치하지않습니다.
									</td>
								</tr>
								<th class="body-th">
									<label>이름</label>
								</th>
								<tr>
									<td colspan="3" class="text-align-left indent">
										<input class="width-half" name="name"  pattern="^[가-힣]{2,6}$" placeholder="한글 2~4글자 이내"
												title="한글2~4글자 이내" type="text" value="" required/>
									</td>
								</tr>
								<th class="body-th">
									<label>핸드폰번호</label>
								</th>
								<tr>
									<td colspan="3" class="text-align-left indent">
									<input name="phone" type="text" class="width-half" pattern="^01([0|1|6|7|8|9]?)-([0-9]{4})-([0-9]{4})$"
										placeholder="예) 010-1111-2222" required value="" /></td>
								</tr>
								<tr>
									<td colspan="4">
									<input id="submit-Button" type="submit" name="btn" value="가입하기" 
											class="btn-text btn-default" />
									</td>
								</tr>
							</tbody>
						</table>
					</fieldset>
				</div>
			</form>
		</div>
	</div>
</main>
