<%-- 
    Document   : main.jsp
    Created on : 07/08/2021, 22:27:08
    Author     : MDMartin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Sistema de gestión de Gastos</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
    <div class="wrapper d-flex align-items-stretch">
        <nav id="sidebar">
            <div class="custom-menu">
                <button type="button" id="sidebarCollapse" class="btn btn-primary">
                    <i class="fa fa-bars"></i>
                    <span class="sr-only">Toggle Menu</span>
                </button>
            </div>
            <div class="p-4">
                <h1><spam class="logo">Gestion Gasto<img src="assets/images/concierge-bell-solid.svg"></spam></h1>
                <ul class="list-unstyled components mb-5">
                    <li class="active">
                        <a href="index.jsp"><span class="fa fa-home mr-3"></span> Home </a>
                    </li>
                    <li>
                        <a href="listaPersonas.jsp"><span class="fa fa-users mr-3"></span> Personas </a>
                    </li>
                    <li>
                        <a href="personaDeudas.jsp"><span class="fa fa-briefcase mr-3"></span> Deudas </a>
                    </li>
                </ul>

                <div class="mb-5">
                    <form action="#" class="subscribe-form">
                        <div class="form-group d-flex">
                            <div class="icon"><span class="icon-paper-plane"></span></div>
                        </div>
                    </form>
                </div>

                <div class="footer">
                    <hr>
                    <img src="assets/images/user-solid.svg">
                    <div class="userActual">
                        <p>Persona nombre</p>
                        <p>Persona apellido</p>
                    </div>
                    <a href="index.jsp"><img class= "logout" src="assets/images/power-off-solid.svg"></a>
                </div>

            </div>
        </nav>

        <!-- Page Content  -->
        <div id="content" class="p-4 p-md-5 pt-5">
            <h2>Cómo ahorrar en 5 pasos</h2> 
            <p class="post-pagina-interior">Te proponemos cinco pasos y algunas ideas para aprender a ahorrar, porque queremos que puedas ahorrar más y mejor y cumplir con tus objetivos de ahorro.</p>
            <p class="post-pagina-interior">Estos pasos son una guía que armamos partir de las respuestas obtenidas en las pruebas piloto administradas hasta ahora en el marco del programa.</p> 
            <img src="assets/images/Aprendiendo_a_ahorrar_placa_3.jpg" class="img-responsive" alt="solo el 17% alcanza el objetivo de ahorro">
            <h3>1.	Registrá tus  gastos</h3>				
            <p class="post-pagina-interior">Para ahorrar no necesitás grandes sumas de dinero. Al tratarse de un hábito, es algo que se va incorporando a nuestra conducta. </p>
            <p class="post-pagina-interior"><strong>Idea</strong> | Llevando un diario de gastos podés descubrir los <em>gastos hormiga</em>: una gaseosa, un alfajor que podríamos haber evitado, o un taxi que podríamos haber reemplazado usando el transporte público. </p>
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 resalte" style="margin-top: 1em; padding: 1em; background-color: #D7DFEA;">
                <p class="post-pagina-interior"><strong>¿Qué son los gastos hormiga?</strong></p>
                <p class="post-pagina-interior">Son gastos que realizamos sin darnos cuenta, pero sobre todo sin preguntarnos si podemos posponerlos, reemplazarlos o suprimirlos. Esos pequeños gastos por impulso que parecen imperceptibles y se llevan buena parte del ingreso todos los meses: comidas al paso, un helado o golosinas son sólo algunos de los rubros que, poco a poco, disminuyen nuestra capacidad de ahorro. </p>
            </div>
            <p class="salto-linea"></p>
            <img src="assets/images/Aprendiendo_a _ahorrar_placa_2.jpg" alt="tiempo de ahorro" class="img-responsive">
            <p class="salto-linea"></p>
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 resalte" style="margin-top: 1em; margin-bottom: 1em; padding: 1em; background-color: #D7DFEA;">
                <p class="post-pagina-interior"><strong>¡Importante!</strong></p>
                <p class="post-pagina-interior">Lo que popularmente se conoce como <em>tener la plata en el colchón</em> es un tipo de ahorro en efectivo. Son billetes y monedas, que si bien son nuestros, no tienen nuestro nombre y, si otro lo lleva o se pierden, de alguna forma dejan de ser nuestros. <strong>Esta plata no paga ningún interés ni se actualiza</strong>. Por eso, las alternativas de ahorro en el sistema financiero son mejores opciones para formar hábitos de ahorro que nos permitan concretar nuestras metas.</p>
            </div>
            <p class="salto-linea"></p>
            <h3>2. Elaborá un presupuesto </h3>
            <p class="post-pagina-interior">Para armar el presupuesto es preciso registrar todos los ingresos que vamos teniendo y proyectar los ingresos y gastos, en base a lo que observamos y lo que esperamos que ocurra a futuro. </p>
            <p class="salto-linea"></p>
            <img src="assets/images/Aprendiendo_a_ahorrar_placa_4.jpg" class="img-responsive" alt="los jóvenes y el presupuesto">
            <p class="salto-linea"></p>
            <h3>3. Planificá y establecé objetivos </h3> 
            <p class="post-pagina-interior">Es importante saber para qué queremos ahorrar y calcular cuánto tiempo tomará alcanzar los objetivo que nos proponemos. Con una meta es más fácil. </p>
            <p class="post-pagina-interior"><strong>Idea</strong> | Organizate y establecé un plan de cumplimiento,con plazos para poder estimar cuánto tiempo te llevará lo que querés lograr.  Usar una planilla de cálculo o una herramienta de visualización te permitirá identificar el tiempo necesario,  identificar dificultades y descubrir oportunidades.</p> 
            <p class="salto-linea"></p>
            <img src="assets/images/Aprendiendo_a_ahorrar_placa_5.jpg" class="img-responsive" alt="principales objetivos de ahorro">
            <p class="salto-linea"></p>
            <h3>4. Tomá decisiones según tus prioridades</h3> 
            <p class="post-pagina-interior">Saber elegir para cumplir con nuestras metas es un gran desafío, ¡pero si lo superamos tenemos gran parte del asunto resuelto! Por eso es importante prestar atención a la toma de decisiones. ¡Cambios pequeños, casi invisibles, nos pueden ayudar mucho!</p>
            <p class="post-pagina-interior"><strong>Idea</strong> | Antes de hacer un gasto, hacete muchas preguntas: cómo te hará sentir destinar ese dinero a esa compra, si podés posponerla o si es necesario hacerla ahora, si reemplaza otro gasto o si más adelante implicará otros gastos en repuestos o mantenimiento, entre otros ejemplos.</p>
            <p class="salto-linea"></p>
            <h3>5. Usá estrategias de ahorro-inversión en el sistema financiero</h3> 
            <p class="post-pagina-interior">Para facilitar el hábito de ahorro y el registro de gastos e ingresos, dentro del sistema financiero podemos usar las alternativas que nos permiten ahorrar desde chicos. </p>
            <p class="post-pagina-interior">En algunos casos, permiten también usar medios de pago asociados a las cuentas bancarias como las tarjetas de débito, ir familiarizándonos con los cajeros automáticos y comprar por internet o con el teléfono celular. </p>
            <p class="post-pagina-interior">Ciertas cuentas bancarias también funcionan como una inversión, que permite cuidar los ahorros de la inflación y disponer de ese dinero cuando cumplimos 18 años. En algunos casos se puede obtener adicionalmente el pago de una tasa de interés que permite que los ahorros se incrementen. </p>
            <p class="salto-linea"></p>
            <img src="assets/images/Aprendiendo_a_ahorrar_placa_6.jpg" class="img-responsive" alt="intéres de ahorrar en un banco">
            <p class="salto-linea"></p>
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 resalte" style="margin-top: 1em; padding: 1em; background-color: #D7DFEA;">
                <p class="post-pagina-interior"><strong>Ahorrar vs. invertir</strong>
                </p><p class="post-pagina-interior">Ahorrar es separar una porción de dinero para usarlo en el futuro, no gastarlo ni consumirlo hoy.</p>
                <p class="post-pagina-interior">Invertir es destinar dinero (por ejemplo, los ahorros) a instrumentos que puedan generar alguna ganancia o <em>rendimiento</em> a cambio de asumir un riesgo. A esta ganancia la llamamos <em>interés</em>.</p>
                <p class="post-pagina-interior">Ahorrar nos permite alcanzar objetivos a corto y mediano plazo. Por lo general las cuentas bancarias tienen rendimientos menores que las inversiones (por ejemplo, una caja de ahorros paga mucho menos tasa de interés que un depósito a plazo fijo) mientras que las inversiones tienen mayores rendimientos y, por ende, muchas veces son utilizadas para alcanzar objetivos de largo plazo a costa de asumir mayores riesgos. </p>
            </div>        
        </div>
    </div>

    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/popper.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/main.js"></script>
</body>
</html>
