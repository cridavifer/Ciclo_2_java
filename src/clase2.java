import java.util.Scanner;

public class clase2 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        
        //int entrada2 = scanner.nextInt();
        String entrada = scanner.nextLine();
        System.out.println("El mensaje fue " + entrada);

        System.out.println("Ingresa una animal");
        String animal = scanner.nextLine();

        if (animal.equals("Perro")){
            System.out.println("WOW wow");
        }
        else if (animal.equals("gato")){
            System.out.println("Miauu");
        }

        switch (animal){

            case "Perro":
                 System.out.println("Woff");
                 break;
            case "gato":
                 System.out.println("Miauu");
                 break;
            default:
                 System.out.println("No se encuentra el animal");
        }

        int contador =1;
        while(true){
            System.out.println(":)");
            contador = contador +1;
            if(contador==5){
                break;
            }
        
        }

        int numero =5;
        do {
            System.out.println(":)");
        } while(numero>7);
        
        for(int i=0;i<5;i=i+1){
            System.out.println(":-)");
        }


        for(int i=7;i>0;i=i-1){
            System.out.println("(:-)");
        }

        for(int i=0;i<20;i=i+2){
            if (i==8){
                continue;
            }
            System.out.println(i);
        }


        for(int i=0;i<20;i=i+2){
            if (i==8){
                break;
            }
            System.out.println(i);
        }

        int a=9;
        System.out.println(a+5);
        System.out.println(a-5);
        System.out.println(a*5);
        System.out.println(a/5);
        System.out.println(a%5);
        System.out.println(a+5);
        System.out.println(Math.pow(4,3));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(9,1/3));




}
}
