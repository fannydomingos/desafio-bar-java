package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Sexo: ");
		char gender = sc.next().charAt(0);

		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();

		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();


        Bill bill = new Bill(gender, beer, softDrink, barbecue );
     
		System.out.println();
		System.out.println("RELATÓRIO:");
        System.out.printf("Consumo: R$ %.2f%n", bill.feeding());
        System.out.printf("Ingresso: R$ %.2f%n", bill.ticket());
        System.out.printf("Couvert artístico: R$ %.2f%n", bill.cover());
        System.out.printf("Total a pagar: R$ %.2f%n", bill.total());

        
		sc.close();
	}

}
