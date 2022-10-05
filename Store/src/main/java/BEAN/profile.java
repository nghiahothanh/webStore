package BEAN;

import java.awt.desktop.AboutEvent;
import java.util.Date;

public class profile {
	
	private int id;
	private String thanhnghiaString;
	private String fisrtnameString;
	private String lastnameString;
	private String addressString;
	private int numberphone;
	private String aboutmeString;
	private String cityString;
	private String countryString;
	private int postalcode;
	private Date birthdayDate;
	private String universityString;
	private String emailString;
	private String specializedString;
	public profile() {
		super();
	}
	public String getSpecializedString() {
		return specializedString;
	}
	public void setSpecializedString(String specializedString) {
		this.specializedString = specializedString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getThanhnghiaString() {
		return thanhnghiaString;
	}
	public void setThanhnghiaString(String nameString) {
		this.thanhnghiaString = nameString;
	}
	public String getFisrtnameString() {
		return fisrtnameString;
	}
	public void setFisrtnameString(String fisrtnameString) {
		this.fisrtnameString = fisrtnameString;
	}
	public String getLastnameString() {
		return lastnameString;
	}
	public void setLastnameString(String lastnameString) {
		this.lastnameString = lastnameString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public int getNumberphone() {
		return numberphone;
	}
	public void setNumberphone(int numberphone) {
		this.numberphone = numberphone;
	}
	public String getAboutmeString() {
		return aboutmeString;
	}
	public void setAboutmeString(String aboutmeString) {
		this.aboutmeString = aboutmeString;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public String getCountryString() {
		return countryString;
	}
	public void setCountryString(String countryString) {
		this.countryString = countryString;
	}
	public int getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}
	public Date getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(Date birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	public String getUniversityString() {
		return universityString;
	}
	public void setUniversityString(String universityString) {
		this.universityString = universityString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	
}
