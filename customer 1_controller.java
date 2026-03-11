package klu.SpringBoot_MVC_Annotations;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class Customer1_Controller {

    // list to store customers
    List<Customer1> customers = new ArrayList<Customer1>();

    //add customer
    @PostMapping("/addcustomers")
    public String getcustomers(@RequestBody Customer1 cust) {
        customers.add(cust);
        return "Customer added successfully";
    }

    // view customers
    @GetMapping("/displaycustomer")
     public List<Customer1> viewcustomer(){
    	 return customers;
     }

}


