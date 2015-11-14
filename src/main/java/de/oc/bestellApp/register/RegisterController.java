package de.oc.bestellApp.register;

import de.oc.bestellApp.controller.UserManager;
import de.oc.bestellApp.user.User;
import org.apache.log4j.Logger;

import javax.faces.bean.SessionScoped;

/**
 * Created by stefanbilleb on 14.11.15.
 */
@SessionScoped
public class RegisterController {


    private User newUser;

    private Logger logger = Logger.getLogger(RegisterController.class);

    public RegisterController() {
        logger.debug("Created RegisterController");
        newUser = new User();
        if(newUser != null)
            logger.debug("Name: " + newUser.getName()
                    +"\nEmail: " + newUser.getEmail());

    }

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public void registerUser() {
        logger.debug("registerUser called"
                + "\n Name: " + newUser.getName()
                +"\nEmail: " + newUser.getEmail());

        UserManager um = new UserManager();
        um.addUser(newUser);
        logger.debug("registerUser end");
    }
}
