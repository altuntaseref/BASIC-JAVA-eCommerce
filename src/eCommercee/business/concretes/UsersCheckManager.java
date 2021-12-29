package eCommercee.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import eCommercee.business.abstracts.VerificationService;
import eCommercee.entities.concretes.Users;

public class UsersCheckManager implements VerificationService{
	

	@Override
	public boolean checkPassword(Users users) {
		if (users.getPassword().length()>=6 ) {
			
			System.out.println("Þifre : UYGUN");
			return true;
			
			
		}else {
			System.out.println("Þifre en az 6 karakterden oluþmalýdýr.");
		return false;
		}
		
	}

	@Override
	public boolean checkEmail(Users users) {
		Pattern regexEmail = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
		Matcher matcher = regexEmail.matcher(users.geteMail());
		if ( matcher.matches()) {
			System.out.println("Email : UYGUN");
			return true;
			
		}
		else{
			
			System.out.println("Email : UYGUN DEÐÝLDÝR");
			return false;
		}
		
		
	}

	@Override
	public boolean checkFirsName(Users users) {
		
	if(users.getFirstName().length() >=2 && !users.getFirstName().isEmpty()) {
		System.out.println("Ad : UYGUN");
		return true;
		
	}else {
		System.out.println("Ad : Eksik karakter girildi");
		return false;
		
		
	}
		
		
		
	}

	@Override
	public boolean checkLastName(Users users) {
		
		if(users.getLastName().length()>= 2 && !users.getLastName().isEmpty()) {
			
			System.out.println("Soyad : UYGUNDUR");
			return true;
			
		}else {
			System.out.println("Soyad : Eksik karakter girildi.");
			return false;
		}
		
		
		
		
	}

}
