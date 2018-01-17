<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <script src="${contextPath}/resources/js/jquery-1.12.4.js"></script>
    <script src="${contextPath}/resources/js/jquery-ui.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>


    <link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/promo.css">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-sm-9" style="margin: 10%;height: 35%">
                <c:if test="${searchResults.size() > 0}">
                    <table class="searchPromos">
                        <thead>
                            <tr>
                                <th>Promo Code</th>
                                <th>Promo Name</th>
                                <th>Promo Start Date</th>
                                <th>Promo End Date</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="searchResult" items="${searchResults}">
                                <tr>
                                    <td><a href="<spring:eval expression="@environment.getProperty('promo.details.url')" />/promoDetails?promoCode=${searchResult.promoCode}">${searchResult.promoCode}</a></td>
                                    <td>${searchResult.promoName}</td>
                                    <td>${searchResult.promoStartDt}</td>
                                    <td>${searchResult.promoEndDt}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </div>
        </div>
    </div>
</body>
</html>
