package org.test_jee5.appwebjsf;

import javax.faces.bean.ManagedBean;

/**
 * Created by Alain on 15/07/2016.
 */
@ManagedBean
public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
