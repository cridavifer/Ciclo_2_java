import java.util.Scanner;

public class Clase2b {
    

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa tu nombre ");
        String nombre= scanner.nextLine();

        System.out.println("Hola " + nombre);

        System.out.println("Ingresa tu nombre 2 ");
        String nombre2= scanner.nextLine();
        System.out.println(saludar(nombre2));
    }      

    public static String saludar(String nombre){
        return "Hola2 "+ nombre;
    }
}
