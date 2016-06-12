<%@page import="accesodato.Coneccion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">
        <title>Starter Template for Bootstrap</title>
        <link href="../template/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                     <a class="navbar-brand" href="">PELISPEDIA</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                   <ul class="nav navbar-nav">
                        <li  class="active"><a href="../index_1.jsp">Home</a></li>
                        <li><a href="../usuarios/index.jsp">Usuarios</a></li>
                        <li><a href="../directores/index.jsp">Directores</a></li>
                        <li><a href="index.jsp">Nacionalidades</a></li>
                        <li><a href="../peliculas/index.jsp">Peliculas</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <div class="container">
            <br><br><br>
            <div class="row">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Listar Nacionalidades</h3>
                    </div>
                    <div class="panel-body">
                        <a href="crear.jsp" class="btn btn-primary">NUEVA NACIONALIDAD</a>
                        <br><br>
                        <table class="table table-condensed table-hover table-bordered">
                            <thead>
                                <th>ID</th>
                                <th>NOMBRE</th>
                                <th>ESTADO</th>
                               
                            </thead>
                            <tbody>
                                <%
                                   Coneccion con=new Coneccion();
                                   con.setConsulta("select * from nacionalidades where estado='activo'");
                                   while(con.getResultado().next()){
                                    out.println("<tr>");
                                       out.println("<td>"+con.getResultado().getString("nacionalidad_id")+"</td>");
                                       out.println("<td>"+con.getResultado().getString("nombre_nacionalidad")+"</td>");
                                       out.println("<td>"+con.getResultado().getString("estado")+"</td>");
                                       
                                    out.println("</tr>");
                                   }
                                %>
                            </tbody>
                            
                        </table>
                        
                        

                    </div>
                </div>
            </div>
        </div><!-- /.container -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="../template/js/bootstrap.min.js"></script>

    </body>
</html>
