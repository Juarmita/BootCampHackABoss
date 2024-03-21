<%-- 
    Ejercicio 1
    -----------
    Un grupo estudiantil desea llevar a cabo un sistema sencillo para las 
    votaciones del centro de estudiantes de su colegio. Para ello, necesitan el 
    desarrollo de una aplicación Java que cuente con las siguientes características:

    Una página JSP donde se puedan realizar las siguientes acciones:

    Desplegar 3 opciones de votos mediante RadioButton junto con un botón "Votar".
    Cada alumno debe ser capaz de seleccionar a qué partido quiere votar y al hacer 
    click en votar se debe guardar el voto en una base de datos.

    Mostrar, mediante la presión de un botón "Mostrar resultados" en una tabla, 
    la cantidad total de votos de cada uno de los candidatos hasta el momento.
--%>

<%@page import="java.util.List"%>
<%@page import="com.mycompany.Main.logic.Voto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Votacion</title>
        <!-- Link de estilos bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <div class="container-mt4">
            <h1>Votacion</h1>
            <form action="SvVoto" method="post">
                <h2>Elija su voto:</h2>
                <div class="form-group">
                    <label for="partidoA">Partido A</label>
                    <input type="radio" value="Partido A" class="form-control" id="partidoA" name="partido">

                </div>
                <div class="form-group">
                    <label for="partidoB">Partido B</label>
                    <input type="radio" value="Partido B" class="form-control" id="partidoB" name="partido">

                </div>
                <div class="form-group">
                    <label for="partidoC">Partido C</label>
                    <input type="radio" value="Partido C" class="form-control" id="partidoC" name="partido">

                </div>
                <button type="submit" class="btn btn-primary">Votar</button>
            </form>

            <hr>

            <form action="SvVoto" method="get">
                <button type="submit" class="btn btn-success">Mostrar resultados</button>
            </form>

            <br>
            <br>

            <!-- Resultados de los votos en tabla -->
            <div class="results-table">
                <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultado votaciones</h3>
                <table class="table><!-- Creamos la tabla donde mostar los resultados de las votaciones -->
                       <thead>
                       <tr>
                       <th>Nombre del partido</th>
                       <th>Cantidad de votos</th>
                       </tr>
                       </thead>
                       <tbody>
                       <%
                           List<Voto> resultados = (List<Voto>) request.getAttribute("resultados");
                           for (Voto votos : resultados) {
                       %>

                       <tr>
                       <td> <%= votos.getPartido()%> </td>
                       <td> <%= votos.getVotos()%> </td>

                       </tr>



                       <% } %>
                       </tbody>
                       </table>
                       <% }%>
                       </div>

                       </div>

                       <!-- Scripts de bootstrap -->
                       <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
                    </body>
                    </html>
