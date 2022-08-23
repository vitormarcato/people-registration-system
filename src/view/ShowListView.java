package view;

import controller.ShowListController;

public class ShowListView {

	protected ShowListController controller;

	public ShowListView() {
		controller = new ShowListController(this);
	}

	public void printList () {
		controller.showList();
	}

}