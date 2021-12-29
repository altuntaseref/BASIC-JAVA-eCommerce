package eCommercee.dataAccess.concretes;

import eCommercee.dataAccess.abstracts.UsersDao;
import eCommercee.entities.concretes.Users;

public class HibernateUsersDao implements UsersDao {

	@Override
	public void add(Users users) {
		System.out.println("Database loglandý :"+users.getFirstName()+" "+users.getLastName());
		
	}

}
