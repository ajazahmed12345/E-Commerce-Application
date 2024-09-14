package com.ajaz.productservice3.dtos;

import com.ajaz.productservice3.models.Product;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Getter
@Setter
public class CategoryDto {
    private String name;

    @Fetch(FetchMode.SUBSELECT)
    private List<ProductDto> productDtos;
}
