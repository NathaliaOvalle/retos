package Reto;
import java.util.Scanner;
import java.util.Random;

public class reto6 
{
    public static void main(String[] args) {

        int selecion, apuestas, repetir = 1, l1 = 0, total = 0, n1 = 2, perdidas = 0;
        int machineSelection = 0;
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		while(repetir==1)
		{
		
			
			l1++;

		System.out.println("-----------------------------Carisellazo----------------------------");
		machineSelection = 1+random.nextInt(2);	
        System.out.println("");

        System.out.println("Dijite cuanto dinero quiere apostar");
        apuestas = in.nextInt();
        System.out.println("");

		System.out.println("Dijite una opción \n Ingresar el numero 1 para elegir Cara \n Ingresar el numero 2 para elegir Sello");
		selecion = in.nextInt();
		System.out.println("");

		System.out.println("El random eligio: ");
		switch (machineSelection)
		{  
			case 1:
				System.out.println("CARA");
				switch (selecion)
				{
					case 1: System.out.println("Ganó");
					total = total + (apuestas * n1 ); 
                    break;
					case 2: System.out.println("Perdió"); 
					perdidas = apuestas - perdidas;
                    break;
				}
				break;

			case 2:
				System.out.println("SELLO");
				switch (selecion)
				{
					case 1: System.out.println("Perdió"); 
					perdidas = apuestas- perdidas;
                    break;
					case 2: System.out.println("Ganó"); 
					total = total + (apuestas * n1 );
                    break;
				}
				break;
                default: System.out.println("Error, opcion no valida");
                break;

		    }

			System.out.println("");
			System.out.println("¿Quiere volver a jugar?");
			System.out.println("Escriba una opción \n Escriba el numero 1 para volver a jugar \n Ingresar el numero 2 para salir del juego");
			repetir = in.nextInt();
			System.out.println("");

	    }

		System.out.println("Usted jugó " + l1 + " veces");
		System.out.println("Usted ganó un total de: " + total);
		System.out.println("Usted perdió un total de: " + perdidas);
		
        in.close();

    }
      
}

