package cl.desafiolatam;

import java.util.Scanner;

public class Nivelacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double numero = 6.1;
        float decimal2 = (float) numero;
        int decimalCorto = (int) decimal2;
        
        System.out.println(numero);
        System.out.println(decimal2);
        System.out.println(decimalCorto);

        System.out.println("Ingresa un número");
		int numero1 = sc.nextInt();
		System.out.println("Ingresa otro número");
		int numero2 = sc.nextInt();
		int suma = numero1 + numero2;
		
		
		System.out.printf("El resultado de la suma de %d + %d = %d\n", numero1, numero2, suma);
		System.out.println("El resultado de la suma de " + numero1 + " + " + numero2 + " = " + suma); 
	}

}
