package Reto;
import java.util.Scanner;

public class reto2  
    {
        public static void main(String[] args) 
        {
    int pesobebe;
    int mesesbebe;
    int dosis;
    Scanner lectura = new Scanner(System.in);


    System.out.println("Ingrese el peso del bebe a vacunar");
    pesobebe = lectura.nextInt();


    System.out.println("Ingrese los meses del bebe");
    mesesbebe = lectura.nextInt();
    
    dosis = (pesobebe + 10)/( mesesbebe * 10)*8;

    System.out.println("La dosis que debe aplicar al bebe es: "+ dosis);


    lectura.close();

        }
    }
