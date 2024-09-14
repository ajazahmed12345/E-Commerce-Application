package com.ajaz.productservice3.repositories;

import com.ajaz.productservice3.models.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;

public interface ProductElasticSearchRepository extends ElasticsearchRepository<Product, UUID> {


    Iterable<Product> findAllByTitleContaining(String title);


}
