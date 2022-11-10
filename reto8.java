package Reto;
import java.util.Scanner;



public class reto8 
{
    public static void main(String[] args) 
    {

        int Cantidad;
 
        Scanner as = new Scanner(System.in);

        System.out.println("Escriba la cantidad de competidores");
        Cantidad = as.nextInt();
        System.out.println("");

        String competitors[] = new String[Cantidad];
        int timecompetidores[] = new int[Cantidad];
        
        for(int A=0; A<competitors.length; A++){
            System.out.println("Escriba el nombre del competidor el número: " +A);
            competitors[A] = as.next();
            System.out.println("");
            System.out.println("Escriba el tiempo del competidor en números: " +A);
            timecompetidores[A] = as.nextInt();
            System.out.println("");
        }

        System.out.println("|----------------------------------------------------------------------------------------------------|");
        for(int F=0; F<competitors.length; F++){
            System.out.println("El competidor: " +competitors[F]+", tuvo un tiempo de : "+ timecompetidores[F] +" minutos");    
        }

        as.close();
    }

}

