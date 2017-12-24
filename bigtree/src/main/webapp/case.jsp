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
	<!--展示-->
	<div class="container">
		<div class="show-con">
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
				<a href=""><p>More</p></a>
			</div>


		</div>



	</div>
	<!--底部-->
	<div class="foot">
		<div class="footer">

			<div class="footer-con">
				<div class="foot-top">
					<img src="images/footer_logo.png" />

				</div>
				<div class="foot-con">
					<ul>
						<li>
							<div class="foot-con-top">
								<p>关于大树</p>
							</div>

							<div class="foot-con-text ft-con-text">
								<p>
									大树坚守自然和谐、健康丰实的幸福<br />企业理念、努力弘扬、传播以“真善<br />美”为特质的正能量文化。成立以来<br />始终遵循并践行“生态景观”理念，<br />追求“虽由人作，宛自天开”之造园<br />意境。
								</p>
							</div>
						</li>

						<li>
							<div class="foot-con-top">
								<p>大树集团</p>
							</div>

							<div class="foot-con-text">
								<p>北京市密云区新北路银河花园36号</p>
							</div>
							<div class="foot-address">
								<div class="ft-add">
									<span></span>
									<p>一键发送定位</p>
								</div>
								<div class="ft-phone">
									<input type="text" name="" id="num" value=""
										placeholder="输入手机号码" /> <input type="submit" name="" id="sub"
										value="发送" />
								</div>
							</div>
						</li>

						<li>
							<div class="foot-con-top">
								<b>联系热线</b>
							</div>

							<div class="foot-con-text ft-t3">
								<b>010-89039106</b>
							</div> <img class="wechart" src="images/footer02.png" alt="" />
							<div class="ft-focus">
								<span class="fa "></span> <span class="text">关注我们</span> <span
									class="fb "></span>
							</div>


						</li>
					</ul>
				</div>
				<div class="foot-bot">
					<p>Copyright @ 2016 Apple lnc. 保留所有权利。隐私政策 使用条款 销售政策 网站地图</p>
				</div>

			</div>

		</div>

	</div>


	<script src='js/jquery-1.8.0.min.js' type="text/javascript"></script>
	<script src='js/allscript.js' type="text/javascript"></script>
	<script type="text/javascript">
		//兼容各种浏览器
		$(function() {

			$('.ad ul li').hover(
					function() {
						$(this).find('a').css("color", '#fff');
						$(this).siblings().find('a').css('color',
								'rgba(255,255,255,0.1)')
					}, function() {
						$('.ad ul li a').css("color", 'rgba(255,255,255,1)');
					})
			$('.ad ul li').click(function() {
				$(this).find('span').css('opacity', '1');
				$(this).siblings().find('span').css('opacity', '0');
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

		});
	</script>
</body>
</html>
