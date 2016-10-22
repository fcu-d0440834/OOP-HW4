package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		NissanTiida nissantiida = new NissanTiida();

		Scanner scanner = new Scanner(System.in);

		int i,num = 0;
		System.out.printf("Please enter a number:");
		num = scanner.nextInt();
        for(i=0;i<num;i++)
        {
        	nissantiida.tiida();
        }
	}
}
