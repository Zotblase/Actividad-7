public class Suplentes extends Docentes {
    String zona;

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void calcular_plus(){
        if(getEdad() <= 25 && getZona().equals("Zona A")){
            setSalario(getSalario() + getPLUS_RURALIDAD());
            System.out.println("Se agregó el plus al docente"); 
        }
    }   
}
