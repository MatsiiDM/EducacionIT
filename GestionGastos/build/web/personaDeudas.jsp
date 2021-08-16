<%-- 
    Document   : listaEmpleados
    Created on : 08/08/2021, 17:06:58
    Author     : MDMartin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Deudas</title>
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
                        <li>
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
                <h2 class="mb-4">Listado de personas</h2>
                <table class="table table-responsive">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Apellido</th>
                    <tbody>
                        <tr>
                            <td>John</td>
                            <td>Doe</td>
                            <td><a href="altaDeudas.jsp"><input type="button" class="btn btn-secondary rounded submit p-2 px-2 btn-success" value="Agregar deuda"></a></th></td>
                            <td><a href="altaPersona.jsp"><input type="submit" class="btn btn-secondary rounded submit p-2 px-2 btn-warning" value="Ver deudas"></a></td>

                        </tr>
                        <tr>
                            <td>Smith</td>
                            <td>Thomas</td>
                            <td><a href="altaDeudas.jsp"><input type="button" class="btn btn-secondary rounded submit p-2 px-2 btn-success" value="Agregar deuda"></a></th></td>
                            <td><a href="altaPersona.jsp"><input type="submit" class="btn btn-secondary rounded submit p-2 px-2 btn-warning" value="Ver deudas"></a></td>
                        </tr>
                        <tr>
                            <td>Merry</td>
                            <td>Jim</td>
                            <td><a href="altaDeudas.jsp"><input type="button" class="btn btn-secondary rounded submit p-2 px-2 btn-success" value="Agregar deuda"></a></th></td>
                            <td><a href="altaPersona.jsp"><input type="submit" class="btn btn-secondary rounded submit p-2 px-2 btn-warning" value="Ver deudas"></a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/popper.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
