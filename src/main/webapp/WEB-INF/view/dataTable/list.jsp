<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/bs-3.3.5/jq-2.1.4,dt-1.10.8/datatables.min.css"/>
<script type="text/javascript" src="https://cdn.datatables.net/r/bs-3.3.5/jqc-1.11.3,dt-1.10.8/datatables.min.js"></script>
<script defer src="/js/dataTable/list.js"></script>
      <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css">
      <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
</head>
<body>
	     <section>
         <div class="search-container">
	         <form id="searchForm" name="searchForm" method="post">
	             <div class="title-container form-container">
	               <span>제목</span>
	               <input type="text" id="board_title" name="board_title"/>
	            </div>
	            <div class="information-container form-container">
	                <span>작성자</span>
	                <input type="text" id="member_name" name="member_name"/>
	                <input type="button" class="group-infor" value="조직도">
	                <span>부서</span>
	                <input type="text" id="dept_name" name="dept_name"/>
	                <input type="button" class="group-infor" value="조직도">
	            </div> 
	            <div class="date-container form-container">
	                <span>작성일</span>
	                <input type="date" id="startdate" name="startdate"/>
	                <span>~</span>
	                <input type="date" id="enddate" name="enddate"/>
	                <input type="button" class="search-button" 
	                       id="searchButton" name="searchButton" value="검색">
	                <input type="button" class="clear-button" 
	                       id="clearButton" name="clearButton" value="초기화">    
	            </div>
	         </form>
         </div>
          
        <nav class="crud-container">
          <input type="button" value="등록" class="crud-btn"
          		 id="insertButton" name="insertButton">
          <input type="button" value="수정" class="crud-btn">
          <input type="button" value="삭제" class="crud-btn">
          <input type="button" value="인쇄" class="crud-btn print-btn">
        </nav>
        <div class="content-container">
          <table id="mytable" class="table table-bordred table-striped">
            <colgroup>
              <col width="20%" />
              <col width="*" />
              <col width="20%" />
            </colgroup>
            <thead>
              <tr>
              	<td></td>
                <td>제목</td>
                <td>부서</td>
                <td>작성자</td>
                <td>작성일</td>
                <td>게시판명</td>
              </tr>
            </thead>
            <tbody>
            <c:forEach var="list" items="${list}">
            	<tr>
            		<td><input type="checkbox" value="${list.id}"></td>
            		<td>${list.title}</td>
            		<td>${list.dept_name}</td>
            		<td>${list.writerId}</td>
            		<td>${list.regDate}</td>
            		<td>${list.kind}</td>
            	</tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
      </section>

          
	  <!-- 제이쿼리 위젯 -->
         
      <script type="text/javascript">
      	$(document).ready(function() {
         		
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
                        $(this).dialog("close");
                    },"취소":function(){
                        $(this).dialog("close");
                    }
                }
            });
         		
        	$("#insertButton").click(function() {
           		$("#writeBoard").dialog("open");
           	});
            	
         		
        });
      </script>
      
      <div id="writeBoard" name="writeBoard" title="글쓰기">
      	글쓰기
      </div>
</body>
