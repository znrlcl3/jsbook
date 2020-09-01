window.addEventListener("load", function() {
	
	$("main").click(function(){
		
		if(event.target.className=="editProfile-main" || 
		   event.target.className=="member-information"){
			$(".name-detail").addClass('d-none');
			$(".pwd-detail").addClass('d-none');
			$(".phone-detail").addClass('d-none');
			$(".member-profile").css({"filter": "blur(0px)"});
			$(".phone-profile").css({"filter": "blur(0px)"});
		}
	});
	
	
	let nameCheck = RegExp(/^[가-힣]{2,6}$/);
	
	$(".profile-block-id").click(function() {
		alert("아이디는 수정 안됩니다만?");
	});
	
	
	$(".profile-block-name").click(function(e) {
		
		let flag = true;
		$(".member-profile").css({"filter": "blur(10px)"});
		$(".phone-profile").css({"filter": "blur(10px)"});
		$(".name-detail").removeClass('d-none');
		
		//이름 변경
		$(".name-input").keyup(function(e){
			let chk = $(".name-input").val();
			
			console.log(chk.length);
			if(chk.match(/([^가-힣\x20])/) || (chk.length<2 || chk.length>4)) { 
		    	$(".different-name").text("2~4글자 한글만 입력해주세용");
		    	$(".name-detail-save").prop("type", "button");

			}
			else {
				$(".different-name").text("");
				$(".name-detail-save").prop("type", "submit");
		
				
			}
		});
		
		$(".name-detail-cancle").click(function(){
			$(".name-detail").addClass('d-none');
			$(".member-profile").css({"filter": "blur(0px)"});
			$(".phone-profile").css({"filter": "blur(0px)"});
			
		});
		
		
		
		
		
		
		
		
	});

	

	$(".profile-block-pwd").click(function() {
		

		$(".member-profile").css({"filter": "blur(10px)"});
		$(".phone-profile").css({"filter": "blur(10px)"});
		$(".pwd-detail").removeClass('d-none');
		
		$(".pwd-detail-cancle").click(function(){
			$(".pwd-detail").addClass('d-none');
			$(".member-profile").css({"filter": "blur(0px)"});
			$(".phone-profile").css({"filter": "blur(0px)"});
		});
		$('.pwd-input').keyup(function(){
			let chk = $(".pwd-input").val();
			console.log(chk);
			if(chk.length<4 || chk. length>10){
				$(".different-pwd").text('양식은 4~10글자입니다.');
				$(".pwd-detail-save").prop("type", "button");
			}
			else{
				$(".different-pwd").text('');
				$(".pwd-detail-save").prop("type", "submit");
			}
		});
		
		$('.pwd-check-input').keyup(function() {
			
			
			var pwd1 = $(".pwd-input").val();
			var pwd2 = $(".pwd-check-input").val();
			
			if (pwd1 != '' && pwd2 == '') {
				null;
			} else if (pwd1 != "" || pwd2 != "") {
				if (pwd2.length<4 || pwd2.length>10){
					$(".different-pwd").text('양식은 4~10글자입니다.');
					$(".pwd-detail-save").prop("type", "button");
				}
				
			 else if(pwd1 != pwd2){
					$(".different-pwd").text('비밀번호가 다릅니다.');
					$(".pwd-detail-save").prop("type", "button");
					
				} 
			 else if (pwd1 == pwd2) {
					$(".different-pwd").text('');
					$(".pwd-detail-save").prop("type", "submit");
				
				}
			}
			
		});
		
		
		
	});
	
	$(".phone-block-number").click(function() {
		let flag = true;
		$(".member-profile").css({"filter": "blur(10px)"});
		$(".phone-profile").css({"filter": "blur(10px)"});
		$(".phone-detail").removeClass('d-none');
		
		var regPhone = /(01[0|1|6|9|7])[-](\d{3}|\d{4})[-](\d{4}$)/g;
		
		
		$(".phone-input").keyup(function(e){
			let chk = $(".phone-input").val();
			if(!chk.match(/(01[0|1|6|9|7])[-](\d{4})[-](\d{4}$)/)){ 
				$(".different-phone").text("양식은 000-0000-0000입니다");
				$(".phone-detail-save").prop("type", "button");
			}
			else{
				$(".different-phone").text("");
				$(".phone-detail-save").prop("type", "submit");
			}
		});
		
		$(".phone-detail-cancle").click(function(){
			$(".phone-detail").addClass('d-none');
			$(".member-profile").css({"filter": "blur(0px)"});
			$(".phone-profile").css({"filter": "blur(0px)"});
		});
		
		
	});
	
});