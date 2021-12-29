package eCommercee.business.concretes;

import eCommercee.business.abstracts.RegisterService;
import eCommercee.business.abstracts.VerificationService;
import eCommercee.dataAccess.abstracts.UsersDao;
import eCommercee.entities.concretes.Users;

public class RegisterManager implements RegisterService {
	private EmailCheckManager emailCheckManager;
	public RegisterManager(EmailCheckManager emailCheckManager, VerificationService verificationService,
			UsersDao usersDao) {
		super();
		this.emailCheckManager = emailCheckManager;
		this.verificationService = verificationService;
		this.usersDao = usersDao;
	}

	private VerificationService verificationService;
	private UsersDao usersDao;

	@Override
	public void save(Users users) {
		if (verificationService.checkFirsName(users) && verificationService.checkLastName(users)&&
				verificationService.checkPassword(users)&&emailCheckManager.checkVerifiedList(users)) {
			emailCheckManager.addToVerifiedList(users);
			emailCheckManager.sentEmailList(users);
			usersDao.add(users);
			System.out.println("Kullanýcý kaydý baþarýlý.++++++++");
		}else {
			System.out.println("Kullanýcý kaydý baþarýsýz.-------");
		}
		
		
	}

	@Override
	public void login(Users users) {
		
		
	}

}
