package homeWork.core;

import homeWork.entities.concretes.User;

public class Verification implements MailSend {

	@Override
	public void send(User user) {
		
		System.out.println(user.geteMail() + " Adlý mailinize doðrulama kodu gönderildi.");
		
		
	}

	@Override
	public void clickOn(User user) {
		
		System.out.println(user.getFirstName() + " Adlý kullanýcýnýn üyeliði baþarýyla tamamlanmýþtýr.");
		
	}
	

	
	
	
	
}
