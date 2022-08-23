package controller;

import java.util.Scanner;

import view.DeleteView;
import view.RegisterPersonView;
import view.SearchView;
import view.ShowListView;
import view.UpdateInformationView;
import view.WelcomeView;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		WelcomeView printWelcome = new WelcomeView();
		printWelcome.welcomeSystemScreen();
		int userOption = Integer.parseInt(sc.nextLine());
		
		if (userOption == 1) {
			RegisterPersonView createRegister = new RegisterPersonView();
			createRegister.printRegisterView();
			
		} else if (userOption == 2) {
			SearchView searchPerson = new SearchView(); 
			searchPerson.printSearchView();
			
		} else if (userOption == 3) {
			UpdateInformationView updateInformation = new UpdateInformationView();
			updateInformation.printUpdateInformation();			

		} else if (userOption == 4) {
			DeleteView deleteInformation = new DeleteView();
			deleteInformation.printDelete();
		
		} else if (userOption == 5) {
			ShowListView showList = new ShowListView();
			showList.printList();	
			
		} else if (userOption == 0) {
			System.exit(0);
		} else {
			System.out.println("Please, try again.");
		}
		sc.close();
	}
		
}
