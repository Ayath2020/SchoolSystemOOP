package co.com.schoolsystempoo.models;

public class ExamenEscrito extends Examen{

    private final int MINNOTA = 0;
    private final int MAXNOTA = 10;
    private final int APROBNOTA = 6;
    private final int DURACION = 90;

    private int duracion;
    private int nota;

    public ExamenEscrito(int duracion, int nota, String fecha) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobo(){

        if (duracion < DURACION && nota >= APROBNOTA){
            return true;
        }else {
            return false;
        }

    }

}
