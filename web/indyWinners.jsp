<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Indy Winners</title>
</head>
<body>
    <h1>Indy Winners List</h1>
    <table border="1">
        <tr>
            <th>Year</th>
            <th>Driver</th>
            <th>Average Speed</th>
            <th>Country</th>
        </tr>
        <c:forEach var="winner" items="${winners}">
            <tr>
                <td>${winner.year}</td>
                <td>${winner.driver}</td>
                <td>${winner.averageSpeed}</td>
                <td>${winner.country}</td>
            </tr>
        </c:forEach>
    </table>
    <form method="get" action="IndyWinnerServlet">
        <input type="hidden" name="page" value="${currentPage + 1}">
        <input type="submit" value="Next Page">
    </form>
</body>
</html>
