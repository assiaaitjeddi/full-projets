package ma.enset.billingservice.feign;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import ma.enset.billingservice.model.Customer;
import ma.enset.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

//TJRS LES NOMS DES SERVICES EN MAJUSCULE

@FeignClient(name = "INVENTORY-SERVICE")
public interface ProductItemRestClient {
    @GetMapping(path = "/products")
    PagedModel<Product> pageProducts(@RequestParam(name="page") int page,
                                     @RequestParam(name="size") int size);

    @GetMapping(path = "/products/{id}")
    Product getProductById(@PathVariable Long id);

}
