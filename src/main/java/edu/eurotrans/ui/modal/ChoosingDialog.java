package edu.eurotrans.ui.modal;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;

public class ChoosingDialog extends Dialog {
	private FormLayout formLayout;

	public ChoosingDialog(String label) {
		formLayout = new FormLayout();
		this.setHeaderTitle(label);
		this.add(formLayout);
	}

	public FormLayout getForm() {
		return formLayout;
	}
}
