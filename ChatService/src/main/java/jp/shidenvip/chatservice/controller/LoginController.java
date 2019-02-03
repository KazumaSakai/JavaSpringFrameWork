package jp.shidenvip.chatservice.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.shidenvip.chatservice.form.LoginForm;
import jp.shidenvip.chatservice.model.UserModel;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	HttpSession session;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/User/Login", method = RequestMethod.GET)
	public String loginGet(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("root", "..");
		
		
		return "login";
	}
	
	@RequestMapping(value = "/User/Login", method = RequestMethod.POST)
	public String loginPost(@ModelAttribute LoginForm loginForm, Locale locale, Model model) {
		logger.info("Login Post", locale);
		
		model.addAttribute("loginid", loginForm.getLoginId());
		model.addAttribute("password", loginForm.getPassword());
		
		return "redirect:/";
	}
	
}
