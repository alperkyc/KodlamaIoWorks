package loginExamples.business.concretes;

import loginExamples.authenticationGoogle.AuthenticationGoogleManager;
import loginExamples.core.abstracts.ExternalRegistrationService;
import loginExamples.entities.concretes.User;

public class ExternalRegistrationAdapter implements ExternalRegistrationService {

	@Override
	public User addExternal() {
		AuthenticationGoogleManager authenticationGoogleManager = new AuthenticationGoogleManager();
		return authenticationGoogleManager.addWithGoogle();
	}

}
