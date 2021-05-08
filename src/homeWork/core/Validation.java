package homeWork.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homeWork.entities.concretes.User;

public class Validation {

	public static boolean validatePassword(String password) {

		if (password.length() >= 6) {

			return true;

		} else {

			System.out.println("Parolan�n en az 6 haneli olmas� gerekli.");

			return false;

		}

	}

	public static boolean validateName(String nameSurname) {

		if (nameSurname.length() >= 3) {

			return true;

		} else {

			System.out.println("Ad�n�z ve Soyad�n�z en az iki haneli olmal�");

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

