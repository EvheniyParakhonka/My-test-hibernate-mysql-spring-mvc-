<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- обратите внимание на spring тэги -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>Index Page</title>
</head>

<body>
<c:forEach items="${userJSP}" var="lists">
    name: ${lists.firstTeam}  score: ${lists.scoreFirstTeam};
    name: ${lists.secondTeam} score: ${lists.scoreSecondTeam};
    <br>
</c:forEach>
</body>

</html>
