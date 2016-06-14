<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Page Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/plugins/jquery-mobile/jquery.mobile-1.4.2.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery-mobile/jquery.mobile-1.4.2.js"></script>
</head>

<body>
    <div data-role="page" id="home">
        <div data-role="header">
            <h1>Header</h1>
            
		    <div data-role="controlgroup" data-type="horizontal" class="ui-btn-right">
			    <a href="test?langType=en" data-role="button"><spring:message code="button.en"/></a>
			    <a href="test?langType=zh" data-role="button"><spring:message code="button.cn"/></a>
		    </div>
        </div>
        <div data-role="content">
            <p>Content goes here</p>
            <a href="#" data-role="button">点我</a>
        </div>
        <div data-role="footer">
            <h4>Footer</h4>
        </div>
    </div>
</body>

</html>
