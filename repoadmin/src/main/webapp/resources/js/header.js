$(document).ready(function () {
	var str = $('#right_sidebar').css("display","block");
	
	$('.control-sidebar-dark').append(str);		
	$('.control-sidebar-dark').css('height','150px');
	$('[data-widget="pushmenu"]').on('click', function () {
	$('body').toggleClass('sidebar-collapse');
	
	})
});