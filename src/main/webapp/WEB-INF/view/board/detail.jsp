<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

  아아
<c:forEach var="detail" items="${detail}">
${detail.id}
${detail.title}
${detail.writerId}
${detail.regDate}
${detail.content}
${detail.hit}
</c:forEach>