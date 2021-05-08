package homeWork.withGoogle;

import homeWork.entities.concretes.User;

public class GoogleAuth  {

	public void loginWithGoogle(User user) {
		
		System.out.println(user.geteMail() + " Gmailiniz ile birlikte baþarýyla giriþ yaptýnýz");
		
	}

	public void registerWithGoogle(User user) {
		
		System.out.println(user.geteMail() + " Gmail hesabýnýz baþarýyla kayýt oldu" );
		
	}

	
	
}
