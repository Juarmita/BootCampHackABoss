package ejercicioN1Dia5.ApiEstudiantes.controller;

import ejercicioN1Dia5.ApiEstudiantes.model.Alumno;
import ejercicioN1Dia5.ApiEstudiantes.service.CalificacionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalificacionController {

    private CalificacionService calificacionService;

    public CalificacionController() {

        this.calificacionService = new CalificacionService();
    }

    @GetMapping("/calificaciones/{num_matricula}")
    public void obtenerCalificaciones(@PathVariable int num_matricula) {
        calificacionService.obtenerCalificaciones(num_matricula);
    }

    @GetMapping("/calificaciones/ordendesc")
    public List<Alumno> obtenerCalificacionOrdenada() {
        return calificacionService.obtenerCalificacionOrdenada();
    }

}
