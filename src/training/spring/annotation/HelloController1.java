package training.spring.annotation;

import org.springframework.web.servlet.ModelAndView;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {

	@RequestMapping("/helloWorld1")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String now = new java.util.Date().toString();
		return new ModelAndView("hello", "now", now);
	}
}