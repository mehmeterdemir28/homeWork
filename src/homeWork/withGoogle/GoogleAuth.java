package homeWork.withGoogle;

import homeWork.entities.concretes.User;

public class GoogleAuth  {

	public void loginWithGoogle(User user) {
		
		System.out.println(user.geteMail() + " Gmailiniz ile birlikte ba�ar�yla giri� yapt�n�z");
		
	}

	public void registerWithGoogle(User user) {
		
		System.out.println(user.geteMail() + " Gmail hesab�n�z ba�ar�yla kay�t oldu" );
		
	}

	
	
}
