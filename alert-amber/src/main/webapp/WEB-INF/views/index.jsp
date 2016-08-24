<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Alert Amber - Manager</title>
	</head>
	<body ng-app="alertAmberTT">
		<h2>Hello World!</h2>
		
		<div class="container" ng-controller="MainController">
		</div>
		
		
		<script src="<c:url value='/static/bower_components/angular/angular.js' />"></script>
		<script src="<c:url value='/static/bower_components/jquery/dist/jquery.min.js' />"></script>
		<script src="<c:url value='/static/js/app.js' />"></script>
		<script src="<c:url value='/static/js/controllers/mainController.js' />"></script>
		<script src="<c:url value='/static/js/services/BulletinService.js' />"></script>
	</body>
</html>
