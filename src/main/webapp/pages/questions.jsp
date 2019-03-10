<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Опрос пользователя ${username}</title>
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
                    <form action="save" method="post">
                        <h5>Просим Вас ответить на несколько наших вопросов:</h5>
                        <div class="question">
                            <h4><span class="badge badge-secondary">1.</span>
                                Какую автомобильную марку Вы предпочитаете?</h4>
                            <div class="answer">
                                <label for="inputGroupSelect01"></label>
                                <select name="brand" class="custom-select" id="inputGroupSelect01">
                                    <option value="null" selected>Выберите марку...</option>
                                    <option value="BMW">BMW</option>
                                    <option value="Audi">Audi</option>
                                    <option value="Mercedes">Mercedes</option>
                                    <option value="Volvo">Volvo</option>
                                    <option value="Bentley">Bentley</option>
                                    <option value="Bentley">Bentley</option>
                                    <option value="Volkswagen">Volkswagen</option>
                                    <option value="Jeep">Jeep</option>
                                    <option value="Fiat">Fiat</option>
                                    <option value="Lada">Lada</option>
                                </select>
                            </div>
                        </div>
                        <div class="question">
                            <h4><span class="badge badge-secondary">2.</span>
                                Какой тип автомобилей Вам нравится больше?</h4>
                            <div class="answer">
                                <small>Выберите один:</small>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="coupe" name="type" value="coupe"
                                           class="custom-control-input" checked>
                                    <label class="custom-control-label" for="coupe">Купе</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="sedan" name="type" value="sedan"
                                           class="custom-control-input">
                                    <label class="custom-control-label" for="sedan">Седан</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="wagon" name="type" value="wagon"
                                           class="custom-control-input">
                                    <label class="custom-control-label" for="wagon">Универсал</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="truck" name="type" value="truck"
                                           class="custom-control-input">
                                    <label class="custom-control-label" for="truck">Джип</label>
                                </div>
                            </div>
                        </div>
                        <div class="question">
                            <h4><span class="badge badge-secondary">3.</span>
                                Сколько лошадиных сил Вы бы хотели иметь в своем автомобиле?</h4>
                            <div class="answer">
                                <input type="range" name="horsepower" value="100" class="custom-range"
                                       id="range1" min="100" max="1000" oninput="changeValueOfRange(1)">
                                <div class="range-value">
                                    <label id="rangeValueLabel1" for="range1">100</label>
                                    <span class="badge badge-info">Л.С.</span>
                                </div>
                            </div>
                        </div>

                        <div class="question">
                            <h4><span class="badge badge-secondary">4.</span>
                                Какой расход топлива является для Вас оптимальным?</h4>
                            <div class="answer">
                                <input type="range" name="fuel-consumption" value="1" class="custom-range"
                                       id="range2" min="1" max="100" oninput="changeValueOfRange(2)">
                                <div class="range-value">
                                    <label id="rangeValueLabel2" for="range2">1</label>
                                    <span class="badge badge-info">л/100 км.</span>
                                </div>
                            </div>
                        </div>
                        <div class="question">
                            <h4><span class="badge badge-secondary">5.</span>
                                Какую максмальную скорость должен развивать Ваш автомобиль?</h4>
                            <div class="answer">
                                <input type="range" name="speed" value="50" class="custom-range"
                                       id="range3" min="50" max="320" oninput="changeValueOfRange(3)">
                                <div class="range-value">
                                    <label id="rangeValueLabel3" for="range3">50</label>
                                    <span class="badge badge-info">км/ч</span>
                                </div>
                            </div>
                        </div>
                        <div class="question">
                            <h4><span class="badge badge-secondary">6.</span>
                                Тип коробки переключения передач</h4>
                            <div class="answer">
                                <small>Выберите один:</small>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" name="transmission" value="automatic"
                                           class="custom-control-input" id="automatic" checked>
                                    <label class="custom-control-label" for="automatic">Автоматическая</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" name="transmission" value="hand"
                                           class="custom-control-input" id="hand">
                                    <label class="custom-control-label" for="hand">Ручная</label>
                                </div>
                            </div>
                        </div>
                        <div class="question">
                            <h4><span class="badge badge-secondary">7.</span>
                                Какой привод Вы бы хотели иметь в атомобиле?</h4>
                            <div class="answer">
                                <small>Выберите один:</small>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" name="drive" value="front-wheel"
                                           class="custom-control-input" id="front-wheel" checked>
                                    <label class="custom-control-label" for="front-wheel">Передний</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" name="drive" value="rear"
                                           class="custom-control-input" id="rear">
                                    <label class="custom-control-label" for="rear">Задний</label>
                                </div>
                            </div>
                        </div>
                        <div class="question">
                            <h4><span class="badge badge-secondary">8.</span>
                                Выберите цвет автомобиля</h4>
                            <div class="answer">
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="yellow" name="color" value="yellow"
                                           class="custom-control-input" checked>
                                    <label class="custom-control-label color yellow" for="yellow">Жёлтый</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="green" name="color" value="green"
                                           class="custom-control-input">
                                    <label class="custom-control-label color green" for="green">Зелёный</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="blue" name="color" value="blue"
                                           class="custom-control-input">
                                    <label class="custom-control-label color blue" for="blue">Синий</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="black" name="color" value="black"
                                           class="custom-control-input">
                                    <label class="custom-control-label color black" for="black">Чёрный</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="white" name="color" value="white"
                                           class="custom-control-input">
                                    <label class="custom-control-label color" for="white">Белый</label>
                                </div>
                                <div class="custom-control custom-radio answer-radio">
                                    <input type="radio" id="red" name="color" value="red"
                                           class="custom-control-input">
                                    <label class="custom-control-label color red" for="red">Красный</label>
                                </div>
                            </div>
                        </div>
                        <div class="question">
                            <h4><span class="badge badge-secondary">9.</span>
                                Выберите дополнительные опции, которые хотели бы видеть в своем автомобиле:</h4>
                            <div class="answer">
                                <div class="custom-control custom-checkbox answer-radio">
                                    <input type="checkbox" name="seat-heating"
                                           class="custom-control-input" id="seat-heating">
                                    <label class="custom-control-label" for="seat-heating">Подогрев сидений</label>
                                </div>
                                <div class="custom-control custom-checkbox answer-radio">
                                    <input type="checkbox" name="leather-interior"
                                           class="custom-control-input" id="leather-interior">
                                    <label class="custom-control-label" for="leather-interior">Кожаный салон</label>
                                </div>
                                <div class="custom-control custom-checkbox answer-radio">
                                    <input type="checkbox" name="navigation-system"
                                           class="custom-control-input" id="navigation-system">
                                    <label class="custom-control-label" for="navigation-system">Навигатор</label>
                                </div>
                                <div class="custom-control custom-checkbox answer-radio">
                                    <input type="checkbox" name="video-camera"
                                           class="custom-control-input" id="video-camera">
                                    <label class="custom-control-label" for="video-camera">Видеорегистратор</label>
                                </div>
                            </div>
                        </div>
                        <div class="question">
                            <h4><span class="badge badge-secondary">10.</span> </h4>
                            <div class="answer">
                                <div class="form-group">
                                    <label for="exampleFormControlTextarea1">Ваши личные пожелания:</label>
                                    <textarea class="form-control" name="wishes"
                                              id="exampleFormControlTextarea1" rows="5"></textarea>
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-success btn-lg">Отправить</button>
                    </form>
                </div>
            </div>
        </div>
        <script src="http://localhost:8080/pism-lab3/script/main.js"></script>
    </body>
</html>