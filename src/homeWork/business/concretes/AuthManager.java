package homeWork.business.concretes;

import homeWork.business.abstracts.AuthManagerService;
import homeWork.business.abstracts.UserService;
import homeWork.core.AuthService;
import homeWork.entities.concretes.User;

public class AuthManager implements AuthManagerService {

	private AuthService authService;
	private UserService userService;
	
	
	
	
	


	public AuthManager(AuthService authService, UserService userService) {

		this.authService = authService;
		this.userService = userService;
	}
	
	

	@Override
	public void login(User user) {
	
		this.authService.login(user);

	}

	@Override
	public void register(User user) {
	
		this.authService.register(user);
		
		this.userService.add(user);
	}

	




}
