package eCommercee.business.concretes;

import java.util.ArrayList;

import eCommercee.business.abstracts.EmailCheckService;
import eCommercee.entities.concretes.Users;

public class EmailCheckManager implements EmailCheckService {
	
	ArrayList<String> verifiedEmails = new ArrayList<>();

	@Override
	public boolean checkVerifiedList(Users user) {
		if (verifiedEmails.contains(user.geteMail())) {
			System.out.println(user.geteMail()+" daha önce kullanýlmýþtýr.");
			return false;
		}
		else {
		
			System.out.println(user.geteMail()+" : Kayýt Baþarýlý.");
			return true;
		}
		
		
		
	}

	@Override
	public void sentEmailList(Users user) {
		System.out.println(user.geteMail()+"Doðrulama linki gönderildi.");
		
		
	}

	@Override
	public void addToVerifiedList(Users user) {
		verifiedEmails.add(user.geteMail());
		System.out.println(verifiedEmails);
		System.out.println("Kullanýcý aktivasyonu yapýlmýþtýr");
		
		
	}

}
