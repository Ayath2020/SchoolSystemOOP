package co.com.schoolsystempoo.models;

import java.util.ArrayList;
import java.util.List;

public class CentroEducativo {

    private List <Alumno> alumnos;
    private int aprobados;
    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }

    public void addAlumno (Alumno alumno){
        alumnos.add(alumno);
    }

    public int cantidadAprobado (){

        for (Alumno alumnos:alumnos) {

            if (alumnos.approve() == true) {aprobados++;}
        }
        return aprobados;
    }

}
