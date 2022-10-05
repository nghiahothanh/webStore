package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import BEAN.profile;

public class profileDAO {
	public static List<profile> displayProfiles(Connection conn) {
		List<profile> listprofile = new ArrayList<profile>();
		try {
		
		String sqlString ="select * from web.profile ";
		PreparedStatement pStatement = conn.prepareStatement(sqlString);
		ResultSet rSet =pStatement.executeQuery();
		while(rSet.next()) { 
			profile profile = new profile();
			int id = rSet.getInt(1);
			String usernameString= rSet.getString(2);
			Date birthdayDate= rSet.getDate(3);
			int numberphone = rSet.getInt(4);
			String firstNameString =rSet.getString(5);
			String addressString = rSet.getString(6);
			String lastnameString= rSet.getString(7);
			String cityString= rSet.getString(8); 
			String countryString=rSet.getString(9);
			int postalcodeString=rSet.getInt(10);
			String emailString=rSet.getString(11);
			String aboutmeString=rSet.getString(12);
			String universityString=rSet.getString(13);
			String specializedString=rSet.getString(14);
			profile.setId(id);
			profile.setThanhnghiaString(usernameString);
			profile.setBirthdayDate(birthdayDate);
			profile.setNumberphone(numberphone);
			profile.setFisrtnameString(firstNameString);
			profile.setAddressString(addressString);
			profile.setLastnameString(lastnameString);
			profile.setCityString(cityString);
			profile.setCountryString(countryString);
			profile.setPostalcode(postalcodeString);
			profile.setEmailString(emailString);
			profile.setAboutmeString(aboutmeString);
			profile.setUniversityString(universityString);
			profile.setSpecializedString(specializedString);
			listprofile.add(profile);
			
			
		}
		}
		catch (Exception e) {
			e.getMessage();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listprofile;
	}
}
