<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/home.css">
    <title>Home Page</title>
</head>

<body>
    <header>
        <div class="nav-bar">
            <a href="${pageContext.request.contextPath}/profile">My Profile</a>
            <div class="user-info">
                <form:form method="POST" action="${pageContext.request.contextPath}/logout" class="security-form">
                    <h3><security:authentication property="principal.username" /></h3>
                    <input type="submit" value="Logout" id="logout-btn">
                </form:form>
            </div>
        </div>
    </header>
    <main>
        <h1>Select a Quiz!</h1>
        <ul class="quiz-items">
           <!-- <li><a href="${pageContext.request.contextPath}/quiz/java">Java Basics Quiz</a></li> 
           <li><a href="${pageContext.request.contextPath}/quiz/english">English Basics Quiz</a></li> -->
           <c:forEach var="quiz" items="${quizes}">
            <li><a href="${pageContext.request.contextPath}/quiz/selected/${quiz.name}">${quiz.name} Quiz</a></li>
           </c:forEach>
        </ul>
    </main>

</body>

</html>