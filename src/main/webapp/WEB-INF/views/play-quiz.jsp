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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/quiz.css" />
    <link
            rel="stylesheet"
            href="${pageContext.request.contextPath}/styles/nav-bar.css"
        />
</head>
<header>
    <div class="nav-bar">
        <div class="logo">
            <h1 style="text-decoration: underline; text-decoration-color: white;">${quiz.quizName}</h1>
        </div>
        <div class="user">
            <a href="${pageContext.request.contextPath}/">Home</a>
            <div class="user-info">
                <form:form method="POST" action="${pageContext.request.contextPath}/logout" class="security-form">
                    <h3>
                        <security:authentication property="principal.username" />
                    </h3>
                    <input type="submit" value="Logout" id="logout-btn">
                </form:form>
            </div>
        </div>
    </div>
</header>

<body>
    <form:form action="${pageContext.request.contextPath}/custom-quiz/result/${quiz.quizName}" modelAttribute="usersAnswers" method="POST">
        <c:forEach var="questionItem" items="${quiz.createdQuestions}">
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