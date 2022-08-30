

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
		
		switch (userOption) {	
		case 1: RegisterPersonView createRegister = new RegisterPersonView();
		createRegister.printRegisterView();
		break;
		case 2: SearchView searchPerson = new SearchView(); 
		searchPerson.printSearchView();
		break;
		case 3:	UpdateInformationView updateInformation = new UpdateInformationView();
		updateInformation.printUpdateInformation();	
		break;
		case 4:	DeleteView deleteInformation = new DeleteView();
		deleteInformation.printDelete();
		break;
		case 5:	ShowListView showList = new ShowListView();
		showList.printList();
		break;
		case 0: System.exit(0);
		default: System.out.println("Please, try again.");
		}

		sc.close();
	}
		
}
