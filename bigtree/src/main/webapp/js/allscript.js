//兼容各种浏览器
$(function() {
	// 轮播
	var w = 1920;
	var l = 0;
	var timer = null;
	var len = $(".scroll ul li").length * 2;
	$(".scroll ul").append($(".scroll ul").html()).css({
		'width' : len * w,
		'left' : -len * w / 2
	});
	timer = setInterval(init, 2000);
	function init() {
		$(".scroll .next").trigger('click');
	}
	$(".scroll ul li").hover(function() {
		clearInterval(timer);
	}, function() {
		timer = setInterval(init, 2000);
	});
	$(".prev").click(function() {
		l = parseInt($(".scroll ul").css("left")) + w;
		showCurrent(l);
	});
	$(".next").click(function() {
		l = parseInt($(".scroll ul").css("left")) - w;
		showCurrent(l);
	});
	function showCurrent(l) {
		if ($(".scroll ul").is(':animated')) {
			return;
		}
		$(".scroll ul").animate({
			"left" : l
		}, 500, function() {
			if (l == 0) {
				$(".scroll ul").css("left", -len * w / 2);
			} else if (l == (1 - len) * w) {
				$(".scroll ul").css('left', (1 - len / 2) * w);
			}
		});
	}
	$('.nav ul li').hover(function() {
		$(this).find('a').addClass('navbor');
	}, function() {
		$(this).find('a').removeClass('navbor');
	})
	$('.ft-add').toggle(function() {
		$('.ft-phone').fadeIn('200');
	}, function() {
		$('.ft-phone').fadeOut('30');
	})
})

function test(id) {
	var url = "/bigtree/loadSecondMenuu";
	var args = {
		"id" : id
	};
	$.post(url, args, function(data) {
		/* <span>企业文化</span> */
		var content = "<ul>";
		for ( var o in data) {
			content += "<span>" + data[o].name + "</span>";
		}
		content += "</ul>";
		if (id == 2) {
			$(".group-list").html(content);
		} else if (id == 3) {
			$(".case-list").html(content);
		} else if (id == 4) {
			$(".serve-list").html(content);
		} else if (id == 5) {
			$(".team-list").html(content);
		}
	});
}
