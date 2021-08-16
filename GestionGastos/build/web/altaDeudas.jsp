<%@page contentType="text/html"%>
<!DOCTYPE html>
<html lang = "es">
    <head>
        <title>Alta de deuda</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <!-- <link rel="stylesheet" href="css/loginStyle.css"> -->
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
                    <h1><spam class="logo">Adherir Nuevo Gasto<img src="assets/images/concierge-bell-solid.svg"></spam></h1>
                    <ul class="list-unstyled components mb-5">
                        <li>
                            <a href="index.jsp"><span class="fa fa-home mr-3"></span> Home </a>
                        </li>
                        <li class="active">
                            <a href="listaPersonas.jsp"><span class="fa fa-briefcase mr-3"></span> Personas </a>
                        </li>
                        <li>
                            <a href="personaDeudas.jsp"><span class="fa fa-briefcase mr-3"></span> Deudas </a>
                        </li>
                        <li>
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
                        <a href="index.html"><img class= "logout" src="assets/images/power-off-solid.svg"></a>
                    </div>

                </div>
            </nav>

            <!-- Page Content  -->
            <div id="content" class="p-4 p-md-5 pt-5">
                <h2 class="mb-4">Agregar nueva deuda</h2>
                <form action="SvRegistrarEmpleado" class="edit-form" method="">
                    <div class="form-group row justify-content-around">
                        <div class="col-3">
                            <p>Nombre Producto:</p>
                            <input type="text" name="producto" class="form-control rounded-left" required>
                            <p>Precio:</p>
                            <input type="text" name="precio" class="form-control rounded-left" placeholder="$" required>
                            <p>Cantidad de Cuotas:</p>
                            <input type="text" name="cantidadCuotas" class="form-control rounded-left" required>
                        </div>
                        <div class="col-4">
                            <p>Medio de Pago:</p>
                            <select name="select" required>
                                <option selected="true" disabled="disabled" >Elige un metodo de pago</option>
                                <option value="tCredito">Tarjeta de Credito</option>
                                <option value="tDebito">Tarjeta de Debito</option>
                                <option value="tPrepaga">Tarjeta Prepaga</option>
                                <option value="efectivo">Efectivo</option>
                                <option value="transBancaria">Transferencia Bancaria</option>
                            </select>
                            
                            <p>Fecha de Compra:</p>
                            <input type="date" name="fechaCompra" class="form-control rounded-left" required>
                        </div>
                    </div>
                    <div class="form-group-buttons">
                        <a href="listadoEmpleados.jsp"><input type="button" class="btn btn-secondary rounded submit p-3 px-4 w-20 border col-2" value="Cancelar"></a>
                        <input type="submit" class="btn btn-primary rounded submit p-3 px-4 w-20 border col-2" value="Guardar">
                    </div>
                </form>
            </div>
        </div>

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/popper.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
