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
            <h1> </h1>
            
		    <div data-role="controlgroup" data-type="horizontal" class="ui-btn-right">
			    <a href="${pageContext.request.contextPath}/hello?locale=en" class="<spring:message code="css.i18n.en"/>" data-role="button"><spring:message code="button.en"/></a>
			    <a href="${pageContext.request.contextPath}/hello?locale=zh_CN" class="<spring:message code="css.i18n.zh"/>" data-role="button"><spring:message code="button.cn"/></a>
		    </div>
        </div>
        <div data-role="content">
            <p>${message}--${requestScope.locale}---${requestScope.locale eq 'en'}<c:if test="${locale == 'en' }">TTT</c:if></p>
            <a href="#" data-role="button">&nbsp;</a>
        </div>
        <div data-role="footer">
            <h4> </h4>
        </div>
    </div>
</body>

</html>
