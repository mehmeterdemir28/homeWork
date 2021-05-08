package homeWork.core;

import homeWork.entities.concretes.User;

public interface AuthService {

	void login(User user);

	void register(User user);


}
