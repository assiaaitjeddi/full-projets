package ma.enset.customerservice;

import ma.enset.customerservice.entities.Customer;
import ma.enset.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository,
                            RepositoryRestConfiguration restConfiguration ){

        restConfiguration.exposeIdsFor(Customer.class);
        return args -> {
            customerRepository.save(new Customer(null, "Mohammed","mohammed22@gmail.com"));
            customerRepository.save(new Customer(null, "ASSIA","assiaait22@gmail.com"));
            customerRepository.save(new Customer(null, "Anas","Anas_1234@gmail.com"));
            customerRepository.save(new Customer(null, "Chaimae","chaimaeelfakir19@gmail.com"));
            customerRepository.save(new Customer(null, "HASSAN","Hassan1981@gmail.com"));

            customerRepository.findAll().forEach(c->{
               System.out.println(c.toString());
            });


        };
    }

}
