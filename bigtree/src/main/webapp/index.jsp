<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title></title>
</head>
<body>
	<!-- 引入头部 -->
	<%@include file="/head/head.jsp"%>
	<!--ad-->
	<div class="ad">
		<h1>
			<span>人生如树</span><span>树如人生</span>
		</h1>
		<h3>大树集团，以勤劳砥砺品性，以思想创造未来</h3>
		<h4>
			时间<span>|</span>不动<span>|</span>向上<span>|</span>根基<span>|</span>阳光
		</h4>
	</div>
	<!--展示-->
	<div class="container">
		<!--新闻-->
		<div class="show-news">
			<div class="new-top">
				<p class="new1">新闻资讯</p>
				<p class="new2">News information</p>
			</div>

			<div class="news-left">
				<c:forEach items="${newList }" var="news" varStatus="f">
					<img src="images/${news.cover }" width="592px" height="400px"
						style="display: block;" />
				</c:forEach>
			</div>
			<!-- 新闻开始 -->
			<div class="news-right">
				<ul>
					<c:forEach items="${newList }" var="news">
						<!-- class="yyy" -->
						<li>
							<div class="green">
								<p>
									<fmt:formatDate value="${news.date }" pattern="dd" />
								</p>
								<p>
									<fmt:formatDate value="${news.date }" pattern="yyyy-MM" />
								</p>
							</div>
							<div class="new-text">
								<p>${news.title }</p>
								<p>${news.halfContent }</p>
								<div class="look">
									<p>查看详情</p>
									<span></span>
								</div>
							</div>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!-- 新闻结束 -->
		<div class="show-con">
			<div class="show-top">
				<p class="text1">经典案例</p>
				<p class="text2">Classic case</p>
			</div>
			<div class="show-pic">
				<ul>
					<li><div class="showpicq">
							<img src="images/Classic case01.png" />
						</div>
						<div class="showbox">
							<p>环境提升</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case02.png" />
						</div>
						<div class="showbox">
							<p>城市亮化</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case03.png" />
						</div>
						<div class="showbox">
							<p>旅游提升</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case04.png" />
						</div>
						<div class="showbox">
							<p>公园景观</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case05.png" />
						</div>
						<div class="showbox">
							<p>校园文化</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case06.png" />
						</div>
						<div class="showbox">
							<p>文化创意</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case07.png" />
						</div>
						<div class="showbox">
							<p>活动政策</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case08.png" />
						</div>
						<div class="showbox">
							<p>广告传媒</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case09.png" />
						</div>
						<div class="showbox">
							<p>园林绿化</p>
						</div></li>
					<li><div class="showpicq">
							<img src="images/Classic case10.png" />
						</div>
						<div class="showbox">
							<p>建筑装饰</p>
						</div></li>
				</ul>
			</div>

			<div class="show-rect">
				<ul>
					<c:forEach items="${caseList }" var="cases">
						<li><a href="javascript:void(0)">
								<div class="rectpic">
									<img src="images/${cases.cover }" />
								</div>
								<p class="rect-text1">大树集团</p>
								<div class="rect-line"></div>
								<p class="rect-text2">${cases.title }</p>
						</a> <a href="javascript:void(0)"> <span class="rect-more">&gt;More</span>
						</a></li>
					</c:forEach>
				</ul>
			</div>

			<div class="show-more">
				<a href="case.html"><p>More</p></a>
			</div>
		</div>

		<div class="work-con">
			<div class="work-top">
				<p class="text1">工匠精神</p>
				<p class="text2">Craftsman spirit</p>
			</div>
			<div class="work-pic">
				<ul>
					<li class="mark-time"><img src="images/Craftsman-spirit01.png" />
						<p>时间</p></li>
					<li class="mark-move"><img src="images/Craftsman-spirit02.png" />
						<p>不动</p></li>
					<li class="mark-base"><img src="images/Craftsman-spirit03.png" />
						<p>根基</p></li>
					<li class="mark-upup"><img src="images/Craftsman-spirit04.png" />
						<p>向上</p></li>
					<li class="mark-son"><img src="images/Craftsman-spirit05.png" />
						<p>阳光</p></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- 引入尾部 -->
	<%@include file="/end/floor.jsp"%>

	<script src='js/jquery-1.8.0.min.js' type="text/javascript"></script>
	<script src='js/allscript.js' type="text/javascript"></script>
	<script type="text/javascript">
		$(function() {

			$('.show-pic li').hover(function() {
				$(this).find('img').css({
					'border-radius' : '50%'
				});
				$(this).find('.showbox').css('opacity', '0');
			}, function() {
				$(this).find('img').css({
					'border-radius' : '0'
				});
				$(this).find('.showbox').css('opacity', '1');
			})
			$('.show-rect li').hover(function() {
				$(this).find('img').css('transform', 'scale(1.1)')
				$(this).find('.rect-text1').css('color', '#416a17');
				$(this).find('.rect-text2').css('color', '#416a17');
				$(this).find('.rect-line').css('background', '#416a17');
				$(this).find('.rect-more').css('color', '#416a17');
			}, function() {
				$(this).find('img').css('transform', 'scale(1)')
				$(this).find('.rect-text1').css('color', '#666');
				$(this).find('.rect-text2').css('color', '#666');
				$(this).find('.rect-line').css('background', '#ccc');
				$(this).find('.rect-more').css('color', '#999');
			})
			$('.show-more').hover(function() {
				$(this).addClass('morebg');
				$(this).find('p').css('color', '#fff');
			}, function() {
				$(this).removeClass('morebg');
				$(this).find('p').css('color', '#999');
			})
			$('.news-right li').hover(function() {
				var n = $(this).index();
				$('.news-left img').eq(n).fadeIn().siblings().fadeOut();
				$(this).addClass('yyy').siblings().removeClass('yyy');
				$(this).find('.new-text p').eq(0).css('color', '#8e0000');
			}, function() {
				$(this).find('.new-text p').eq(0).css('color', '#333');
			})
			$('.look').hover(function() {
				$(this).css('border', '1px solid #8e0000');
				$(this).find('p').css('color', '#8e0000');
				$(this).find('span').css('background-position', '-8px 0');
			}, function() {
				$(this).css('border', '1px solid #ccc');
				$(this).find('p').css('color', '#999');
				$(this).find('span').css('background-position', '0px 0');
			})

		});
	</script>
</body>
</html>
