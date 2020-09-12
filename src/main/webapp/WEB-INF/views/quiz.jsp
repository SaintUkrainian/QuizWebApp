<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quiz App</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/style.css"/>
    <script src="https://unpkg.com/axios/dist/axios.min.js" defer></script>
    <script src="${pageContext.request.contextPath}/scripts/script.js" defer></script>
</head>
<body>
    <div style="display: flex; justify-content: start;">
        <form:form method="POST" action="${pageContext.request.contextPath}/logout" style="display: flex; align-items: center;">
            <h1>Student: <span style="font-weight: lighter;" id="username"><security:authentication property="principal.username"/></span></h1>
            <input type="submit" value="Logout" style="margin: 10px;">
        </form:form>
    </div>
    <form:form action="${pageContext.request.contextPath}/process" modelAttribute="usersAnswers" method="POST">
        <c:forEach var="questionItem" items="${questionsData}">
            <div class="full-container">
                <div class="question-container">
                    <h2>${questionItem.question}</h2>
                </div>
                <div class="answers-container">
                    <div class="answer">
                        <input type="checkbox" value="${questionItem.firstAnswer}" name="answers">
                        <h3>${questionItem.firstAnswer}</h3>
                    </div>
                    <div class="answer">
                        <input type="checkbox" value="${questionItem.secondAnswer}" name="answers">
                        <h3>${questionItem.secondAnswer}</h3>
                    </div>
                    <div class="answer">
                        <input type="checkbox" value="${questionItem.thirdAnswer}" name="answers">
                        <h3>${questionItem.thirdAnswer}</h3>
                    </div>
                    <div class="answer">
                        <input type="checkbox" value="${questionItem.fourthAnswer}" name="answers">
                        <h3>${questionItem.fourthAnswer}</h3>
                    </div>
                </div>
            </div>
        </c:forEach>
        <input type="submit" value="Get Results" id="submit-btn">
    </form:form>
</body>
</html>