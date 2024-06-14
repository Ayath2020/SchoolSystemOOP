package co.com.schoolsystempoo.models;
public class ExamenOral extends Examen{

    Enum <NivelSatisfaccion> ns;

    public ExamenOral(NivelSatisfaccion ns, String fecha) {
        super(fecha);
        this.ns = ns;
    }


    @Override
    public boolean aprobo(){

        if(ns.ordinal() >= NivelSatisfaccion.SUFICIENTE.ordinal()){
            return true;
        }else {
            return false;
        }

    }

}


