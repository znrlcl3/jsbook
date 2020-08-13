<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<section class="main">
        <h1 class="d-none">게시판</h1>
            <div class="board">
                <table class="table">
                    <thead class="thead">
                        <tr>
                            <td>번호</td>
                            <td>제목</td>
                            <td>글쓴이</td>
                            <td>작성일</td>
                            <td>조회수</td>
                        </tr>
                    </thead>
                    <c:forEach var="list" items="${list}">
                    <tbody class="tbody">
                        <tr>
                            <td>${list.id}</td>
                            <td><a href="/board/detail?id=${list.id}">${list.title}</a></td>
                            <td>${list.writerId}</td>
                            <td>${list.regDate}</td>
                            <td>${list.hit}</td>
                        </tr>
                    </tbody>
                    </c:forEach>
                </table>
                <div class="page-wrap">
	                <ul class="page-nation">
	                	<c:if test="${paging.nowPage!=1}">
	                		<li><a href="/board/list?p=${paging.nowPage-1}"><</a></li>
	                	</c:if>
			            
			            <c:forEach var="i" begin="${paging.startPage}" end="${paging.endPage}">	                	
				        	<c:if test="${i==param.p}">
								<li><a style="background:gray; color:white" href="/board/list?p=${i}">${i}</a></li>
							</c:if>
							
							<c:if test="${i!=param.p}">
								<li><a class="" href="/board/list?p=${i}">${i}</a></li>
							</c:if>
			            </c:forEach>			                	
	                	
	                	<c:if test="${paging.nowPage!=paging.tempEndPage}">
	                		<li><a href="/board/list?p=${paging.nowPage+1}">></a></li>
	                	</c:if>
	                		
	                </ul>
                </div>
            </div>
    </section>

 