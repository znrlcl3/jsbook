<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/reset.css">
<link href='<tiles:getAsString name="css"/>' type="text/css" rel="stylesheet" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body>
	<!-- header 부분 -->
	<%-- <header class="header">
		<tiles:insertAttribute name="header" />
	</header> --%>

	<!-- --------------------------- <body> --------------------------------------- -->
	<!-- --------------------------- main --------------------------------------- -->
	<tiles:insertAttribute name="main" />

</body>
</html>