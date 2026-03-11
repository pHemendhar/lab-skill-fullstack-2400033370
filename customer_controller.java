package klu.SpringBoot_MVC_Annotations;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Customer_Controller {
	
	@GetMapping("/customer")
	
	public Customer getcustomer() {
		
		
		
		Customer c = new Customer("Hem","kurnool");
		return c;
	}

}
