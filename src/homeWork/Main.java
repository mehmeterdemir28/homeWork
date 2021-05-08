package homeWork;

import homeWork.business.concretes.AuthManager;
import homeWork.business.concretes.UserManager;
import homeWork.core.GoogleAdapter;
import homeWork.dataAccess.abstracts.UserDao;
import homeWork.dataAccess.concretes.InMemoryUser;
import homeWork.entities.concretes.User;
import homeWork.withGoogle.GoogleAuth;

public class Main {

	public static void main(String[] args) {
		
		
		User user =new User(2, "Mehmet", "Erdemir", "mehmeterdemir28@gmail.com", "mehmet1234");
		
		
			
		AuthManager authManager = new AuthManager(new GoogleAdapter(), new UserManager(new InMemoryUser()));
		

		authManager.register(user);
		authManager.login(user);
	
		
			
			
	
			
		
		

	}

}
