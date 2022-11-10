package Reto;
import java.util.Scanner;

public class reto5 
{
    public static void main(String[] args)
     {

        int cantidad;
        int precio , total = 0;
        

        Scanner in = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de los productos que quiere comprar");
        cantidad= in.nextInt();
        System.out.println("");

        for(int a = 1; a <= cantidad; a++)
        {
            System.out.println("Ingresar el precio de los prodeuctos que quiere comprar: " +a);
            precio = in.nextInt();
            System.out.println("");

            total = total + precio;

        }

        System.out.println("Los productos fueron: " + cantidad + " con un precio total de : " + total);

        in.close();
    }
}

