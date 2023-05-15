import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean iterar = true;
        while(iterar){
            System.out.println("//////////////////////////////////////");
            System.out.println("¿Qué desea ingresar?");
            System.out.println("1_ Docente titular");
            System.out.println("2_ Docente suplente");
            System.out.println("3_ Listado de docentes");
            System.out.println("4_ Salir");

            int entrada = 0;
            try{
                entrada = input.nextInt();input.nextLine();
            }catch(Exception e){
                System.out.println("Error, el dato ingresado es incorrecto");
            }
            
            switch (entrada){
                case 1:
                    crearTitular(input);
                    break;
                case 2:
                    crearSuplente(input);
                    break;
                case 3:
                    mostrarListado();
                    break;
                default:
                    System.out.println("Saliendo");
                    iterar = false;
                    break;
            }

        }
    }

    public static void crearTitular(Scanner input){
        Titulares temp = new Titulares();

        System.out.println("//////////////////////////////////////////////)");
        
        System.out.println("Ingrese el nombre del docente:");
        temp.setNombreYApellido(input.nextLine());

        System.out.println("Ingrese el legajo del docente:");
        try{
            temp.setNumeroDeLegajo(input.nextInt());input.nextLine();
        }catch(Exception e){
            System.out.println("Error, el dato ingresado es incorrecto");
        }

        System.out.println("Ingrese la fecha de nacimiento del docente (Formato:dd/MM/yyyy)");
        temp.setFechaDeNacimiento(input.nextLine());

        System.out.println("Ingrese el salario del docente");
        try{
            temp.setSalario(input.nextInt());input.nextLine();
        }catch(Exception e){
            System.out.println("Error, el dato ingresado es incorrecto");
        }

        System.out.println("Ingrese la antiguedad del docente");
        try{
            temp.setAntiguedad(input.nextInt());
        }catch(Exception e){
            System.out.println("Error, el dato ingresado es incorrecto");
        }

        temp.calcular_plus();

        Modelo.agregarDocente(temp);
    }    

    public static void crearSuplente(Scanner input){
        Suplentes temp = new Suplentes();

        System.out.println("//////////////////////////////////////////////)");
        
        System.out.println("Ingrese el nombre del docente:");
        temp.setNombreYApellido(input.nextLine());

        System.out.println("Ingrese el legajo del docente:");
        try{
            temp.setNumeroDeLegajo(input.nextInt());input.nextLine();
        }catch(Exception e){
            System.out.println("Error, el dato ingresado es incorrecto");
        }

        System.out.println("Ingrese la fecha de nacimiento del docente (Formato:dd/MM/yyyy)");
        temp.setFechaDeNacimiento(input.nextLine());

        System.out.println("Ingrese el salario del docente");
        try{
            temp.setSalario(input.nextInt());input.nextLine();
        }catch(Exception e){
            System.out.println("Error, el dato ingresado es incorrecto");
        }

        System.out.println("Ingrese la zona del docente");
        temp.setZona(input.nextLine());

        temp.calcular_plus();

        Modelo.agregarDocente(temp);        
    }

    public static void mostrarListado(){
        ArrayList<Docentes> temp = Modelo.getInstaceModelo();
        for (int i = 0; i < temp.size(); i++) {
            System.out.println("//////////////////////////////////////////////)");
            System.out.println("Número De Legajo: " + temp.get(i).getNumeroDeLegajo() +
                             "\nNombre: " + temp.get(i).getNombreYApellido() + 
                             "\nFecha De Nacimiento: " + temp.get(i).getFechaDeNacimiento() +
                             "\nEdad: " + temp.get(i).getEdad() +
                             "\nSalario: " + temp.get(i).getSalario());
        }
    }
}
