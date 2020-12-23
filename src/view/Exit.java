package view;

import java.util.Scanner;

public class Exit {
	public int exit() {
		Scanner ip = new Scanner(System.in);
		System.out.println("=============Do you want exit=============");
		System.out.println("1. Yes!");
		System.out.println("2. No!\n");
		int exit = Integer.parseInt(ip.nextLine());
		if (exit == 1) {
			System.exit(0);
		}
		return exit;
	}
}
