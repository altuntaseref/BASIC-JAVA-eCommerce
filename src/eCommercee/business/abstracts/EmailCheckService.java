package eCommercee.business.abstracts;

import eCommercee.entities.concretes.Users;

public interface EmailCheckService {
	
	boolean checkVerifiedList(Users user);
	void sentEmailList(Users user);
	void addToVerifiedList(Users user);

}
