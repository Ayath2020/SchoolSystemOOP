package co.com.schoolsystempoo.models;
public class ExamenOral extends Examen{

    Enum <NivelSatisfaccion> ns;

    public ExamenOral(NivelSatisfaccion ns, String fecha) {
        super(fecha);
        this.ns = ns;
    }

    public static void main(String[] args) {
        for (NivelSatisfaccion niveles: NivelSatisfaccion.values()) {
            System.out.println( niveles + " = " + niveles.ordinal());
        }
    }

    @Override
    public boolean aprobo(){

        if(ns.equals(NivelSatisfaccion.SUFICIENTE ) || ns.equals(NivelSatisfaccion.EXCELENTE)){
            return true;
        }else {
            return false;
        }

    }

}


