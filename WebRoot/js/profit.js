$(document).ready(function(){
alert(1);
			$('#tiepianMan').click(function(){
				$('#tiepianManDiv').show();
				$('#otherManDiv').hide();
			});
			$('#otherMan').click(function(){
				$('#tiepianManDiv').hide();
				$('#otherManDiv').show();
			});
			$('#addTP').click(function(){
				$('#qwindow_mask').show();
				$('#qwindow').show();
			});
		});
