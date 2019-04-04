package test_jenkins.main;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc

public class AppController {

	//login
	@RequestMapping("/")
    public String index(HttpSession session,
    		Model model,
    		@RequestParam(value = "logout",	required = false) String logout){
		
		if (logout != null) {
			SecurityContextHolder.clearContext();
			session.invalidate();
			
			return "redirect:login";
		}

		
       // System.out.println("");
        return "redirect:ldap/user/edit";
    }

}
