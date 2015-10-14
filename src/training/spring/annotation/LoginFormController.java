package training.spring.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginFormController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String onSubmit(@RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		
		model.addAttribute("username", username);
		
		
		if (username.equals("majrul") && password.equals("majrul123"))
			return "success";
		else
			return "failure";

	}
}
