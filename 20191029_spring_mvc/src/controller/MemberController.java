package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping("test.do")
	public ModelAndView dummy() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", service.getData());
		mav.setViewName("test");
		return mav;
	}
}
