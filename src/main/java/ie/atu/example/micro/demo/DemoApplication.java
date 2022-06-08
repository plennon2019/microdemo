package ie.atu.example.micro.demo;

import ie.atu.example.micro.demo.ie.atu.example.micro.demo.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public Customer getCustomer()
	{
		return new Customer("Paul", 1L);
	}

}
