package io.ace.microservices.itemcatalogservice.repository;


import io.ace.microservices.itemcatalogservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {
}
