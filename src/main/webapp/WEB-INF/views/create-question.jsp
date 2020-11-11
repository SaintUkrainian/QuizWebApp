<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/nav-bar.css" />
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
        <form:form modelAttribute="question" action="${pageContext.request.contextPath}/custom-quiz/add-question">
            <input type="hidden" name="quizName" value="${question.quizName}">
            <input type="text" name="question" placeholder="Question">
            <input type="text" name="firstAnswer" placeholder="First Answer">
            <input type="text" name="secondAnswer" placeholder="Second Answer">
            <input type="text" name="thirdAnswer" placeholder="Third Answer">
            <input type="text" name="fourthAnswer" placeholder="Fourth Answer">
            <input type="text" name="rightAnswer" placeholder="Right Answer">
            <input type="submit" name="Add Question">
        </form:form>
    </main>
</body>

</html>