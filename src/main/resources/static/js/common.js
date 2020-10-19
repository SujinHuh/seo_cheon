
var
	chartOptions = {
		scaleShowVerticalLines: false,
		responsive: true,
		legend: {
			position: 'top'
		},
		scales: {
			xAxes: [{
				type: 'time',
				time: {
					unit: 'hour',
					stepSize: 0.5,
					displayFormats: {
						hour: 'HH:mm'
					}
				}
			}],
			yAxes: [{
				ticks: {
					min :0,
					max : 100,
					stepSize: 10
				},
			}]
		}
	};


var chartDataSet = {
	labels: [],
	datasets: [
		{
			label: '',
			borderColor: 'blue',
			data: []
		}
	]
};


var tempid =null;
function loadSpinner(){
	var target = $("#container");

	var maskHeight = $(target || window).outerHeight(true);
	var maskWidth = $(target || window).outerWidth(true);
	var obj = target.offset();

	// #div의 현재 위치
	//console.log("left: " + obj.left + "px, top: " + obj.top + "px");
	tempid = 'target_div';
	/*트리그리드는...자식노드 그릴려고..자꾸 반복한다...그래서 생성된 spin 그리드가 존재하면 우선 지운다...*/
	if($("#"+tempid).length > 0){
		$("#"+tempid).remove();
	}

	var bgDiv = $('<div id="'+tempid+'"/>');
	bgDiv.css({
		zIndex:99999999,
		position:'absolute',
		top: obj.top,
		left:obj.left,
		width:'100%',
		height:'100%',
		opacity:0.4
	});

	bgDiv.css("background-color","white");
	bgDiv.css("display","none");

	bgDiv.appendTo(target);
	bgDiv.show();
	bgDiv.spin();
}


function stopspin(){
	$("#target_div").spin(false);
	$("#target_div").hide();
}
