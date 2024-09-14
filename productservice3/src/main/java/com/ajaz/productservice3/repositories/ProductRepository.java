package com.ajaz.productservice3.repositories;

import com.ajaz.productservice3.models.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {


    Optional<Product> findByTitleEquals(String title);
    List<Product> findAllByTitleEqualsOrderByPrice_Price(String title);


    List<Product> findAllByPrice_Currency(String currency);


    List<Product> findAllDistinctByPrice_Currency(String currency);

    @Query(value = "select * from product where title = :title", nativeQuery = true)
    List<Product> findByTitle(String title);

    Page<Product> findAllByTitleContaining(String title, Pageable pageable);


}