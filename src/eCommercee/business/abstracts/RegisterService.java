package eCommercee.business.abstracts;

import eCommercee.entities.concretes.Users;

public interface RegisterService {
	void save(Users user);
	void login(Users users);

}
