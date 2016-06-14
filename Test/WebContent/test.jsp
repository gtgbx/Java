<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/plugins/jquery-mobile/juqery.mobile-1.4.5/css/themes/default/jquery.mobile.icons-1.4.5.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/plugins/jquery-mobile/juqery.mobile-1.4.5/css/themes/default/theme-classic.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/plugins/jquery-mobile/juqery.mobile-1.4.5/css/themes/default/jquery.mobile.structure-1.4.5.min.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery-mobile/juqery.mobile-1.4.5/jquery.mobile-1.4.5.js"></script>
</head>
<body>

<div data-role="page" id="pageone">
  <div data-role="header" data-theme="a">
  <h1>jQuery Mobile Test</h1>
  </div>

  <nav data-role="navbar">
    <ul>
      <li><a href="#home" data-rel="dialog" data-icon="home">首页</a></li>
      <li><a href="#email" data-rel="dialog" data-icon="grid">邮件</a></li>
      <li><a href="#phonebook" data-rel="dialog" data-icon="search">通讯录</a></li>
      <li><a href="#calendar" data-rel="dialog" data-icon="star">日历</a></li>
    </ul>
  </nav>
  
  <div data-role="content">
  <p style="text-align:center;color:grey;">请点击上面的按钮来测试 jQuery Mobile。</p>
    </div>
       
  <div data-role="footer" data-position="fixed" data-theme="a">
  <h1>Copyright XXX</h1>
  </div>
</div> 

<div data-role="page" id="email">
  <div data-role="header">
  <h1>邮件数量</h1>
  </div>
              
    <div data-role="content">
    <ul data-role="listview" data-inset="true">
      <li><a href="#">收件箱<span class="ui-li-count">25</span></a></li>
      <li><a href="#">发件箱<span class="ui-li-count">432</span></a></li>
      <li><a href="#">垃圾箱<span class="ui-li-count">7</span></a></li>
    </ul>
  <a href="#pageone" data-role="button" data-inline="true" data-icon="back">返回</a>
  </div>
                  
  <div data-role="footer" data-position="fixed">
  <h1>页脚文本</h1>
  </div>
</div> 

<div data-role="page" id="home">
  <div data-role="header">
  <h1>首页</h1>
  </div>

  <div data-role="content">
  <p>这里是首页。</p>
  <a href="#pageone" data-role="button" data-inline="true" data-icon="back">返回</a>
  </div>

  <div data-role="footer">
  <h1>页脚文本</h1>
  </div>
</div>

<div data-role="page" id="home2">
  <div data-role="header">
  <h1>首页</h1>
  </div>

  <div data-role="content">
  <p>Home Is Where The Heart Is!</p>
  <a href="#pageone" data-role="button" data-inline="true" data-icon="back">返回</a>
  </div>

  <div data-role="footer">
  <h1>页脚文本</h1>
  </div>
</div> 


<div data-role="page" id="calendar">
  <div data-role="header">
  <h1>日历</h1>
  </div>

   <div data-role="content">
     <ul data-role="listview" data-inset="true">
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
    <a href="#pageone" data-role="button" data-inline="true" data-icon="back">返回</a>
  </div>
</div>
  
<div data-role="page" id="phonebook">
  <div data-role="header">
  <h1>通讯录</h1>
  <a href="#pageone" data-role="button" class="ui-btn-right" data-icon="back">返回</a>
  </div>

 <div data-role="content">
  
  <ul data-role="listview" data-autodividers="true" data-inset="true" data-filter="true">
    <li><a href="#">Bill Gates</a></li>
    <li><a href="#">George Bush</a></li>
    <li><a href="#">Thomas Carter</a></li>
  </ul>
  </div>
</div> 

</body>
</html>