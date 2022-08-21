package view;

public class WelcomeScreen {

	public void welcomeSystemScreen() {

		String welcomeMessage = """
				________________________________________________

				# Welcome to Media Equipment Rental System #
				________________________________________________

				# Please, choose an option #

				1 - create new register
				2 - search person
				3 - update information
				4 - delete information
				0 - exit
					""";
		System.out.println(welcomeMessage);
	}
}
