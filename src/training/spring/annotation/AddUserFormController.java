package training.spring.annotation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddUserFormController {

	@RequestMapping(value = "/AddUser", method = RequestMethod.POST)
	public String showForm(Model model) {
		model.addAttribute(new User());
		return "addUser";
	}
	
	@RequestMapping(value = "/ProcessUser",method = RequestMethod.GET)
	public String processForm(@Valid User user, BindingResult bindingResult, Model model) {
		System.out.println("in process user");
		System.out.println(bindingResult.hasErrors());
		System.out.println(user.getUsername() + "   " + user.getPassword());
		if (bindingResult.hasErrors()) {
			return "addUser";
		}
		else {
			// some logic to persist user
			model.addAttribute("user", user);
			return "success";
		}
	}
}
