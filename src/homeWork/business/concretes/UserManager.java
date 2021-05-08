package homeWork.business.concretes;

import java.util.List;

import homeWork.business.abstracts.UserService;
import homeWork.dataAccess.abstracts.UserDao;
import homeWork.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {

		this.userDao.add(user);

	}

	@Override
	public void delete(User user) {

		this.userDao.delete(user);

	}

	@Override
	public void update(User user) {
	
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		
		return this.userDao.get(id);
	}

	@Override
	public List<User> getAll() {
		
		
		return this.userDao.getAll();
	}

}
