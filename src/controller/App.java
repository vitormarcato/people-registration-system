package controller;

import java.util.Scanner;
import view.WelcomeScreen;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		WelcomeScreen PrintWelcome = new WelcomeScreen();
		PrintWelcome.welcomeSystemScreen();
		int userOption = Integer.parseInt(sc.nextLine());
		
		System.out.println(userOption);
		
		sc.close();
	}

}
