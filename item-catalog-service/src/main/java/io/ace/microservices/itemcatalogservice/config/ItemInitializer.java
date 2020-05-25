package io.ace.microservices.itemcatalogservice.config;

import io.ace.microservices.itemcatalogservice.entity.Item;
import io.ace.microservices.itemcatalogservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ItemInitializer implements CommandLineRunner {


    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {
        if (itemRepository.count() == 0) {
            Stream.of("Beer", "Coke", "Water", "Vodka", "Fanta")
                    .forEach(name -> itemRepository.save(new Item(name)));
            itemRepository.findAll().forEach(System.out::println);
        }
    }
}
