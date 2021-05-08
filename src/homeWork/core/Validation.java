package homeWork.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homeWork.entities.concretes.User;

public class Validation {

	public static boolean validatePassword(String password) {

		if (password.length() >= 6) {

			return true;

		} else {

			System.out.println("Parolanýn en az 6 haneli olmasý gerekli.");

			return false;

		}

	}

	public static boolean validateName(String nameSurname) {

		if (nameSurname.length() >= 3) {

			return true;

		} else {

			System.out.println("Adýnýz ve Soyadýnýz en az iki haneli olmalý");

			return false;
		}

	}

	public static boolean check(String email) {
		
	
	
	
	String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(email);
	
	var result = matcher.matches();
	
	
	return result;

	
	}
	
}

