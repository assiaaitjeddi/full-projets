package ma.enset.billingservice.feign;

import ma.enset.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//TJRS LES NOMS DES SERVICES EN MAJUSCULE

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {


    @GetMapping(path = "/customers/{id}")
    public Customer getCustomerById(@PathVariable(name = "id") Long id);

}
