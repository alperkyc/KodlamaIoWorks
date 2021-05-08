package loginExamples.business.abstracts;

import java.util.List;

import loginExamples.entities.concretes.User;

public interface UserService {

	void add(User user);
	List<User> getAll();
	void login(String email,String password);
	void clickMailVerify(User user);
	void addExternal();
}
