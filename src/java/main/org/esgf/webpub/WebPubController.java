package org.esgf.webpub;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebPubController {

	
	private static final String PUBLISHER_OPEN_ID = "openid";
	
	@RequestMapping(method=RequestMethod.POST, value="/new/{open_id}")
	public ModelAndView getUserPubNew(@PathVariable String open_id) {

		System.out.println("In getUserPubNew");
		
		String publisher_openid = open_id;
		if(publisher_openid == null) {
			publisher_openid = "open_id";
		}
		
		//method to determine if the given openid is a valid publisher 
		Map<String,Object> model = new HashMap<String,Object>();

		model.put(PUBLISHER_OPEN_ID, publisher_openid);
		

		return new ModelAndView("EZPubNew",model);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/new/{open_id}")
	public ModelAndView getUserPubNewGET(@PathVariable String open_id) {

		System.out.println("In getUserPubNew");
		
		String publisher_openid = open_id;
		if(publisher_openid == null) {
			publisher_openid = "open_id";
		}
		
		//method to determine if the given openid is a valid publisher 
		Map<String,Object> model = new HashMap<String,Object>();

		model.put(PUBLISHER_OPEN_ID, publisher_openid);
		

		return new ModelAndView("EZPubNew",model);
	}

	@RequestMapping(method=RequestMethod.GET, value="/home/{open_id}")
	public ModelAndView getUserPubHome(@PathVariable String open_id) {

		System.out.println("In getUserPubHome");
		
		
		String publisher_openid = open_id;
		if(publisher_openid == null) {
			publisher_openid = "open_id";
		}
		
		//method to determine if the given openid is a valid publisher 
		
		

		Map<String,Object> model = new HashMap<String,Object>();

		model.put(PUBLISHER_OPEN_ID, publisher_openid);
		
		
		return new ModelAndView("EZPubHome",model);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/metadata/{open_id}")
	public ModelAndView getMetadataPubHome(@PathVariable String open_id) {
		System.out.println("In getDefaultPubHome");
		
		
		String publisher_openid = open_id;
		if(publisher_openid == null) {
			publisher_openid = "open_id";
		}
		
		//method to determine if the given openid is a valid publisher 
		

		Map<String,Object> model = new HashMap<String,Object>();

		model.put(PUBLISHER_OPEN_ID, publisher_openid);
		
		
		return new ModelAndView("Metadata",model);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/default/{open_id}")
	public ModelAndView getDefaultPubHome(@PathVariable String open_id) {
		System.out.println("In getDefaultPubHome");
		
		
		String publisher_openid = open_id;
		if(publisher_openid == null) {
			publisher_openid = "open_id";
		}
		
		//method to determine if the given openid is a valid publisher 
		
		

		Map<String,Object> model = new HashMap<String,Object>();

		model.put(PUBLISHER_OPEN_ID, publisher_openid);
		
		
		return new ModelAndView("EZPubDefault",model);
		
	}
}
