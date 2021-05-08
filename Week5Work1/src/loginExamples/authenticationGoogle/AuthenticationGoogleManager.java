package loginExamples.authenticationGoogle;

import loginExamples.entities.concretes.User;

public class AuthenticationGoogleManager {
	public User addWithGoogle() {
		//kendi kontrol kodlarý olacak
		return new User(3,"Abc","Dfg","abc@gmail.com","123456");
	}

}
