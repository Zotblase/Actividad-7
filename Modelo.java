import java.util.ArrayList;

public class Modelo {
    private static ArrayList<Docentes> docentes = null;

    private Modelo(){}

    public static ArrayList<Docentes> getInstaceModelo(){
        if(docentes == null){
            docentes = new ArrayList<>();
            return docentes;
        }else{
            return docentes;
        }
    }

    public static void agregarDocente(Docentes docente){
        getInstaceModelo().add(docente);
    }
}
