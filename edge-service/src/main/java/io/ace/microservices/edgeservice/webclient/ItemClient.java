package io.ace.microservices.edgeservice.webclient;


import io.ace.microservices.edgeservice.model.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("item-catalog-service")
public interface ItemClient {

    @RequestMapping("/items")
    CollectionModel<Item> readItems();

}
