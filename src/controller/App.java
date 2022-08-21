package controller;

import java.util.Scanner;

import view.RegisterNewPerson;
import view.WelcomeScreen;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		WelcomeScreen printWelcome = new WelcomeScreen();
		printWelcome.welcomeSystemScreen();
		int userOption = Integer.parseInt(sc.nextLine());
		System.out.println(userOption);
		
		RegisterNewPerson createRegister = new RegisterNewPerson();
		createRegister.newRegister();
		
		sc.close();
	}

}
