<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/nav-bar.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/create-question.css" />
    <style>
        .error {
            margin: auto;
            color: red;
            font-weight: bold;
        }
    </style>
    <title>Custom Quizes</title>
</head>

<body>
    <header>
        <div class="nav-bar">
            <div class="logo">
                <h1 style="text-decoration: underline; text-decoration-color: white;">Custom Quizes</h1>
            </div>
            <div class="user">
                <a href="${pageContext.request.contextPath}/profile">My Profile</a>
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
    <main>
        <form:form class="question-form" modelAttribute="question"
            action="${pageContext.request.contextPath}/custom-quiz/add-question">
            <input type="hidden" name="quizName" value="${question.quizName}">
            <div class="question-container">
                <form:errors path="question" cssClass="error" />
                <textarea type="text" name="question" placeholder="Question"></textarea>
            </div>
            <div class="answers-container">
                <div class="answer-container">
                    <form:errors path="firstAnswer" cssClass="error" />
                    <input class="answer-input" type="text" name="firstAnswer" placeholder="First Answer">
                </div>
                <div class="answer-container">
                    <form:errors path="secondAnswer" cssClass="error" />
                    <input class="answer-input" type="text" name="secondAnswer" placeholder="Second Answer">
                </div>
                <div class="answer-container">
                    <form:errors path="thirdAnswer" cssClass="error" />
                    <input class="answer-input" type="text" name="thirdAnswer" placeholder="Third Answer">
                </div>
                <div class="answer-container">
                    <form:errors path="fourthAnswer" cssClass="error" />
                    <input class="answer-input" type="text" name="fourthAnswer" placeholder="Fourth Answer">
                </div>
            </div>
            <div class="rightAnswer-container answer-container">
                <form:errors path="rightAnswer" cssClass="error" />
                <input class="answer-input" type="text" name="rightAnswer" placeholder="Right Answer">
            </div>
            <input class="add-button answer-input" type="submit" name="Add Question">
        </form:form>
    </main>
</body>

</html>