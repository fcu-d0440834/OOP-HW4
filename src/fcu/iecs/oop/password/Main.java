package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PasswordEncorder passwordencorder = new PasswordEncorder();

		String password;
		int flag = 0;
		while (flag == 0) {
			System.out.printf("Please enter a password:");
			password = scanner.next();
			if(password.compareToIgnoreCase("exit")==0)
				return;
			password=passwordencorder.encode(password);
			System.out.printf("%s\n",password);
		}

	}

}
