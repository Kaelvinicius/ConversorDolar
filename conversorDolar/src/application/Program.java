package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade em Dolar a ser convetitida "
				+ " para Real");
		float valor = sc.nextFloat();
		
		float valorBruto =  valor * 5.22f;
		
		System.out.printf("U$" + valor + " equivale a R$%.2f ", valorBruto);

	}

}
