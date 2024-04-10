package ejercicioN1Dia5.ApiEstudiantes.service;

import ejercicioN1Dia5.ApiEstudiantes.model.Alumno;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService implements IAlumnoService {

    List<Alumno> listaAlumnos = new ArrayList<>();

    @Override
    public void crearAlumno(@RequestBody Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    @Override
    public List<Alumno> obtenerAlumnos() {
        return listaAlumnos;
    }
}
