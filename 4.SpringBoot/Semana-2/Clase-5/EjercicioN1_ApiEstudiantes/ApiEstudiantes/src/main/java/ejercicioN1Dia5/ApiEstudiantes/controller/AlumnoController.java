package ejercicioN1Dia5.ApiEstudiantes.controller;

import ejercicioN1Dia5.ApiEstudiantes.model.Alumno;
import ejercicioN1Dia5.ApiEstudiantes.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {

    private AlumnoService alumnoService;

    public AlumnoController() {
        this.alumnoService = new AlumnoService();
    }

    @PostMapping("/estudiantes")
    public String crearAlumno(@RequestBody Alumno alumno) {//Creo el alumno y si todo esta ok devuelvo un mensaje
        alumnoService.crearAlumno(alumno);
        System.out.println("Alumno creado");
        return "Alumno creado" +alumno.getNombre();
    }

    @GetMapping("/estudiantes")
    public List<Alumno> obtenerAlumnos() { //Obtengo la lista de alumnos

        return alumnoService.obtenerAlumnos();
    }


}
