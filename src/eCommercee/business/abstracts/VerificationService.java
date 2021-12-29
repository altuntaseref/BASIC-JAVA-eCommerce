package eCommercee.business.abstracts;

import eCommercee.entities.concretes.Users;

public interface VerificationService {
	boolean checkPassword(Users users);
	boolean checkEmail(Users users);
	boolean checkFirsName(Users users);
	boolean checkLastName(Users users);

}
