package com.ajaz.productservice3.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchRequestDto {
    private String query;
    private int pageNumber;
    private int sizeOfEachPage;
    private List<SortParameters> sortParameters;
}
