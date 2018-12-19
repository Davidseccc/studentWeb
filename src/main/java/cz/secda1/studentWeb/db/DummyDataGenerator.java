package cz.secda1.studentWeb.db;

import cz.secda1.studentWeb.db.repositories.AdminRepository;
import cz.secda1.studentWeb.model.Admin;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class DummyDataGenerator {
    @Inject
    AdminRepository userService;
    @Inject
    cz.uhk.security.PasswordHash passwordHash;


    public void generateDummyData(){
		Admin user = new Admin("admin", passwordHash.getHashedPassword("topsecretpassword","admin"));
        userService.save(user);
    }
}
