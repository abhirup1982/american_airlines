<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <script src="${contextPath}/resources/js/jquery-1.12.4.js"></script>
    <script src="${contextPath}/resources/js/jquery-ui.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>


    <link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/promo.css">
    <title>Search Promotion</title>
    <script>
        $(document).ready(function() {
            $('#search').click(function(){
                var isValid = true;
                if($('#searchPromo').val() == "") {
                    var search = document.getElementById("searchPromo");
                    search.placeholder = "Required Field";
                    search.style.border = '2px solid #da1404';
                    isValid = false;
                }
                if(isValid) {
                    document.forms['searchForm'].submit()
                }
            });
        });
    </script>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-sm-6" style="background-color: #1b6d85; margin: 10%;height: 35%">
                <div class="button_box2" style="margin: 12%">
                    <span style="float: left;font-size: 25px;color: white;font-family: georgia;">Promotion Name</span>
                    <form:form id="searchForm" class="form-wrapper-2 cf" style="float: right" method="POST" action="/search">
                        <input type="text" name="searchPromo" id="searchPromo" placeholder="Search here..." />
                        <button type="button" id="search">Search</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
