<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/nav-bar.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/create-quiz.css" />
    <title>Custom Quizes</title>
    <style>
        .error {
            margin: auto;
            color: red;
            font-weight: bold;
            font-size: 24px;
        }
    </style>
</head>

<body>
    <header>
        <div class="nav-bar">
            <div class="logo">
                <h1 style="text-decoration: underline; text-decoration-color: white;">Custom Quizes</h1>
            </div>
            <div class="user">
                <a href="${pageContext.request.contextPath}/custom-quiz/">Custom Quizes</a>
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
        <form:form class="create-quiz-form" modelAttribute="quiz" action="${pageContext.request.contextPath}/custom-quiz/add-quiz" method="POST">
            <input type="hidden" name="id" />
            <form:errors path="quizName" cssClass="error" />
            <input class="input" type="text" name="quizName" placeholder="Quiz Name">
            <input class="add-button" type="submit" value="Create">
        </form:form>
    </main>
</body>

</html>