<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Annotation</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/plugins/jquery-mobile/juqery.mobile-1.4.5/css/themes/default/jquery.mobile.icons-1.4.5.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/plugins/jquery-mobile/juqery.mobile-1.4.5/css/themes/default/theme-classic.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/plugins/jquery-mobile/juqery.mobile-1.4.5/css/themes/default/jquery.mobile.structure-1.4.5.min.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery-mobile/juqery.mobile-1.4.5/jquery.mobile-1.4.5.js"></script>

	<script>
	
		$(document).ready(function(){
			$( "#theme-selector input" ).on( "change", function( event ) {
				var themeClass = $( "#theme-selector input:checked" ).attr( "id" );

				$( "#home" ).removeClass( "ui-page-theme-a ui-page-theme-b ui-page-theme-c ui-page-theme-d ui-page-theme-e" ).addClass( "ui-page-theme-" + themeClass );
				$( ".ui-collapsible-content" ).removeClass( "ui-body-a ui-body-b ui-body-c ui-body-d ui-body-e" ).addClass( "ui-body-" + themeClass );
				$( ".theme" ).text( themeClass );
			});
		});
	
	</script>
	<style>
	
		*{
			font-family: Helvetica, Arial, sans-serif;
		}
	
	</style>

</head>

<body>
    <div data-role="page" id="home">
        <div data-role="header">
            <h1>Page Test</h1>
            

				<fieldset id="theme-selector" data-role="controlgroup" data-type="horizontal" class="ui-btn-left">
					<label for="a">A</label>
					<input type="radio" name="theme" id="a" checked>
					<label for="b">B</label>
					<input type="radio" name="theme" id="b">
					<label for="c">C</label>
					<input type="radio" name="theme" id="c">
					<label for="d">D</label>
					<input type="radio" name="theme" id="d">
					<label for="e">E</label>
					<input type="radio" name="theme" id="e">
				</fieldset>
            
		    <div data-role="controlgroup" data-type="horizontal" class="ui-btn-right">
			    <a href="${pageContext.request.contextPath}/annotation?locale=en" class="<spring:message code="css.i18n.en"/>" data-role="button"><spring:message code="button.en"/></a>
			    <a href="${pageContext.request.contextPath}/annotation?locale=zh_CN" class="<spring:message code="css.i18n.zh"/>" data-role="button"><spring:message code="button.cn"/></a>
		    </div>
        </div>
        <div data-role="content">
            <p>${message}</p>
            <a href="#" data-role="button">&nbsp;</a>
            
     <ul data-role="listview" data-inset="true" data-theme="c">
      <li data-role="list-divider">周三, 10 月 7 日, 2013 年<span class="ui-li-count">2</span></li>   
      <li><a href="#">   
        <h2>会议</h2>
        <p>在 10:00 提醒</p>
        <p class="ui-li-aside">三楼会议室</p></a>
      </li>
      <li><a href="#">
        <h2>约会</h2>
        <p>在 18:00 提醒</p>
        <p class="ui-li-aside">小南国餐厅</p></a>
      </li>
    </ul>
    
    
    
        </div>
        <div data-role="footer" data-position="fixed">
            <h4> </h4>
        </div>
    </div>
</body>

</html>
