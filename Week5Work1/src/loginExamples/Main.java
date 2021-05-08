package loginExamples;

import java.util.Scanner;

import loginExamples.business.abstracts.UserService;
import loginExamples.business.concretes.ExternalRegistrationAdapter;
import loginExamples.business.concretes.UserManager;
import loginExamples.dataAccess.concretes.HibernateUserDao;
import loginExamples.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(),new ExternalRegistrationAdapter());
		User user1 = new User(1,"Alper","Kuyucu","alperkyc@gmail.com","123456");
		//ayný email (Sistemde kayýtlý mý)
		//userService.add(new User(1,"Alper","Kuyucu","alperkyc@gmail.com","123456"));
		
		//email kontrol (yanlýs)
		//userService.add(new User(1,"Alper","Kuyucu","alperkycgmail.com","123456"));
		
		//email kontrol (doðru)
		userService.add(user1);
		
		//login(yanlýs)
		userService.login(user1.getEmail(),user1.getPassword());
		
		//login(doðru)
		userService.clickMailVerify(user1);
		
		userService.login(user1.getEmail(),user1.getPassword());
		
		Scanner scanner  = new Scanner(System.in);
		System.out.print("Google ile üye olmak için E yazýnýz: ");
		
		if(scanner.hasNext("E")) {
			userService.addExternal();
		}
		
		userService.clickMailVerify(user1);

	}

}
