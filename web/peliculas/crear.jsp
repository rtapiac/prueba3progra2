<%@page import="accesodato.Coneccion"%>
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
                    <a class="navbar-brand" href="#">PELISPEDIA</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li  class="active"><a href="../index_1.jsp">Home</a></li>
                        <li><a href="../usuarios/index.jsp">Usuarios</a></li>
                        <li><a href="../directores/index.jsp">Directores</a></li>
                        <li><a href="../nacionalidades/index.jsp">Nacionalidades</a></li>
                        <li><a href="index.jsp">Peliculas</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <div class="container">
            <br><br><br>
            <div class="row">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Crear Peliculas</h3>
                    </div>
                    <div class="panel-body">
                        <form method="POST" action="../ServletPelicula">
                            <div class="form-group">
                                <label for="nombre">Fecha de Estreno </label>
                                <input type="date" class="form-control" name="fecha_estreno" id="nombre" placeholder="Ingresar Pelicula">
                            </div>
                            <div class="form-group">
                                <label for="nombre">Duraci�n </label>
                                <input type="text" class="form-control" name="duracion" id="nombre" placeholder="Ingresar duracion">
                            </div>
                            <div class="form-group">
                                <label for="nombre">Titulo de la Pelicula</label>
                                <input type="text" class="form-control" name="titulo" id="nombre" placeholder="Ingresar titulo">
                            </div>
                            
                            
                            <button type="submit" class="btn btn-default" name="guardar">Guardar</button>
                        </form>


                    </div>
                </div>
            </div>
        </div><!-- /.container -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="../template/js/bootstrap.min.js"></script>

    </body>
</html>
