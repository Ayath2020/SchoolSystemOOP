package co.com.schoolsystempoo.models;

public class Main {
    public static void main(String[] args) {

        CentroEducativo ce = new CentroEducativo();
        Alumno a = new Alumno("1010012922","Giraldo","Jose");
        Alumno b = new Alumno("1022927904","Martinez","Camila");
        ce.addAlumno(a);
        ce.addAlumno(b);
        a.addExamen(new ExamenEscrito(60,6,"13/06"));
       // a.addExamen(new ExamenEscrito(65,6));
       // a.addExamen(new ExamenEscrito(69,6));
        //a.addExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE));
        a.addExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE,"13/06"));
        b.addExamen(new ExamenEscrito(60,6,"13/06"));
        //b.addExamen(new ExamenEscrito(65,6));
       // b.addExamen(new ExamenEscrito(69,6));
        //b.addExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE));
        b.addExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE,"13/06"));
        //a.addExamen(new ExamenEscrito(91,8));

        System.out.println(ce.cantidadAprobado());

    }
}
