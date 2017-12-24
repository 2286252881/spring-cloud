<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/allstyle.css" />
<title></title>
</head>

<body>
	<!-- 引入头部 -->
	<%@include file="/head/head.jsp"%>

	<!--展示-->
	<div class="container">
		<div class="about">
			<p class="about-pone">以树为鉴，茁壮成长</p>
			<p class="about-ptwo">人生如树，树如人生</p>
			<p class="about-pthree">大树集团，以勤劳砥砺品性，以思想创造未来 每一棵大树的成长，都离不开时间的积淀、准
				确的定位扎实的根基与坚持向上长的倔强、坚持向阳的笃定</p>
			<img src="images/footer02.png" />
		</div>
		<!--massage-->
		<div class="massage">
			<img src="images/logo.png" class="logo" />
			<div class="massage-left">
				<p>咨询热线：010-89039106</p>
				<p>邮箱：dstc2008@163.com</p>
				<p>传真：010-89039106</p>
				<p>总部地址：北京市密云区新北路银河花园36号</p>
				<p>分公司地址：北京市密云区檀东路国家电网电 动汽车充电站南侧东西方向路口进入30米处</p>
			</div>
			<div class="massage-right">
				<iframe src="http://map.baidu.com/" width="750" height="400"
					frameborder="0" scrolling="no"></iframe>
			</div>
		</div>
	</div>

	<!--底部-->
	<!-- 引入尾部 -->
	<%@include file="/end/floor.jsp"%>

	<script src='js/jquery-1.8.0.min.js' type="text/javascript"></script>
	<script src='js/allscript.js' type="text/javascript"></script>
	<script src='js/about.js' type="text/javascript"></script>
</body>

</html>