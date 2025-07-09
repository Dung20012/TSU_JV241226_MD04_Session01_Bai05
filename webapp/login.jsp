
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>Đăng nhập</h1>
        <form action="#" method="get">
            <input type="text" name="username" placeholder="Tên đăng nhập"/> <br>
            <input type="password" name="password" placeholder="Mật nhẩu"> <br>
            <button>Đăng nhập</button>
        </form>
        <%--Hiển thị thông báo nếu sai--%>
        <% if (request.getAttribute("error") != null) { %>
        <p><%= request.getAttribute("error") %></p>
        <% } %>
</body>
</html>
