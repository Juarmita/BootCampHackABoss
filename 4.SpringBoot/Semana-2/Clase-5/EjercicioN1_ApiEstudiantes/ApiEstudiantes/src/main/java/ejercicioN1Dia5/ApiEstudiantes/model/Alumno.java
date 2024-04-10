package ejercicioN1Dia5.ApiEstudiantes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {
    private int num_matricula;
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private List<Calificacion> calificacion;


}
