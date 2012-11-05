package org.sixthcolumn.scinet;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

	private static final String USER_ID= "user_id";
	
	@RequestMapping(method=RequestMethod.GET, value="/home")
	public ModelAndView getSciNetHome(final HttpServletRequest request) {

		System.out.println("In getSciNetHome");

		Map<String,Object> model = new HashMap<String,Object>();

		model.put(USER_ID, "user_id");
		
		
		return new ModelAndView("SciHome",model);
		
	}
}
