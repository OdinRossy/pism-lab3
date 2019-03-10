<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>${username}</title>
        <%--favicon--%>
        <%--<link rel="shortcut icon" type="image/png" href="http://localhost:8080/pism-lab3/assets/racing.png"/>--%>
        <%--bootstrap.min.css--%>
        <link rel="stylesheet" href="http://localhost:8080/pism-lab3/style/bootstrap.min.css">
        <%--own style--%>
        <link rel="stylesheet" href="http://localhost:8080/pism-lab3/style/main.css">
    </head>
    <body>
        <div class="container-fluent">
            <div class="row row-center">
                <div class="col-md-1"></div>
                <div class="col-md-10 rounded-container">
                    <h2>Здравствуйте, <span class="badge badge-success">${username}</span></h2>
                    <div>
                        <img src="https://img1.autospot.ru/images/bmw/m4/303211" alt="">
                    </div>
                    <a href="questions" role="button" class="btn btn-primary btn-lg">Заполнить анкету</a>
                    <a href="answers" role="button" class="btn btn-secondary btn-lg">Показать мои ответы</a>
                </div>
            </div>
        </div>
    </body>
</html>
