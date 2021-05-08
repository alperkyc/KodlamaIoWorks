package loginExamples.core.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import loginExamples.entities.concretes.User;

public class AuthenticationService {
	
	public static boolean checkGeneralInfoForS�gnUp(User user) {
		int firstNameLength = user.getFirstName().length();
		int lastNameLength = user.getLastName().length();
		int passwordLength = user.getPassword().length();
		
		if(firstNameLength < 2) {
			System.out.println("Kullan�c� ad� en az iki karakter olmal�d�r.");
			return false;
		}
		else if(lastNameLength < 2) {
			System.out.println("Kullan�c� soyad� en az iki karakter olmal�d�r.");
			return false;
		}
		else if(passwordLength < 6) {
			System.out.println("Kullan�c� �ifresi en az 6 karakter olmal�d�r.");
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean checkEmailValidation(String email) {
		if(!email.isEmpty()) {
			String emailRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
			Pattern pattern = Pattern.compile(emailRegex);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}
		else {
			return false;
		}	
		
	}
	
	public static boolean isUserEmailRegistered(List<User> userList,String email) {
		for(User user:userList) {
			if(user.getEmail().equals(email))
			return false;
		}
		return true;
	}
	
	public static void sendEmailForVerify(User user) {
		System.out.println(user.getEmail() + " adresine hesap do�rulama maili g�nderilmi�tir");
	}

}
