package view;

import java.util.Scanner;

import controller.DeleteController;

public class DeleteView {
	private String socialSecNumber;
	private String deleteMessage;
	protected DeleteController controller;

	public DeleteView() {
		controller = new DeleteController(this);
	}

	Scanner sc = new Scanner(System.in);

	public void printDelete() {
		System.out.println("\nPlease, enter social security number to delete");
		socialSecNumber = sc.next();

		deleteMessage = "\nThe personal information has been deleted";

		controller.deleteInformation();
	}

	public String getSocialSecNumber() {
		return socialSecNumber;
	}

	public String getDeleteMessage() {
		return deleteMessage;
	}

}
