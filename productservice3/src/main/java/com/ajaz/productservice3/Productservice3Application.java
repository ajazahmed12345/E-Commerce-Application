package com.ajaz.productservice3;

import com.ajaz.productservice3.inheritanceDemo.singleTable.Mentor;
import com.ajaz.productservice3.inheritanceDemo.singleTable.MentorRepository;
import com.ajaz.productservice3.models.Category;
import com.ajaz.productservice3.models.Price;
import com.ajaz.productservice3.models.Product;
import com.ajaz.productservice3.repositories.CategoryRepository;
import com.ajaz.productservice3.repositories.PriceRepository;
import com.ajaz.productservice3.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication(exclude = {ElasticsearchDataAutoConfiguration.class})
//@EnableScheduling
public class Productservice3Application {

//    private MentorRepository mentorRepository;
//    private ProductRepository productRepository;
//    private CategoryRepository categoryRepository;
//    private PriceRepository priceRepository;
//
//    public Productservice3Application(MentorRepository mentorRepository,
//                                      ProductRepository productRepository,
//                                      CategoryRepository categoryRepository,
//                                      PriceRepository priceRepository){
//        this.mentorRepository = mentorRepository;
//        this.productRepository = productRepository;
//        this.categoryRepository = categoryRepository;
//        this.priceRepository = priceRepository;
//    }

//    @Transactional
//    @Override
//    public void run(String... args) throws Exception {
//        Mentor mentor = new Mentor();
//        mentor.setName("Ajaz");
//        mentor.setEmail("aj@gmail.com");
//        mentor.setAverageRating(22.40);
//
//        mentorRepository.save(mentor);

//        Category category = new Category();
//        category.setName("accessories");
//
//        Price price = new Price();
//        price.setPrice(90000.00);
//        price.setCurrency("inr");
//
//        Product product = new Product();
//        product.setTitle("mobile");
//        product.setPrice(price);
//        product.setCategory(category);
//
//        productRepository.save(product);
//
//        productRepository.deleteById(UUID.fromString("b42b7d53-88c3-4752-9b9a-e8b4d8cd80b4"));

//        List<Product> products = productRepository.findAllByPrice_Currency("inr");
//
//        List<Product> prod2 = productRepository.findAllDistinctByPrice_Currency("inr");

//        List<Product> prod = productRepository.findAllByTitleEqualsOrderByPrice_Price("mobile");
//
//        List<Product> myProducts = productRepository.findByTitle("mobile");

//        Optional<Category> categoryOptional = categoryRepository.findById(UUID.fromString("5dc28c84-d577-4511-a852-26fdd180d69a"));
//
//        Category category = categoryOptional.get();
//
//        System.out.println(category);
//
//        Thread.sleep(1000);
//        List<Product> products = category.getProducts();


//    }

    public static void main(String[] args) {
        SpringApplication.run(Productservice3Application.class, args);
    }

}
