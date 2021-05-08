package homeWork.dataAccess.concretes;

import java.util.List;

import homeWork.dataAccess.abstracts.UserDao;
import homeWork.entities.concretes.User;

public class InMemoryUser implements UserDao {

	@Override
	public void add(User user) {

		System.out.println(user.getFirstName() + " Eklendi");

	}

	@Override
	public void delete(User user) {

		System.out.println(user.getFirstName() + " Silindi");
	}

	@Override
	public void update(User user) {

		System.out.println(user.getFirstName() + " Güncellendi");
	}

	@Override
	public User get(int id) {

		return null;
	}

	@Override
	public List<User> getAll() {

		return null;
	}

}
