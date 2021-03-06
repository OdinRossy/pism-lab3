<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Авторизация</title>
        <%--favicon--%>
        <%--<link rel="shortcut icon" type="image/png" href="http://localhost:8080/pism-lab3/assets/racing.png"/>--%>
        <%--bootstrap.min.css--%>
        <link rel="stylesheet" href="http://localhost:8080/pism-lab3/style/bootstrap.min.css">
        <%--own style--%>
        <link rel="stylesheet" href="http://localhost:8080/pism-lab3/style/main.css">
        <%--fontawesome--%>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
              integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
              crossorigin="anonymous">
    </head>
    <body>
        <div class="container-fluent">
            <div class="row row-center">
                <div class="col-md-3"></div>
                    <div class="col-md-6 rounded-container">
                        <h1 class="title">Авторизация</h1>
                        <form action="authentication" method="post">
                            <div class="input-group mb-2 mr-sm-2">
                                <div class="input-group-prepend">
                                    <div class="input-group-text"><i class="fas fa-at"></i></div>
                                </div>
                                <input type="email" name="email" class="form-control" placeholder="Введите email">
                            </div>
                            <br>
                            <div class="input-group mb-2 mr-sm-2">
                                <div class="input-group-prepend">
                                    <div class="input-group-text"><i class="fas fa-key"></i></div>
                                </div>
                                <input type="password" name="password" class="form-control" placeholder="Введите пароль">
                            </div>
                            <br>
                            <button type="submit" class="btn btn-success btn-lg">Войти</button>
                        </form>
                    </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</html>