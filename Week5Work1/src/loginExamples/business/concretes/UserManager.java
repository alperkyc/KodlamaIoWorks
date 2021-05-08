package loginExamples.business.concretes;

import java.util.List;

import loginExamples.business.abstracts.UserService;
import loginExamples.core.abstracts.ExternalRegistrationService;
import loginExamples.core.abstracts.UserConstants;
import loginExamples.core.concretes.AuthenticationService;
import loginExamples.dataAccess.abstracts.UserDao;
import loginExamples.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private ExternalRegistrationService externalRegistrationService;

	public UserManager(UserDao userDao,ExternalRegistrationService externalRegistrationService) {
		super();
		this.userDao = userDao;
		this.externalRegistrationService = externalRegistrationService;
	}

	@Override
	public void add(User user) {
		
		if(!AuthenticationService.isUserEmailRegistered(getAll(), user.getEmail())) {
			System.out.println("Bu kullanýcý sistemde kayýtlýdýr");
			return;
		}
		
		if(AuthenticationService.checkGeneralInfoForSýgnUp(user)) {
			if(!AuthenticationService.checkEmailValidation(user.getEmail())){
				System.out.println("Yazýlan Email, email formatýnda deðildir");
			}
			
			else {
				user.setStatus(UserConstants.USER_STATUS_CLOSE);
				this.userDao.add(user);
				AuthenticationService.sendEmailForVerify(user);
			}
			
			
		}
		
		
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public void login(String email,String password) {
		List<User> userList = getAll();
		for(User user2 : userList) {
			if(user2.getEmail().equals(email) && user2.getPassword().equals(password)) {
				if(user2.getStatus().equals(UserConstants.USER_STATUS_CLOSE)) {
					System.out.println("Email adresinizi doðrulamak için email yollanmýþtýr");
					return;
				}
				System.out.println("Sisteme baþarýyla giriþ yaptýnýz");
				return;
			}
		}
		System.out.println("Bu email veya password sisteme kayýtlý deðildir");
		
	}

	@Override
	public void clickMailVerify(User user) {
		this.userDao.update(user);
		System.out.println("Mail adresinizi baþarýyla doðruladýnýz . Sisteme giriþ yapabilirsiniz.");
		
		
		
	}

	@Override
	public void addExternal() {
		User user = externalRegistrationService.addExternal();
		this.add(user);
		this.userDao.update(user);
		
	}


	
	
}
