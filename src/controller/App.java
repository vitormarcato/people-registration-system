package controller;

import java.util.Scanner;
import view.RegisterPersonView;
import view.SearchView;
import view.WelcomeView;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		WelcomeView printWelcome = new WelcomeView();
		printWelcome.welcomeSystemScreen();
		int userOption = Integer.parseInt(sc.nextLine());
		System.out.println(userOption);
		
		SearchView searchPerson = new SearchView();
		searchPerson.printSearchView();
		
		/*
		 * RegisterPersonView createRegister = new RegisterPersonView();
		 * createRegister.printRegisterView();
		 */
		
		
		
		sc.close();
	}

}
