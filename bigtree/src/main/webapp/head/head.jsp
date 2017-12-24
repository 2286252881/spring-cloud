<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" type="text/css" href="css/allstyle.css" />

<!--头部-->
<div class="header">
	<div class="head-con">
		<div class="logo">
			<a href="index.html"><img src="images/logo.png" /></a>
		</div>
		<!-- 一级菜单开始 -->
		<div class="nav">
			<ul>
				<li>
					<c:forEach items="${menuList }" var="menu" begin="0" end="0">
						<c:choose>
							<c:when test="${menuId == menu.id }">
								<a href="/bigtree/" class="first"
									style="width: 35px; border-bottom: 2px solid #416a17; color: #416a17;"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:when>
							<c:otherwise>
								<a href="/bigtree/" class="first"
								    style="width: 35px;"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</li>
				
				<li>
					<c:forEach items="${menuList }" var="menu" begin="1" end="1">
						<c:choose>
							<c:when test="${menuId == menu.id }">
								<a href="/bigtree/group" class="group"
									style="width: 75px; border-bottom: 2px solid #416a17; color: #416a17;"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:when>
							<c:otherwise>
								<a href="/bigtree/group" class="group"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<div class="group-list">
						<!-- 二级菜单 -->
					</div>
				</li>
				
				<li>
					<c:forEach items="${menuList }" var="menu" begin="2" end="2">
						<c:choose>
							<c:when test="${menuId == menu.id }">
								<a href="/bigtree/case" class="case"
									style="width: 75px; border-bottom: 2px solid #416a17; color: #416a17;"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:when>
							<c:otherwise>
								<a href="/bigtree/case" class="case"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<div class="case-list">
						<!-- 二级菜单 -->
					</div>
				</li>
				
				<li>
					<c:forEach items="${menuList }" var="menu" begin="3" end="3">
						<c:choose>
							<c:when test="${menuId == menu.id }">
								<a href="/bigtree/server" class="serve"
									style="width: 75px; border-bottom: 2px solid #416a17; color: #416a17;"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:when>
							<c:otherwise>
								<a href="/bigtree/server" class="serve"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<div class="serve-list">
						<!-- 二级菜单 -->
					</div>
				</li>
				<li>
					<c:forEach items="${menuList }" var="menu" begin="4" end="4">
						<c:choose>
							<c:when test="${menuId == menu.id }">
								<a href="/bigtree/teams" class="team"
									style="width: 75px; border-bottom: 2px solid #416a17; color: #416a17;"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:when>
							<c:otherwise>
								<a href="/bigtree/teams" class="team"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<div class="team-list">
						<!-- 二级菜单 -->
					</div>
				</li>
				<li>
					<c:forEach items="${menuList }" var="menu" begin="5" end="5">
						<c:choose>
							<c:when test="${menuId == menu.id }">
								<a href="/bigtree/about" class="group" 
									style="width: 75px; border-bottom: 2px solid #416a17; color: #416a17;"
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:when>
							<c:otherwise>
								<a href="/bigtree/about" class="group" 
									onmouseenter="test('${menu.id}')">${menu.name }
								</a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</li>
			</ul>
		</div>
		<!-- 一级菜单结束 -->
		<div class="phone">
			<b><span><img src="images/phone.png" /></span> 010-89039106</b>
		</div>
	</div>
</div>

<!--轮播-->
<div class="scroll">
	<ul>
		<c:forEach items="${otherPicList }" var="otherPic">
			<li><img src="images/${otherPic.name }" width="1920"
				height="700"></li>
		</c:forEach>
	</ul>
	<!-- 左边 -->
	<a href="javascript:void(0)" class="prev"><img src="images/arrow-prev1.png"
		border="0"></a>
	<!-- 右边 -->
	<a href="javascript:void(0)" class="next"><img src="images/arrow-next2.png"
		border="0"></a>
</div>
<!-- 头部结束 -->
<c:choose>
	<c:when test="${menuId == 1}">
		<link rel="stylesheet" type="text/css" href="css/index.css" />
	</c:when>
	<c:when test="${menuId == 2}">
		<link rel="stylesheet" type="text/css" href="css/group.css" />
		<!-- 加载集团风采才页面的二级菜单 -->
		<!-- <span style="opacity: 1;"></span> -->
		<div class="con-nav">
			<ul>
				<c:forEach items="${secondMenuList }" var="secondMenu">
					<li>${secondMenu.name }</li>
				</c:forEach>
			</ul>
		</div>
	</c:when>
	<c:when test="${menuId == 3}">
		<link rel="stylesheet" type="text/css" href="css/case.css" />
		<!-- 案例页面二级菜单 -->
		<div class="ad">
			<ul>
				<c:forEach items="${secondMenuList }" var="secondMenu">
					<li><a href="javascript:void(0)">${secondMenu.name }</a></li>
				</c:forEach>
			</ul>
		</div>
	</c:when>
	<c:when test="${menuId == 4}">
		<link rel="stylesheet" type="text/css" href="css/serve.css" />
	</c:when>
	<c:when test="${menuId == 5}">
		<link rel="stylesheet" type="text/css" href="css/team.css" />
	</c:when>
	<c:otherwise>
		<link rel="stylesheet" type="text/css" href="css/about.css" />
	</c:otherwise>
</c:choose>