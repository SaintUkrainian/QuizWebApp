<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java Quiz</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/quiz.css"/>
</head>
<body>
<div style="display: flex; justify-content: start;">
    
</div>
<form:form action="${pageContext.request.contextPath}/quiz/process" modelAttribute="usersAnswers" method="POST">
    <input type="hidden" name="name" value="${quiz.name}" />
    <c:forEach var="questionItem" items="${quiz.questions}">
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