package ejercicioN1Dia5.ApiEstudiantes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {
    private Long id;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
  }
