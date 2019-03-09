<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Упс..</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="style/error.css">
        <link rel="shortcut icon" type="image/png" href="https://img.icons8.com/color/64/000000/speedometer.png"/>
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
                        <a href="profile" class="btn btn-warning btn-lg" role="button">На главную</a>
                    </div>
                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</html>