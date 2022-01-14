

import java.util.Scanner;

public class Solution
{
    // 3.- En un método mostrar la tabla de multiplicar de cualquier numero ingresado por teclado.

    public static class Ejercicio3
    {
        Scanner dato=new Scanner(System.in);
        public void multiplicar(int n1){
            System.out.println("Ingrese el numero");
            n1 = dato.nextInt();
            for(int a=1;a<=12;a++){
                int resul=a*n1;
                System.out.println(" º "+ a + " x " +n1+ " = " +resul);
            }
        }
        public static void main(String[]args){
            Ejercicio3 tabla = new Ejercicio3();
            tabla.multiplicar(0);
        }
    }
}