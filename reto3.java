package Reto;
import java.util.Scanner;
import java.util.Random;

public class reto3
{
    {
        int selecion;
        int machineSelection = 0;
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Carisellazo");
		machineSelection = 1+random.nextInt(2);
		
        System.out.println("");


		System.out.print("Escriba una opción \n Escriba el numero 1 para elegir CARA\n Escriba el numero 2 para elegir SELLO");
		selecion = in.nextInt();

		System.out.println("El random escogio: ");
		switch (machineSelection)
		{  
			case 1:
				System.out.println("CARA");
				switch (selecion)
				{
					case 1: System.out.println("Ganó"); 
                    break;
					case 2: System.out.println("Perdió"); 
                    break;
				}
				break;

			case 2:
				System.out.println("SELLO");
				switch (selecion)
				{
					case 1: System.out.println("Perdió"); 
                    break;
					case 2: System.out.println("Ganó"); 
                    break;
				}
				break;
                default: System.out.println("Error, opcion no valida");
                break;

		}

		in.close();
	}
    
}
