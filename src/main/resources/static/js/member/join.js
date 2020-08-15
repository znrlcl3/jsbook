$(function () {
	//id 중복검사
	
    $('#id-text').keyup(function () {
        $.ajax({
            type: "POST",
            url: "/member/join/id-data",
            data : {memberId:$('#id-text').val()},
            async: "true",
            datatype: "json",
            success: function (data) {
            	if(data==1){
					$('#id-danger').removeClass("d-none");
					$('#submit-Button').prop("type", "button");
            	}
            	else{
            	
            		$('#id-danger').addClass("d-none");
					$('#submit-Button').prop("type", "submit");            		
            	}
            }
        })
    });
    
    //pwd 일치 검사
    
    
    $('.pwd2').keyup(function(){
    
	    let pwd1 = $('.pwd1').val();
	    let pwd2 = $('.pwd2').val();
    	console.log(pwd1);
    	console.log(pwd2);
    	
    	if(pwd1!=pwd2){
    		$('#pwd-danger').removeClass("d-none");
    		$('#submit-Button').prop("type", "button");
    	}
    	else{
    		$('#pwd-danger').addClass("d-none");
    		$('#submit-Button').prop("type", "submit");
    	}
    	
    });
    
    
    // ***************유효성검사 ***************
    
    
    
    

});