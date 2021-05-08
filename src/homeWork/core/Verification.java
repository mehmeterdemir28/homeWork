package homeWork.core;

import homeWork.entities.concretes.User;

public class Verification implements MailSend {

	@Override
	public void send(User user) {
		
		System.out.println(user.geteMail() + " Adl� mailinize do�rulama kodu g�nderildi.");
		
		
	}

	@Override
	public void clickOn(User user) {
		
		System.out.println(user.getFirstName() + " Adl� kullan�c�n�n �yeli�i ba�ar�yla tamamlanm��t�r.");
		
	}
	

	
	
	
	
}
