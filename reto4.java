package Reto;
import java.util.Scanner;
import java.util.Random;
public class reto4
{
public static void main(String[] args) 
{
        int seleciones, machineSelection;
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();
       
        System.out.println("Bienvenido al juego Piedra, Papel o Tijera");
        System.out.println("");
        System.out.println("Elegir una de las siguientes opciones: \n Escriba el numero 1 si su selecion es Piedra \n Escriba el numero 2 si su selecion es Papel \n Escriba el numero 3 si su selecion es Tijera");
        seleciones = lectura.nextInt();

        machineSelection = 1+random.nextInt(3);

        System.out.println("El random escogio : ");
        switch (machineSelection)
		{  
			case 1:
				System.out.println("Piedra");
				switch (seleciones)
				{
					case 1: System.out.println("Igualarón"); 
                    break;
					case 2: System.out.println("Ganó"); 
                    break;
                    case 3: System.out.println("Perdió"); 
                    break;
				}
				break;

			case 2:
				System.out.println("Papel");
				switch (seleciones)
				{
					case 1: System.out.println("Perdió"); 
                    break;
					case 2: System.out.println("Igualarón"); 
                    break;
                    case 3: System.out.println("Ganó"); 
                    break;
				}
				break;

            case 3:
				System.out.println("Tijera");
				switch (seleciones)
				{
					case 1: System.out.println("Ganó"); 
                    break;
					case 2: System.out.println("Perdió"); 
                    break;
                    case 3: System.out.println("Igualarón"); 
                    break;
				}
				break;
                default: System.out.println("Error, opcion no valida");
                break;
            }
    lectura.close();
}
}


    


    
    
    

    
