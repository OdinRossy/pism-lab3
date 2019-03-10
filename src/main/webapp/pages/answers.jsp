<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Анкета пользователя ${username}</title>
        <%--favicon--%>
        <%--<link rel="shortcut icon" type="image/png" href="http://localhost:8080/pism-lab3/assets/racing.png"/>--%>
        <%--bootstrap.min.css--%>
        <link rel="stylesheet" href="http://localhost:8080/pism-lab3/style/bootstrap.min.css">
        <%--own style--%>
        <link rel="stylesheet" href="http://localhost:8080/pism-lab3/style/main.css">
    </head>
    <body>
        <div class="container-fluid">
            <div class="row row-center">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <div class="rounded-container">
                        <h2 title="title">Ваш ответ:</h2>
                        ${answers}
                    </div>
                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</html>
