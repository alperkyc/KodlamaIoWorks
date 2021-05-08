package loginExamples.dataAccess.abstracts;

import java.util.List;

import loginExamples.entities.concretes.User;

public interface UserDao {

	void add(User user);
	List<User> getAll();
	void update(User user);
}
