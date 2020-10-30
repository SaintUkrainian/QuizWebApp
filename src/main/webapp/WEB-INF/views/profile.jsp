<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Student's Profile</title>
</head>
<body>
    <h1>This is a Student's Profile</h1>
    <h3><security:authentication property="principal.username" /></h3>
    <div>Results:</div>
    <ul>
        <c:forEach var="result" items="${results}">
            <li style="display: flex;">
                <h3>Date: ${result.date}</h3>
                <h3 style="margin-left: 10px;"><span>${result.quizName}: </span>${result.result}% / 100%</h3>
            </li>
        </c:forEach>
    </ul>
</body>
</html>