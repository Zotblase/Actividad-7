public class Titulares extends Docentes {
    int antiguedad;

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void calcular_plus(){
        if(getEdad() >= 30 && antiguedad >= 6){
            setSalario(getSalario() + getPLUS_RURALIDAD());
            System.out.println("Se agregó el plus al docente"); 
        }
    }    
}
