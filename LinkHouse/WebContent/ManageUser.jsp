<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.chinasoft.app.domain.Emp"%>
<%@page import="java.util.List"%>
<html>
<head>
    <title>用户管理</title>
    <link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="css/main.css" />
    <link rel="stylesheet" href="css/ManageUser.css">
    <link rel="stylesheet" href="css/paging.css">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
</head>
<body>
<div class="admin-main">
    <div id="main">
            <span class="title1">
            <a href="">用户管理</a>
            </span>
        <div class="layui-btn-group globalHight">
            <button class="layui-btn">增加</button>
            <button class="layui-btn">查询</button>
            <button class="layui-btn">帮助</button>
        </div>
        <form id="NewSale" action="" method="post">

            <table class="layui-table">
                <colgroup>
                    <col width="100">
                    <col width="100">
                    <col width="60">
                    <col width="70">
                    <col width="150">
                    <col width="150">
                    <col width="150">
                    <col width="100">
                    <col width="100">
                </colgroup>
                <tbody>
                <tr>
                    <td>员工编号</td>
                    <td>用户名称</td>
                    <td>性别</td>
                    <td>手机号</td>
                    <td>电子邮箱</td>
                    <td>生日</td>
                    <td>入职日期</td>
                    <td>角色</td>
                    <td>操作</td>
                </tr>
                <%
				List<Emp> list =(List<Emp>)request.getAttribute("list");
				for(Emp emp:list){%>
                    <tr>
						<td><%=emp.getEid() %></td>
						<td><%=emp.getEname() %></td>
						<td><%=emp.getSex() %></td>
						<td><%=emp.getPhone() %></td>
						<td><%=emp.getEmail() %></td>
						<td><%=emp.getBirthday() %></td>
						<td><%=emp.getDate() %></td>
						<td><%=emp.getRole().getRname() %></td>
                    <td>
                        <i class="layui-icon">&#xe613;</i>
                        <i class="layui-icon">&#x1006;</i>
                    </td>
                </tr><%}
					%>
                </tbody>
            </table>
        </form>
        <div id="demo7"></div>


    </div>
</div>
<div class="box" id="box"></div>
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/paging1.js"></script>
    <script>
        var setTotalCount = 301;
        $('#box').paging({
            initPageNo: 1, // 初始页码
            totalPages: 100, //总页数
            slideSpeed: 600, // 缓动速度。单位毫秒
            jump: true, //是否支持跳转
            callback: function(page) { // 回调函数
              console.log(page);
             alert(page);
    
          //  location.href="emp!findPage?page="+page;
               
            }
        })
    </script>
</body>
</html>