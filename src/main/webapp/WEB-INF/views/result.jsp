<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <script src="https://unpkg.com/axios/dist/axios.min.js" defer></script>
        <script
            src="${pageContext.request.contextPath}/scripts/script.js"
            defer
        ></script>
        <link
            rel="stylesheet"
            href="${pageContext.request.contextPath}/styles/nav-bar.css"
        />
        <title>Quiz App</title>
    </head>
    <header>
        <div class="nav-bar">
            <div class="logo"><h1 style="text-decoration: underline; text-decoration-color: white;">Result</h1></div>
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

    <body style="background-color: #ccc;">
        <div style="display: flex; flex-direction: column; justify-content: center; height: 50vh;">
            <h1 style="margin: auto;">
                <security:authentication property="principal.username" />:
                ${result}% / 100%
            </h1>
        </div>
        
    </body>
</html>
