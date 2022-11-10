package Reto;
import java.util.Scanner;
public class reto7 
{
    public static void main(String[] args)
    {
        
        double add = 0, resultados = 0;
        int Cantidad;
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba la cantidad de NOTAS que desea evaluar");
        Cantidad= in.nextInt();
        double notas[] = new double[Cantidad];
        System.out.println("");


        for(int n=0; n< Cantidad; n++){
            System.out.println("Ingresar la NOTA: " +n);
            notas[n] = in.nextDouble();
            add += notas[n];
            System.out.println("");
        }
        resultados = add/Cantidad;

        System.out.println("|---------------------|");
        System.out.println("Promedio de las NOTAS: " + resultados);
       
        if (resultados < 3)
           {
            System.out.println("Perdio, Esfuerzate más ");
            System.out.println("|------------------|");

           }
           else if(resultados >3 && resultados<4 )
           {
            System.out.println("Paso Raspando, Mejora tu rendimiento");
            System.out.println("|---------------------|");

           }
           else{
            System.out.println("Aprobaste, Sigue Asi");
            System.out.println("|-----------------------|");
           }
           
        in.close();
    }
    
}



       
    