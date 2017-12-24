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
		<div class="ourteam">
			<div class="ourteam t-top">
				<p class="p1">我们团队</p>
				<p class="p2">Our team</p>
			</div>
			<div class="team-pic">
				<div class="pic-one">
					<ul>
						<c:forEach items="${employeeList }" var="employee" begin="0"
							end="5">
							<li><img src="images/${employee.img }" />
								<div class="yy">
									<p class="pys1">${employee.name }</p>
									<p class="pys2">${employee.development.name }</p>
								</div></li>
						</c:forEach>
					</ul>
				</div>
				<div class="pic-one">
					<ul>
						<c:forEach items="${employeeList }" var="employee" begin="6"
							end="6">
							<li style="float: left; margin-right: 10px;"><img
								src="images/${employee.img }" />
								<div class="yy">
									<p class="pys1">${employee.name }</p>
									<p class="pys2">${employee.development.name }</p>
								</div></li>
						</c:forEach>
						<div class="greenbig">
							<p>以树为鉴，茁壮成长</p>
							<p>大树集团，以勤劳砥砺品性，以思想创造未来</p>
						</div>
					</ul>
				</div>
				<div class="pic-one">
					<ul>
						<c:forEach items="${employeeList }" var="employee" begin="7"
							end="12">
							<li><img src="images/${employee.img }" " />
								<div class="yy">
									<p class="pys1">${employee.name }</p>
									<p class="pys2">${employee.development.name }</p>
								</div></li>
						</c:forEach>
					</ul>
				</div>
			</div>


		</div>


		<div class="talent">
			<div class="talent-top t-top">
				<p class="p1">人才招聘</p>
				<p class="p2">Talent recruitment</p>
			</div>
			<div class="talent-con">
				<div class="talent-jp">
					<ul>
						<ol>
							<span>招聘职位</span>
							<span>招聘人数</span>
							<span>学历要求</span>
							<span>工作地点</span>
							<span>工作经验</span>
							<span>操作</span>
						</ol>
						<c:forEach items="${recruitList }" var="recruit">
							<li><span>${recruit.name }</span> <span>${recruit.count }</span>
								<span>${recruit.record }</span> <span>${recruit.company.address }</span>
								<span>${recruit.experience }</span> <span class="jjpic"></span>
								<div>
									<ul>${recruit.reqired }
									</ul>
								</div></li>
						</c:forEach>
					</ul>
				</div>

				<div class="talent-info">
					<form action="" method="post">
						<lable>姓名</lable>
						<input type="text" class="massage" />
						<lable>电话</lable>
						<input type="text" class="massage" />
						<lable>求职岗位</lable>
						<input type="text" class="massage" />
						<button>提交</button>
					</form>
				</div>
			</div>

		</div>





	</div>
	<!--底部-->
	<!-- 引入尾部 -->
	<%@include file="/end/floor.jsp"%>

	<script src='js/jquery-1.8.0.min.js' type="text/javascript"></script>
	<script src='js/allscript.js' type="text/javascript"></script>
	<script type="text/javascript">
		$(function() {
			$('.talent-jp li').hover(function() {
				$(this).css({
					'background' : '#416a17',
					'height' : '200px'
				}).siblings().css('height', '60px');
				$(this).find('div').fadeIn(20);
				$(this).find('.jjpic').css('background-position', '-28px 0')
				$(this).find('span').css('color', '#fff');
			}, function() {
				var n = $(this).index();
				if ((n % 2) == 0) {
					$(this).css({
						'background' : '#f1f1f1',
						'height' : '60px'
					});
					$(this).find('div').fadeOut(20);
					$(this).find('.jjpic').css('background-position', '0 0');
					$(this).find('span').css('color', '#333');
				} else {
					$(this).css({
						'background' : '#e1e1e1',
						'height' : '60px'
					});
					$(this).find('div').fadeOut(20);
					$(this).find('.jjpic').css('background-position', '0 0');
					$(this).find('span').css('color', '#333');
				}
			})
		})
	</script>
</body>
</html>
