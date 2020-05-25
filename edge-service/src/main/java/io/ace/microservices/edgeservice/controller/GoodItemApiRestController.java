package io.ace.microservices.edgeservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.ace.microservices.edgeservice.model.Item;
import io.ace.microservices.edgeservice.webclient.ItemClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@RestController
public class GoodItemApiRestController {
    @Autowired
    private ItemClient itemClient;


    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/top-brands")
    public Collection<Item> getGoodItems() {
        return itemClient
                .readItems()
                .getContent()
                .stream()
                .filter(this::isGood)
                .collect(Collectors.toList());
    }

    public Collection<Item> fallback() {
        return Collections.emptyList();
    }


    public boolean isGood(Item item) {
        if (item.getName().equalsIgnoreCase("Water") ||
                item.getName().equalsIgnoreCase("Coke")) {
            return true;
        }
        return false;
    }
}



