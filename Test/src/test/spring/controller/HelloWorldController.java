package test.spring.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.support.RequestContext;

public class HelloWorldController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Locale locale = LocaleContextHolder.getLocale();
		RequestContext requestContext = new RequestContext(request);
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World!" + locale.getLanguage() + "===" + requestContext.getMessage("msg.test"));
		mv.setViewName("hello");
		return mv;
	}
}