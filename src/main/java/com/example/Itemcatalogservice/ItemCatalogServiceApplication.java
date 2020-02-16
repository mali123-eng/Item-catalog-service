package com.example.Itemcatalogservice;

import com.example.Itemcatalogservice.model.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

@EnableDiscoveryClient
@SpringBootApplication
public class ItemCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemCatalogServiceApplication.class, args);
	}

}

@RepositoryRestResource
interface ItemRepository extends JpaRepository<Item, Long> {
}

@Component
class ItemInitializer implements CommandLineRunner {

	private final ItemRepository itemRepository;

	ItemInitializer(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		itemRepository.findAll().forEach(System.out::println);
	}
}