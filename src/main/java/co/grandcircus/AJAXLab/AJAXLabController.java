package co.grandcircus.AJAXLab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AJAXLabController {

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
}
