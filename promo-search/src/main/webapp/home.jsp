<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="${contextPath}/resources/js/jquery-1.12.4.js"></script>
    <script src="${contextPath}/resources/js/jquery-ui.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
    <script src="${contextPath}/resources/js/promo.js"></script>
    <script src="${contextPath}/resources/js/moment.js"></script>

    <link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/promo.css">
    <title>Search Promotion</title>
</head>
<body style="background: url('resources/img/flight.jpg') no-repeat center center fixed; -webkit-background-size: cover; -moz-background-size: cover; -o-background-size: cover; background-size: cover;">
    <div class="container">
        <div class="row">
            <div class="col-sm-8">
                <span style="color: white; font-size: 34px;">Promotion Search</span>
            </div>
            <div class="col-sm-4">
                <img src="resources/img/american-airlines.png" style="height: 18%"/>
            </div>
        </div>
        <form:form id="searchForm" method="POST" action="/search">
            <div class="row">
                <c:if test="${error != null}">
                    <label for="promoCode" style="color: red;font-size: small;letter-spacing: 1px;">PromotionCode  not  found !!!!</label>
                </c:if>
                <div class="col-sm-5" style="background: linear-gradient(white,#307286); height: 12%; border-radius: 30px">
                    <div class="row">
                        <div class="col-sm-6" style="padding-top: 5%">
                            <span style="float: left;font-size: 20px;">Promo Code</span>
                        </div>
                        <div class="col-sm-6" style="padding-top: 5%">
                            <input type="text" style="border-radius: 5px; float: right;width: 100%" name="promoCode" id="promoCode" class="code" placeholder="Search here..." />
                        </div>
                    </div>
                </div>
            </div>
            <div class="row" style="height: 4%;">

            </div>
            <div class="row">
                <div class="col-sm-5" style="background: linear-gradient(white,#30865a); height: 20%; border-radius: 30px">
                    <div class="row">
                        <div class="col-sm-6" style="padding-top: 5%">
                            <span style="float: left;font-size: 20px;">Promotion Name</span>
                        </div>
                        <div class="col-sm-6" style="padding-top: 5%">
                            <input type="text" style="border-radius: 5px; float: right;width: 100%" name="promoName" id="promoName" class="nmdesc" placeholder="Search here..." />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6" style="padding-top: 5%">
                            <span style="float: left;font-size: 20px;">Promotion Description</span>
                        </div>
                        <div class="col-sm-6" style="padding-top: 5%">
                            <input type="text" style="border-radius: 5px; float: right;width: 100%" name="promoDesc" id="promoDesc" class="nmdesc" placeholder="Search here..." />
                        </div>
                    </div>
                </div>
            </div>
            <div class="row" style="height: 4%;">

            </div>
            <div class="row">
                <div class="col-sm-5" style="background: linear-gradient(white,#8d9e2c); height: 20%; border-radius: 30px">
                    <div class="row">
                        <div class="col-sm-6" style="padding-top: 5%">
                            <span style="float: left;font-size: 20px;">Promotion Start Date</span>
                        </div>
                        <div class="col-sm-6" style="padding-top: 5%">
                            <input type="text" style="border-radius: 5px; float: right;width: 100%" name="promoStartDt" id="promoStartDt" class="dt" placeholder="Search here..." />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6" style="padding-top: 5%">
                            <span style="float: left;font-size: 20px;">Promotion End Date</span>
                        </div>
                        <div class="col-sm-6" style="padding-top: 5%">
                            <input type="text" style="border-radius: 5px; float: right;width: 100%" name="promoEndDt" id="promoEndDt" class="dt" placeholder="Search here..." />
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-5">
                    <div class="row">
                        <div class="col-sm-6" style="padding-top: 5%;padding-left: 15%">
                            <div class="btn">
                                <input class="button6" type="button" value="Search" id="searchPromo">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form:form>
    </div>
</body>
</html>
