package eCommercee.business.concretes;

import java.util.ArrayList;

import eCommercee.business.abstracts.EmailCheckService;
import eCommercee.entities.concretes.Users;

public class EmailCheckManager implements EmailCheckService {
	
	ArrayList<String> verifiedEmails = new ArrayList<>();

	@Override
	public boolean checkVerifiedList(Users user) {
		if (verifiedEmails.contains(user.geteMail())) {
			System.out.println(user.geteMail()+" daha �nce kullan�lm��t�r.");
			return false;
		}
		else {
		
			System.out.println(user.geteMail()+" : Kay�t Ba�ar�l�.");
			return true;
		}
		
		
		
	}

	@Override
	public void sentEmailList(Users user) {
		System.out.println(user.geteMail()+"Do�rulama linki g�nderildi.");
		
		
	}

	@Override
	public void addToVerifiedList(Users user) {
		verifiedEmails.add(user.geteMail());
		System.out.println(verifiedEmails);
		System.out.println("Kullan�c� aktivasyonu yap�lm��t�r");
		
		
	}

}
