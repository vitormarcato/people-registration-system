package view;

import java.util.Scanner;

import controller.SearchController;

public class SearchView {
	
	Scanner sc = new Scanner(System.in);
	
	private String socialSecNumber;
	private SearchController controller;
		
	public SearchView() {
		controller = new SearchController(this);
	}

	public void printSearchView() {
		
		System.out.println("\nPlease, enter the Social Security Number");
		socialSecNumber = sc.next();		
		controller.searchPersonbySocialSecNumber();
	}

	public String getSocialSecNumber() {
		return socialSecNumber;
	}
}
