$(function () {
	let flag=true;

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
					flag=false;
            	}
            	else{
            	
            		$('#id-danger').addClass("d-none");
            		flag=true;
            	}
            }
        })
    });
    
    //pwd 일치 검사
    
    
    $('.pwd2').keyup(function(){
    
	    let pwd1 = $('.pwd1').val();
	    let pwd2 = $('.pwd2').val();
    	
    	if(pwd1!=pwd2){
    		$('#pwd-danger').removeClass("d-none");
    		flag=false;
    	}
    	else{
    		$('#pwd-danger').addClass("d-none");
    		flag=true;
    	}
    	
    });
    
    $('#submit-Button').click(function(){
    	if(flag==true){
	    	$('#submit-Button').prop("type", "submit");
    	}
    	else{
    		$('#submit-Button').prop("type", "button");
    	}
    });
    
    // ***************유효성검사 ***************
    
    
    
    

});