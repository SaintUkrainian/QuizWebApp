<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/nav-bar.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/custom-quizes.css" />
    <title>Custom Quizes</title>
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
    <main class="container">
        <h1 style="color: salmon; padding: 10px;">Custom Quizes</h1>
        <div class="custom-quizes">
            <c:forEach var="quiz" items="${customQuizes}">
                <a href="${pageContext.request.contextPath}/custom-quiz/selected/${quiz.quizName}" class="quiz-name">${quiz.quizName}</a>
            </c:forEach>
        </div>

        <div class="link">
            <a href="${pageContext.request.contextPath}/custom-quiz/create">Create new Quiz</a>
        </div>
    </main>
</body>

</html>