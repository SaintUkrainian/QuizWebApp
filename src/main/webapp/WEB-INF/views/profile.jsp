<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"
%> <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            rel="stylesheet"
            href="${pageContext.request.contextPath}/styles/result.css"
        />
        <link
            rel="stylesheet"
            href="${pageContext.request.contextPath}/styles/nav-bar.css"
        />
        <title>Student's Profile</title>
    </head>
    <header>
        <div class="nav-bar">
            <div class="logo"><h1 style="text-decoration: underline; text-decoration-color: white;">Student's Profile</h1></div>
            <div class="user">
                <a href="${pageContext.request.contextPath}/">Home</a>
                <div class="user-info">
                    <form:form method="POST" action="${pageContext.request.contextPath}/logout" class="security-form">
                        <h3><security:authentication property="principal.username" /></h3>
                        <input type="submit" value="Logout" id="logout-btn">
                    </form:form>
                </div>
            </div>
        </div>
    </header>
    <body>
        <h1 style="margin: 10px 0px;">My Results:</h1>
        <ul>
            <c:forEach var="result" items="${results}">
                <li style="display: flex;flex-flow: column;margin-left: 10px; margin-bottom: 10px;">
                    <h3>
                        <span>${result.quizName}: </span>${result.result}% /
                        100%
                    </h3>
                    <p>Date: ${result.date}</p>
                    <hr style="width: 250pt; background-color: white; border: none; height: 2px;">
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
