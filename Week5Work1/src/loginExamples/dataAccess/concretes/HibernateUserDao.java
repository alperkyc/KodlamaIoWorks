package loginExamples.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import loginExamples.core.abstracts.UserConstants;
import loginExamples.dataAccess.abstracts.UserDao;
import loginExamples.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	private List<User> userList = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println(user.getEmail() + " mail adresli kullanýcý sisteme eklendi. Email adresinisize bir doðrulama maili gönderilecektir.Onayladýktan sonra sisteme eriþebilirsiniz");
		userList.add(user);
		
	}

	@Override
	public List<User> getAll() {
		this.userList.add(new User(1,"Alper","Kuyucu","alperkyc17@gmail.com","123456")); // DB olmadýðý için validasyondan geçmek için test data olarak eklendi;
		return this.userList;
	}

	@Override
	public void update(User user) {
		int counter=0;
		for(User userForUpdate : userList) {
			if(userForUpdate.getId() == user.getId()) {
				this.userList.get(counter).setStatus(UserConstants.USER_STATUS_OPEN);
				
			}
			counter++;
		}
		
	}



}
