package ejercicioN1Dia5.ApiEstudiantes.service;

import ejercicioN1Dia5.ApiEstudiantes.model.Alumno;
import ejercicioN1Dia5.ApiEstudiantes.model.Calificacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalificacionService implements ICalificacionService{

    List<Alumno> listaCalificaciones = new ArrayList<>();

    @Override
    public List<Alumno> obtenerCalificaciones(Integer num_matricula) {

        return listaCalificaciones.stream()
                .filter(calificacion -> calificacion. == num_matricula)
                .map(Calificacion::getAlumno)
                .collect(Collectors.toList());


    }

    @Override
    public List<Alumno> obtenerCalificacionOrdenada() {

        return listaCalificaciones.stream()
                .sorted(Comparator.comparingDouble((Calificacion calificacion) -> calificacion.getPromedio()).reversed())
                .map(Calificacion::getAlumno)
                .collect(Collectors.toList());

    }
}
