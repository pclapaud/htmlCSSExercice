<%--
  Created by IntelliJ IDEA.
  User: patou
  Date: 14/11/2018
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>${titre}</title>
</head>
<style>
    div{border-style: double;
        border-color: black;
        border-width: 2px;
        min-height:20px;
        min-width:20px;
        }
    .valeur{background: turquoise}
    .control{background: red}
    .reel{background: green}

</style>
<body>
<h1>${titre}</h1>
<table>
    <tbody>
    <tr>
    <c:forEach items="${mesnombresControl}" var="nbr" >
            <td>
                <div class="control">${nbr.affichage}</div> <div class="reel">&#${nbr.nombre};</div>
            </td>
    </c:forEach>
        <br>
    </tr>
    <tr>
    <c:forEach items="${mesnombres}"  var="nbr" varStatus="status">
            ${status.index%32==0?'</tr><tr>':''}
            <td>
                    <div class="valeur">${nbr.affichage}</div> <div class="reel">&#${nbr.nombre};</div>
            </td>
    </c:forEach>
    </tr>

    </tbody>
</table>
</body>
</html>
