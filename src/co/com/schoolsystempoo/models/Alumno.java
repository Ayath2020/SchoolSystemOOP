package co.com.schoolsystempoo.models;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String DNI;
    private String apellido;
    private String nombre;
    private List<Examen> examenes;

    public Alumno(String DNI, String apellido, String nombre) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
    }

    public  void addExamen(Examen examen){
        examenes.add(examen);
    }

    public boolean approve (){
        boolean aprobo = true;
        CicloNotas:
         for (Examen examenes: examenes) {
            if(examenes.aprobo() == true){
                aprobo = true;
            }else {
                aprobo = false;
                break CicloNotas;
            }
        }
        return aprobo;
    }

}
