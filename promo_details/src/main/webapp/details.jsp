<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
    <script src="${contextPath}/resources/js/jquery-1.12.4.js"></script>
    <script src="${contextPath}/resources/js/jquery-ui.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>


    <link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/promo.css">
    <title>Search Promotion</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-sm-8" style="background-color: #1b6d85; margin: 10%;height: 45%">
                <div class="row">
                    <div class="col-sm-2" style="float: right">
                        <a href="<spring:eval expression="@environment.getProperty('promo.search.url')" />">
                            <span style="color: white;">Back to Search</span>
                        </a>
                    </div>
                </div>
                <div class="row" style="background-color: brown;text-align: center;font-size: larger;color: white;font-family: monospace;">
                    <div class="col-sm-12">
                        LSCS
                    </div>
                </div>
                <div class="row" style="padding: 3%; line-height: 25px; color: white;font-family: monospace;">
                    <div class="col-sm-12">
                        <div class="row">
                            <div class="col-sm-4">
                                Promo Code
                            </div>
                            <div class="col-sm-8">
                              ${promoDetails.content.promotionOrChallengeCode}
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-4">
                                Promotion Type
                            </div>
                            <div class="col-sm-8">
                                ${promoDetails.content.promotionType}
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-4">
                                Promotion Name
                            </div>
                            <div class="col-sm-8">
                                ${promoDetails.content.promotionName}
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-4">
                                Promotion Description
                            </div>
                            <div class="col-sm-8">
                                ${promoDetails.content.description}
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-4">
                                Rules Restriction
                            </div>
                            <div class="col-sm-8">
                                ${promoDetails.content.rulesRestrictions.get(0).rules}
                            </div>
                        </div>
                    </div>
                </div>
                <%--<div class="row" style="background-color: brown;text-align: center;font-size: larger;color: white;font-family: monospace;">
                    <div class="col-sm-12">
                        Ventana
                    </div>
                </div>
                <div class="row" style="padding: 3%; line-height: 25px; color: white;font-family: monospace;">
                    Promo Code -
                    <br>
                    Tracker Type -
                    <br>
                    Goal -
                </div>--%>
            </div>
        </div>
    </div>
</body>
</html>
