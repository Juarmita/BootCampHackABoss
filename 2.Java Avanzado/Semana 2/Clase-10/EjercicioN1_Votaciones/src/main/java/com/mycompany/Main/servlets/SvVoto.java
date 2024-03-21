package com.mycompany.Main.servlets;

import com.mycompany.Main.logic.Controladora;
import com.mycompany.Main.logic.Voto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvVoto", urlPatterns = {"/SvVoto"})
public class SvVoto extends HttpServlet {

    private Controladora controladora = new Controladora();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener la lista actualizada de votos
        List<Voto> votosTotales = controladora.traerVotos();

        // Establecer la lista de votos como un atributo en la solicitud
        request.setAttribute("resultados", votosTotales);

        // Redirigir al JSP para mostrar los resultados
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String partido = request.getParameter("partido");

        // Crear un nuevo objeto Voto con el partido seleccionado
        Voto voto = new Voto(null, partido, 1);

        // Registrar el voto en la base de datos
        controladora.registrarVoto(voto);

        // Redirigir de vuelta al JSP para mostrar los resultados actualizados
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
