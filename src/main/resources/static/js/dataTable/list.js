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
    		 .attr("action", "/board/main.do")
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
    	 
     } );