<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quiz App</title>
    <script src="https://unpkg.com/axios/dist/axios.min.js" defer></script>
    <script src="${pageContext.request.contextPath}/scripts/script.js" defer></script>
</head>

<body>
    <h1>
        <security:authentication property="principal.username" />: ${result}
    </h1>
</body>

</html>