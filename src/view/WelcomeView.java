package view;

public class WelcomeView {

	public void welcomeSystemScreen() {

		String welcomeMessage = """
				________________________________________________

				# Welcome to People Registration System #
				________________________________________________

				# Please, choose an option #

				1 - create new register
				2 - search person
				3 - update information
				4 - delete register
				5 - show registration list 
				0 - exit
					""";
		System.out.println(welcomeMessage);
	}
}
