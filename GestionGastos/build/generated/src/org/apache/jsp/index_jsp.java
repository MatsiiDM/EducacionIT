package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <title>Sistema de gestión de Gastos</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper d-flex align-items-stretch\">\n");
      out.write("        <nav id=\"sidebar\">\n");
      out.write("            <div class=\"custom-menu\">\n");
      out.write("                <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-primary\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                    <span class=\"sr-only\">Toggle Menu</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"p-4\">\n");
      out.write("                <h1><spam class=\"logo\">Gestion Gasto<img src=\"assets/images/concierge-bell-solid.svg\"></spam></h1>\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"index.jsp\"><span class=\"fa fa-home mr-3\"></span> Home </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"listaPersonas.jsp\"><span class=\"fa fa-users mr-3\"></span> Personas </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"personaDeudas.jsp\"><span class=\"fa fa-briefcase mr-3\"></span> Deudas </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"mb-5\">\n");
      out.write("                    <form action=\"#\" class=\"subscribe-form\">\n");
      out.write("                        <div class=\"form-group d-flex\">\n");
      out.write("                            <div class=\"icon\"><span class=\"icon-paper-plane\"></span></div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <hr>\n");
      out.write("                    <img src=\"assets/images/user-solid.svg\">\n");
      out.write("                    <div class=\"userActual\">\n");
      out.write("                        <p>Persona nombre</p>\n");
      out.write("                        <p>Persona apellido</p>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"index.jsp\"><img class= \"logout\" src=\"assets/images/power-off-solid.svg\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Page Content  -->\n");
      out.write("        <div id=\"content\" class=\"p-4 p-md-5 pt-5\">\n");
      out.write("            <h2>Cómo ahorrar en 5 pasos</h2> \n");
      out.write("            <p class=\"post-pagina-interior\">Te proponemos cinco pasos y algunas ideas para aprender a ahorrar, porque queremos que puedas ahorrar más y mejor y cumplir con tus objetivos de ahorro.</p>\n");
      out.write("            <p class=\"post-pagina-interior\">Estos pasos son una guía que armamos partir de las respuestas obtenidas en las pruebas piloto administradas hasta ahora en el marco del programa.</p> \n");
      out.write("            <img src=\"assets/images/Aprendiendo_a_ahorrar_placa_3.jpg\" class=\"img-responsive\" alt=\"solo el 17% alcanza el objetivo de ahorro\">\n");
      out.write("            <h3>1.\tRegistrá tus  gastos</h3>\t\t\t\t\n");
      out.write("            <p class=\"post-pagina-interior\">Para ahorrar no necesitás grandes sumas de dinero. Al tratarse de un hábito, es algo que se va incorporando a nuestra conducta. </p>\n");
      out.write("            <p class=\"post-pagina-interior\"><strong>Idea</strong> | Llevando un diario de gastos podés descubrir los <em>gastos hormiga</em>: una gaseosa, un alfajor que podríamos haber evitado, o un taxi que podríamos haber reemplazado usando el transporte público. </p>\n");
      out.write("            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 resalte\" style=\"margin-top: 1em; padding: 1em; background-color: #D7DFEA;\">\n");
      out.write("                <p class=\"post-pagina-interior\"><strong>¿Qué son los gastos hormiga?</strong></p>\n");
      out.write("                <p class=\"post-pagina-interior\">Son gastos que realizamos sin darnos cuenta, pero sobre todo sin preguntarnos si podemos posponerlos, reemplazarlos o suprimirlos. Esos pequeños gastos por impulso que parecen imperceptibles y se llevan buena parte del ingreso todos los meses: comidas al paso, un helado o golosinas son sólo algunos de los rubros que, poco a poco, disminuyen nuestra capacidad de ahorro. </p>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <img src=\"assets/images/Aprendiendo_a _ahorrar_placa_2.jpg\" alt=\"tiempo de ahorro\" class=\"img-responsive\">\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 resalte\" style=\"margin-top: 1em; margin-bottom: 1em; padding: 1em; background-color: #D7DFEA;\">\n");
      out.write("                <p class=\"post-pagina-interior\"><strong>¡Importante!</strong></p>\n");
      out.write("                <p class=\"post-pagina-interior\">Lo que popularmente se conoce como <em>tener la plata en el colchón</em> es un tipo de ahorro en efectivo. Son billetes y monedas, que si bien son nuestros, no tienen nuestro nombre y, si otro lo lleva o se pierden, de alguna forma dejan de ser nuestros. <strong>Esta plata no paga ningún interés ni se actualiza</strong>. Por eso, las alternativas de ahorro en el sistema financiero son mejores opciones para formar hábitos de ahorro que nos permitan concretar nuestras metas.</p>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <h3>2. Elaborá un presupuesto </h3>\n");
      out.write("            <p class=\"post-pagina-interior\">Para armar el presupuesto es preciso registrar todos los ingresos que vamos teniendo y proyectar los ingresos y gastos, en base a lo que observamos y lo que esperamos que ocurra a futuro. </p>\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <img src=\"assets/images/Aprendiendo_a_ahorrar_placa_4.jpg\" class=\"img-responsive\" alt=\"los jóvenes y el presupuesto\">\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <h3>3. Planificá y establecé objetivos </h3> \n");
      out.write("            <p class=\"post-pagina-interior\">Es importante saber para qué queremos ahorrar y calcular cuánto tiempo tomará alcanzar los objetivo que nos proponemos. Con una meta es más fácil. </p>\n");
      out.write("            <p class=\"post-pagina-interior\"><strong>Idea</strong> | Organizate y establecé un plan de cumplimiento,con plazos para poder estimar cuánto tiempo te llevará lo que querés lograr.  Usar una planilla de cálculo o una herramienta de visualización te permitirá identificar el tiempo necesario,  identificar dificultades y descubrir oportunidades.</p> \n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <img src=\"assets/images/Aprendiendo_a_ahorrar_placa_5.jpg\" class=\"img-responsive\" alt=\"principales objetivos de ahorro\">\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <h3>4. Tomá decisiones según tus prioridades</h3> \n");
      out.write("            <p class=\"post-pagina-interior\">Saber elegir para cumplir con nuestras metas es un gran desafío, ¡pero si lo superamos tenemos gran parte del asunto resuelto! Por eso es importante prestar atención a la toma de decisiones. ¡Cambios pequeños, casi invisibles, nos pueden ayudar mucho!</p>\n");
      out.write("            <p class=\"post-pagina-interior\"><strong>Idea</strong> | Antes de hacer un gasto, hacete muchas preguntas: cómo te hará sentir destinar ese dinero a esa compra, si podés posponerla o si es necesario hacerla ahora, si reemplaza otro gasto o si más adelante implicará otros gastos en repuestos o mantenimiento, entre otros ejemplos.</p>\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <h3>5. Usá estrategias de ahorro-inversión en el sistema financiero</h3> \n");
      out.write("            <p class=\"post-pagina-interior\">Para facilitar el hábito de ahorro y el registro de gastos e ingresos, dentro del sistema financiero podemos usar las alternativas que nos permiten ahorrar desde chicos. </p>\n");
      out.write("            <p class=\"post-pagina-interior\">En algunos casos, permiten también usar medios de pago asociados a las cuentas bancarias como las tarjetas de débito, ir familiarizándonos con los cajeros automáticos y comprar por internet o con el teléfono celular. </p>\n");
      out.write("            <p class=\"post-pagina-interior\">Ciertas cuentas bancarias también funcionan como una inversión, que permite cuidar los ahorros de la inflación y disponer de ese dinero cuando cumplimos 18 años. En algunos casos se puede obtener adicionalmente el pago de una tasa de interés que permite que los ahorros se incrementen. </p>\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <img src=\"assets/images/Aprendiendo_a_ahorrar_placa_6.jpg\" class=\"img-responsive\" alt=\"intéres de ahorrar en un banco\">\n");
      out.write("            <p class=\"salto-linea\"></p>\n");
      out.write("            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 resalte\" style=\"margin-top: 1em; padding: 1em; background-color: #D7DFEA;\">\n");
      out.write("                <p class=\"post-pagina-interior\"><strong>Ahorrar vs. invertir</strong>\n");
      out.write("                </p><p class=\"post-pagina-interior\">Ahorrar es separar una porción de dinero para usarlo en el futuro, no gastarlo ni consumirlo hoy.</p>\n");
      out.write("                <p class=\"post-pagina-interior\">Invertir es destinar dinero (por ejemplo, los ahorros) a instrumentos que puedan generar alguna ganancia o <em>rendimiento</em> a cambio de asumir un riesgo. A esta ganancia la llamamos <em>interés</em>.</p>\n");
      out.write("                <p class=\"post-pagina-interior\">Ahorrar nos permite alcanzar objetivos a corto y mediano plazo. Por lo general las cuentas bancarias tienen rendimientos menores que las inversiones (por ejemplo, una caja de ahorros paga mucho menos tasa de interés que un depósito a plazo fijo) mientras que las inversiones tienen mayores rendimientos y, por ende, muchas veces son utilizadas para alcanzar objetivos de largo plazo a costa de asumir mayores riesgos. </p>\n");
      out.write("            </div>        \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/popper.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
