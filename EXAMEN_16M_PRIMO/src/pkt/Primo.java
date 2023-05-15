package pkt;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Buenos días Ceinmark,soy ko2");
		System.out.println(" entre un numero por teclado");
		int par= sc.nextInt();
		
		if (par%2==0) {
			
			System.out.println(" es par");
		}else 
			System.out.println(" no es par");
		
		System.out.println(" final");
	}

}
