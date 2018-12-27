/*
 *	主要完成ajax交互相关功能 
 */

/**
 * 创建一个ajax对象XMLHttpRequest
 */
function getAjaxObj(){
	var xmlHttp=null;
	try{
		// Firefox, Opera 8.0+, Safari
		xmlHttp=new XMLHttpRequest();
	}catch (e){
		// Internet Explorer
		try{
			xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		}catch (e){
			xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	return xmlHttp;
}


/**
 * 检测手机号
 * @param ipt
 * @returns
 */
function checkPhone(ipt){
	if(!ipt.value.match(/1\d{10}/g)){//正则 手机号码  / /g 正则表达式的边界
		alert("不是一个手机号码");
		return;
	}
	//1 创建ajax对象
	var ajax = getAjaxObj();
	//2 准备请求
	var url = "http://localhost:8080/004_SpringMVC_template/student/checkPhone/"+ipt.value;
	ajax.open("GET",url,true);
	//3 设置状态改变的监听
	ajax.onreadystatechange=function(){
		if (ajax.readyState==4 && ajax.status==200) {
			var sp = document.getElementById("phoneSpan");
			sp.style.marginLeft = "5px";
			if(ajax.responseText == "true"){
				sp.innerHTML="手机号已经绑定，请换一个手机号！";
				sp.style.color = 'red';
				ipt.style.borderColor= 'red';
			}else{
				sp.innerHTML="手机号正常";
				sp.style.color = 'green';
				ipt.style.borderColor= '';
			}
		}
	};
	//4 发送请求
	ajax.send();
}

/**
 * 处理天气信息
 * @returns
 */
function parseAjaxData(jsonData){
	alert(1)
	document.getElementById("_date").innerHTML = jsonData.result.today.date_y;
	document.getElementById("_week").innerHTML = jsonData.result.today.week;
	document.getElementById("_city").innerHTML = jsonData.result.today.city;
	document.getElementById("_weather").innerHTML = jsonData.result.today.weather;
	document.getElementById("_temp").innerHTML = jsonData.result.sk.temp+"℃";
}
/**
 * 这个是从聚合天气数据直接获取后进行处理
 * @param jsonData
 * @returns
 */
function weatherData(jsonData){
	document.getElementById("_date").innerHTML = jsonData.result.today.date_y;
	document.getElementById("_week").innerHTML = jsonData.result.today.week;
	document.getElementById("_city").innerHTML = jsonData.result.today.city;
	document.getElementById("_weather").innerHTML = jsonData.result.today.weather;
	document.getElementById("_temp").innerHTML = jsonData.result.sk.temp+"℃";
}

/**
 * 设置用户名称的
 * @param data
 * @returns
 */
function userData(data){
	document.getElementById("username").innerHTML = data.name;
}


/**
 * 刷新天气
 * @returns
 */
function refreshWeather(){
	$.get("http://localhost:8080/002_SpringMVC_RequestMapping/weather/save",
			function(data){
		//alert("Data Loaded: " + data);
		setTimeout(function(){  //使用  setTimeout（）方法设定定时2000毫秒
			window.location.reload();//页面刷新
		},5000);
	});
}




