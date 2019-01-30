<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999/xhtml">
<!--head部分-->
<head>
	<title></title>
	<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
</head>
<body>
	名字:${name}</br>      <!# 注释，输出名称>
	
	订单名称：${order.order_name}</br>
	
	订单备注：${order.remark?if_exists} </br>   <!#存在就输出值，不存在输出空字符串 >

         下单人：${order.uid?default('cjl001')}  <!#设置默认值，null才有效，""无效 >
           ${order.uid!'cjl001'} </br>
           
        下 单时间：${order.order_time?string('yyyy-MM-dd')}   ${order.order_time?string('yyyy-MM-dd HH:mm:ss')}  <!#格式化时间 > </br>
       
        订单金额：${order.order_money?string.currency}   <!#金额转换  ￥123 > </br>
   <!# sring.number  数字转换>   <!# sring.percent  百分比>  
       设置小数点位数： <#setting number_format = "#"/>${order.order_money}  <#setting number_format = "#.00"/>${order.order_money}
   </br>
   
       订单是否有效：${order.valid?string('有效', '无效')}    <!# 布尔值转换中文></br>
   
   
       订单状态：
    <#if order.status == 1>
             订单已付款 
    <#elseif order.status == 2>
            订单已过期       
    <#else>
           订单待付款
	</#if>
	
	<#switch order.status>
		<#case 1>
		已付款
		<#break>
		<#case 2>
		已过期 
		<#break>
		<#default>
		待付款
	</#switch>
	</br>
	
	定义变量:<#assign name="test"/>
	${name}
	</br>
	
	<p>订单列表
	<table>
		<tr><td>编号</td><td>名称</td><td>金额</td><td>状态</td><td>下单时间</td></tr>
		<#list olist as order>
			<tr><td>${order.order_no}</td><td>${order.order_name}</td><td>${order.order_money?string.currency}</td><td>${order.status}</td><td>${order.order_time?string('yyyy-MM-dd')}</td></tr>
		</#list>
	</table>
	
	<#include "footer.ftl"/>
</body>
<script type="text/javascript" src="jquery-2.1.1.min.js"></script>
</html>