<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Restaurant list</title>
</head>
<body>
<section>
    <h2><a href="index.html">Home</a></h2>
    <h3>Restaurant list</h3>
    <hr>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Name</th>
            <th>Votes</th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${restaurantList}" var="restaurant">
            <jsp:useBean id="restaurant" scope="page" type="titarenko.project.javarestaurant.model.Restaurant"/>
            <tr>
                <td><a href="admin">${restaurant.name}</a></td>
                <td>${restaurant.votes.size()}</td>
                <td><a href="user?action=vote&id=${restaurant.id}">Vote</a></td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>
