package training.spring.annotation;

import org.springframework.validation.*;

public class UserValidator implements Validator {

	public boolean supports(Class someclass) {
		return someclass.equals(User.class);
	}

	public void validate(Object obj, Errors errors) {
		User user = (User) obj;
		if(user.getUsername().length() < 3)
			errors.rejectValue("username","username.invalid","Please enter a valid username");
		if(user.getPassword().length() < 6)
			errors.rejectValue("password","password.invalid","Please enter a valid password");
	}
};