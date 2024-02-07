package net.austrycastillo.integrador;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// PROYECTO INTEGRADOR
		// CREAR VARIABLES
		double saldo = 2000, monto;
		int clave = 123, opcion, claveIngresada;
		int c = 1;// contador
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Ingresa tu password");
		claveIngresada = sc.nextInt();
		if (clave == claveIngresada) {
			System.out.println("Bienvenido");
			System.out.println("Seleccione una opción del menú:");
			System.out.println("\t 1 - saldo \n\t 2 - retiro");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Su saldo es " + saldo);
				break;
			case 2:
				System.out.println("ingrese el monto a retirar");
				monto = sc.nextDouble();
				if (monto < saldo) {
					saldo -= monto; // saldo = saldo - monto;
					System.out.println("Retiro correcto, su saldo actualizado es " + saldo);
				} else
					System.out.println("Saldo insuficiente");
				break;
			default:
				System.out.println("No existe esa opción");

			}
			c = 4;
		} else {
			System.out.println("Clave incorrecta");
			c++;
		}
	} while (c <= 3);
	System.out.println("Chao");
	}
}
