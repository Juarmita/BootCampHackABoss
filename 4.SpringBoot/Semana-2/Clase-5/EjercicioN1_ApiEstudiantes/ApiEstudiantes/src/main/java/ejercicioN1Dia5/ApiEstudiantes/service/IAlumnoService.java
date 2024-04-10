package ejercicioN1Dia5.ApiEstudiantes.service;

import ejercicioN1Dia5.ApiEstudiantes.model.Alumno;

import java.util.List;

public interface IAlumnoService {
    public void crearAlumno(Alumno alumno);
    public List<Alumno> obtenerAlumnos();
}
