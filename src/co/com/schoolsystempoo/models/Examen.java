package co.com.schoolsystempoo.models;



public class Examen implements Aprobable{

    private String fecha;

    @Override
    public boolean aprobo() {
        return false;
    }
}
