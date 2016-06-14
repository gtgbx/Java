package test.spring.controller;

import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;


@Controller
public class AnnotationTestController{

	@RequestMapping(value= "/annotation")
	public ModelAndView annotation(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		Locale locale = LocaleContextHolder.getLocale();
		RequestContext requestContext = new RequestContext(request);
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Annotation===" + requestContext.getMessage("msg.test"));
		mv.setViewName("annotation");
		return mv;
	}
	
	@RequestMapping(value = "/annotation3")
	public void testParam(PrintWriter out) {
		out.println("PrintWriter");
	}
}