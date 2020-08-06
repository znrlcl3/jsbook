<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/board/list.css">
</head>
<body>
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
                            <td><a href="">${list.title}</a></td>
                            <td>${list.writerId}</td>
                            <td>${list.regDate}</td>
                            <td>${list.hit}</td>
                        </tr>
                    </tbody>
                    </c:forEach>
                </table>
            </div>
    </section>
</body>
</html>

 