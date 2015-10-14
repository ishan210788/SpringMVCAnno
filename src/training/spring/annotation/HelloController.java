package training.spring.annotation;


import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/helloWorld")
	public String handleMyRequest1(Map<String, Object> model) {
		String now = new java.util.Date().toString();
		model.put("now", now);
		return "hello";
	}
};