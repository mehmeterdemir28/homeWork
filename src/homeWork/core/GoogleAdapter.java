package homeWork.core;

import homeWork.entities.concretes.User;
import homeWork.withGoogle.GoogleAuth;

public class GoogleAdapter implements AuthService {

	private GoogleAuth googleAuth;
	
	
	
	public GoogleAdapter() {
		
		this.googleAuth = new GoogleAuth();
	}
		
	@Override
	public void login(User user) {
		
		this.googleAuth.loginWithGoogle(user);
		
	}

	@Override
	public void register(User user) {
		
		this.googleAuth.registerWithGoogle(user);
		
	}

	
	
}
