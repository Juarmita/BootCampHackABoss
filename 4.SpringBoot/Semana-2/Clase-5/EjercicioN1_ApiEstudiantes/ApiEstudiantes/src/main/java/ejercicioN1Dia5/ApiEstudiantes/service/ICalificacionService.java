package ejercicioN1Dia5.ApiEstudiantes.service;

import ejercicioN1Dia5.ApiEstudiantes.model.Alumno;
import ejercicioN1Dia5.ApiEstudiantes.model.Calificacion;

import java.util.List;

public interface ICalificacionService {

    List<Calificacion> obtenerCalificaciones(Integer numMatricula);
    List<Calificacion> obtenerCalificacionOrdenada();
}
