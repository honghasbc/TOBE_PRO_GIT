var geoname_id='honghasbc';

$(document)
		.ready(
				function() {
					$('.toprightHeaderIcons')
							.on(
									{
										'click' : function() {
											if ($(this).hasClass('icon-chevron-up')) {
												$(this)
														.removeClass('icon-chevron-up')
														.addClass('icon-chevron-down');
												$(this).parents('.panel-heading').siblings(
														'.panel-body').hide();
											} else if ($(this).hasClass(
													'icon-chevron-down')) {
												$(this).removeClass('icon-chevron-down')
														.addClass('icon-chevron-up');
												$(this).parents('.panel-heading').siblings(
														'.panel-body').show();
											}
										}
									}); /* toprightHeaderIcons */

					$('.icon-calendar').on({
						'click' : function() {
							$(this).parent().siblings("input")[0].focus();
						}
					}); /* icon-calendar */

					$(".totop").hide(); // hide the 'topcontrol' at the
					// beginning

					$(window).scroll(
							function() {
								// scrolled past the div "page"?
								if ($(window).scrollTop() > $(".page-header")
										.offset().top) {
									$(".totop").show();

								} else {
									$(".totop").hide(1000);
								}

							}); /* window.scroll */

				}

		);
		
(function($) {
$.fn.serializeFormJSON = function() {

   var o = {};
   var a = this.serializeArray();
   $.each(a, function() {
       if (o[this.name]) {
           if (!o[this.name].push) {
               o[this.name] = [o[this.name]];
           }
           o[this.name].push(this.value || '');
       } else {
           o[this.name] = this.value || '';
       }
   });
   return o;
};
})(jQuery);

// Loading common
function ajaxLoader (el, options) {
	// Becomes this.options
	var defaults = {
		bgColor 		: '#fff',
		duration		: 0,
		opacity			: 0.7,
		classOveride 	: false
	};
	this.options 	= jQuery.extend(defaults, options);
	this.container 	= $(el);
	
	this.init = function() {
		var container = this.container;
		// Delete any other loaders
		this.remove(); 
		// Create the overlay 
		var overlay = $('<div></div>').css({
				'background-color': this.options.bgColor,
				'opacity':0.7,
				'width':container.width(),
				'height':container.height(),
				'position':'absolute',
				'top':'45px'
		}).addClass('ajax_overlay');
		// add an overiding class name to set new loader style 
		if (this.options.classOveride) {
			overlay.addClass(this.options.classOveride);
		}
		// insert overlay and loader into DOM 
		container.append(
			overlay.append(
				$('<div></div>').addClass('ajax_loader')
			).fadeIn(this.options.duration)
		);
    };
	
	this.remove = function(){
		var overlay = this.container.children(".ajax_overlay");
		if (overlay.length) {
			overlay.fadeOut(this.options.classOveride, function() {
				overlay.remove();
			});
		}	
	};

    this.init();
}	

//function for edit panel -------------BEGIN
function setEditPanel(id,url){	
	$("#edit-" + id + "-btn").click(function(e) {
    	editStatusChangeTextForm(id);	
		editStatusChangeButton(id);
    });
	$("#normal-" + id + "-btn").click(function(e) {
		revertStatusChangeTextForm(id);
    	normalStatusChangeButton(id);
    });
	$("#save-" + id + "-btn").click(function(e) {
		saveStatusChangeTextForm(id,url);    	
    });
}
function editStatusChangeTextForm(id){
	//show tab edit
	$("[id^=panel-" + id + "-view]").hide();
	$("[id^=panel-" + id + "-edit]").show();
	//apply value
	var arrView = $("[id^=input-" + id + "]");
	$.each( arrView, function() {
		if($('#edit-' + this.id).attr('type')=='checkbox'){
			$('#edit-' + this.id).attr('checked', this.checked);
		}else{
			$('#edit-' + this.id).val(this.value);
		}
	});
}
function editStatusChangeButton(id){
	$('#' + id + '-btn-normal').hide();
	$('#' + id + '-btn-editable').show();	
}
function revertStatusChangeTextForm(id){
	//show tab normal
	$("[id^=panel-" + id + "-view]").show();
	$("[id^=panel-" + id + "-edit]").hide();
}
function saveStatusChangeTextForm(id,url){
	var loadingCycle = new ajaxLoader("#loadingId");
	var dataPost = $('#' + id + '-form-edit').find("select,textarea,input").serializeFormJSON();
	$.ajax(
		{
			type : "POST",
			url : url,
			data: dataPost
		}).done(function(data) {
			if(loadingCycle) loadingCycle.remove();
			displayMessage($("#" + id + "-message"),data,3000);
			
			//show tab normal
			$("[id^=panel-" + id + "-view]").show();
			$("[id^=panel-" + id + "-edit]").hide();
			var arrView = $("[id^=edit-input-" + id + "]");
			$.each( arrView, function() {
				if($('#' + this.id.substring(5)).attr('type')=='checkbox'){
					$('#' + this.id.substring(5)).attr('checked',this.checked);
				}else{
					$('#' + this.id.substring(5)).val(this.value);
				}
				
				$('#' + this.id.substring(5)).trigger('input');
			});
			normalStatusChangeButton(id);
		}).error(function(){
			if(loadingCycle) loadingCycle.remove();
			displayMessage($("#" + id + "-message"),false,3000);
		}
	);
}
function normalStatusChangeButton(id){
	$('#' + id + '-btn-normal').show();
	$('#' + id + '-btn-editable').hide();	
}
//function for edit panel -------------END

function displayMessage(selector,type,deplay){
	if(type){
		selector.html('Update successful');
		selector.attr('class','alert alert-success');		
	}else{
		selector.html('Update unsuccessful.');
		selector.attr('class','alert alert-danger');
	}
	selector.alert();
	window.setTimeout(function() { selector.alert('close'); }, deplay);
}

function autoNextControl(value,control2,num){
console.log('ss' + value);
	if(value.length==num){
		control2.focus();
	}
}
