<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TUYEN
  Date: 6/30/2020
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>mã chi tiết phòng</th>
        <th>Mã phòng</th>
        <th>Tên phòng</th>
        <th>Giá</th>
        <th>Mô tả</th>
        <th>Số phòng còn trống</th>
    </tr>
    <c:forEach var="room_detail" items="${list_room_details}">
        <tr>
            <td>${room_detail.id_room_details}</td>
            <td>${room_detail.id_room}</td>
            <td>${room_detail.name_room}</td>
            <td>${room_detail.price}</td>
            <td>${room_detail.description}</td>
            <td>${room_detail.amount}</td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
