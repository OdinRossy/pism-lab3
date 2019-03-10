<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Упс..</title>
        <%--favicon--%>
        <%--<link rel="shortcut icon" type="image/png" href="http://localhost:8080/pism-lab3/assets/racing.png"/>--%>
        <%--bootstrap.min.css--%>
        <link rel="stylesheet" href="http://localhost:8080/pism-lab3/style/bootstrap.min.css">
        <%--own style--%>
        <link rel="stylesheet" href="http://localhost:8080/pism-lab3/style/error.css">
    </head>
    <body>
        <div class="container-fluent">
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-10 error-container">
                    <div class="error-code">
                        <span>404</span>
                    </div>
                    <div class="error-message">
                        <span>Кажется, запрашиваемый Вами ресурс не найден :(</span>
                    </div>
                    <div class="button-container">
                        <a href="user" class="btn btn-warning btn-lg" role="button">На главную</a>
                    </div>
                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</html>