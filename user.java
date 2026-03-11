package klu.SpringBoot_MVC_Annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class User {
	
@GetMapping("/welcome")
//@ResponseBody
	public String display() {
		return "Welcome Controller from display1 method";
	}
    @GetMapping("/d2")
   //@ResponseBody
    public String display2() {
    	return "Controller from display2 method";
    }
    @GetMapping("/d3")
    public int display3() {
    	return 10;
    }
// with parameter name @RequestParam
    @GetMapping("/d9")
    public int display9(@RequestParam("id") int uid) {
    	return uid;
    }
    
       //without parameter name @pathVariable
    
    @GetMapping("/d10")
    public int display10(@PathVariable("eid")int uid1 ) {
    	return uid1;
    }
}
    