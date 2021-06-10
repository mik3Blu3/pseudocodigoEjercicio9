import java.util.Scanner;
public class ejercicio9
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        int promedioTemperaturas = 0;
        int contPromedio = 0;
        int tempAux=0;
        int contTemp =0;
        System.out.println("Se leeran pares de temperaturas ingreselas (t1,t2)");
        while(contTemp != 1)
        {
            System.out.println("Porfavor ingrese la temperatura T1");
            int temp1 = entrada.nextInt();
            if(temp1 == 0)
            {
                contTemp =1;
                System.out.println("La temperatura  1 es cero por ende termina el programa");
                System.out.println("");
            }else{
                System.out.println("Porfavor ingrese la temperatura T2");
                int temp2 = entrada.nextInt();
                if((temp1 >= 5) && (temp1 <=15))
                {
                    promedioTemperaturas = (promedioTemperaturas+temp1);
                    contPromedio = (contPromedio+1);
                }
                if((temp2 >= 5) && (temp2 <= 15))
                {
                    promedioTemperaturas = (promedioTemperaturas+temp2);
                    contPromedio = (contPromedio+1);
                }
            }
        }
        if(contPromedio != 0)
        {
            int promedioTemperaturasReal = (promedioTemperaturas/contPromedio);
            System.out.println("El promedio de las temperaturas entre el rango (5-15) Grados es:");
            System.out.println(+promedioTemperaturasReal+" GRADOS");
        }
    }
}