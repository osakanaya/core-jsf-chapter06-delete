package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TableData implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final List<Name> names = new ArrayList<Name>(Arrays.asList(
			new Name("William", "Dupont"),
			new Name("Anna", "Keeney"),
			new Name("Mariko", "Randor"),
			new Name("John", "Wilson")
	));
	
	public List<Name> getNames() {
		return names;
	}

	public String deleteRow(Name nameToDelete) {
		names.remove(nameToDelete);
		
		return null;
	}
}
