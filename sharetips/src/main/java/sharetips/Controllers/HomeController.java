package sharetips.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class HomeController {
	
	@RequestMapping("/home")
	public String goHome(){
		return "hello";
	}
}
