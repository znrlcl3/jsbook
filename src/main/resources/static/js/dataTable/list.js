  $(document).ready(function() {
     	console.log("connect jQuery");
    	 
    	 $("#mytable").DataTable();
    
    	 $("#searchButton").click(function() {
    		 console.log("검색 버튼 누름");
    		 
    		 //validate
        	 var startdate = $("#startdate").val(); //검색 부분 시작날짜
        	 console.log(startdate);
        	 
        	 var enddate = $("#enddate").val(); //검색 부분 종료날짜
        	 console.log(enddate);
        	 
        	 if(startdate!=null && startdate!='' && enddate!=null && enddate!='') {
        		 console.log("if(startdate!=null && startdate!='' && enddate!=null && enddate!='')");
        		 
        		 if(startdate > enddate) {
        			 alert("시작날짜는 종료날짜보다 빨라야합니다.");
        			 /*
        			 $("startdate").attr("value", "");
        			 $("enddate").attr("value", "");
        			 */
        		 }
        	 }
    		 

    		 $("#searchForm")
    		 .attr("action", "/dataTable/list")
    		 .submit();
    		 
    	 });
    	 
    	 $("#clearButton").click(function() {
    		 console.log("초기화 버튼 누름");
    		 
    		 //검색 부분 input 다 초기화
    		 /*
    		 $("#board_title").attr("value", "");
    		 $("#member_name").attr("value", "");
    		 $("#dept_name").attr("value", "");
    		 $("#startdate").attr("value", "");
    		 $("#enddate").attr("value", "");
    		 
    		 $("#searchForm")
    		 .attr("action", "/board/main.do")
    		 .submit();
    		 */
    		 
    		 $("#clearButton").attr("type", "reset");
    		 
    	 });
    	 
    	  <!-- 제이쿼리 위젯 -->
    	 
    	 $("#writeBoard").dialog({
            	autoOpen:false, //자동으로 열리지않게
                position:{
                	my:"center", 
                    at:"center", 
                    of:"section" 
                }, //가운데
                modal:true, //모달대화상자
                resizable:false, //크기 조절 못하게
                    
                buttons:{
                    "확인":function(){
                    console.log($(".write-title").val());
                    
	          $.ajax({
			            type: "POST",
			            url: "/dataTable/insert-data",
			            data : {writeTitle:$(".write-title").val(),
			          			writeContent:$(".write-content").val(),
			            		writerId:$(".write-writerId").val(),
			            		writeKind:$(".write-kind").val(),
			            },
			            async: "true",
			           
			            datatype: "json",
			            success: function (data) {
			            	console.log("성공");
			            }
			        })
                    
                        $(this).dialog("close");
                    },"취소":function(){
                        $(this).dialog("close");
                    }
                }
            });
         		
        	$("#insertButton").click(function() {
           		$("#writeBoard").dialog("open");
           	});
            	
    	 
     } );