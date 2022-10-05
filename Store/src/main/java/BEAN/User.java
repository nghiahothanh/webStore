package BEAN;

import java.lang.invoke.StringConcatFactory;

public class User {

	private String userString;
	private String passwordString;
	private int category;
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getUserString() {
		return userString;
	}
	public void setUserString(String userString) {
		this.userString = userString;
	}
	public String getPasswordString() {
		return passwordString;
	}
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
	
}
