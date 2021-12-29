package eCommercee;

import eCommercee.business.concretes.EmailCheckManager;
import eCommercee.business.concretes.RegisterManager;
import eCommercee.business.concretes.UsersCheckManager;
import eCommercee.dataAccess.concretes.HibernateUsersDao;
import eCommercee.entities.concretes.Users;

public class Main {

	public static void main(String[] args) {
		
		Users user1 = new Users("Þerafettin","Altuntaþ","seref.altuntas.ea@gmail.com","123456");
		Users user2 = new Users("Ali","Küçük","alikucukea@gmail.com","1234256");
		Users user3 = new Users("Mehmet","Yýldýz","mehmetyýldýzea@gmail.com","21");
		Users user4 = new Users("Mahmut","Güney","mahmutgüny<ea@gmail.com","1241245");
		Users user5 = new Users("Buðra","Taþ","BUÐRATAÞ@gmail.com","123123456");
		Users user6 = new Users("Kaan","Atýlgan","kkasdasgfasdasfasdsag@gmail.com","12sq1241");
		
		RegisterManager registerManager =new RegisterManager(new EmailCheckManager(), 
				new UsersCheckManager(), new HibernateUsersDao());
		
		
		registerManager.save(user1);
		registerManager.save(user2);
		registerManager.save(user3);
		registerManager.save(user4);
		registerManager.save(user5);
		registerManager.save(user6);
	}

}
