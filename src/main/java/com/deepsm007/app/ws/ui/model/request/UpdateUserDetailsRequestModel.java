package com.deepsm007.app.ws.ui.model.request;

import javax.validation.constraints.NotNull;
/**
 * 
 * @author Deep Mistry
 *
 */
public class UpdateUserDetailsRequestModel {
	@NotNull(message = "First Name cannot be null")
	private String firstName;
	@NotNull(message = "Last Name cannot be null")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
