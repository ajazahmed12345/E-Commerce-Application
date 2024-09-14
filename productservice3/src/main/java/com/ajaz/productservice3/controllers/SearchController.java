package com.ajaz.productservice3.controllers;

import com.ajaz.productservice3.dtos.GenericProductDto;
import com.ajaz.productservice3.dtos.SearchRequestDto;
import com.ajaz.productservice3.services.SearchService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    private SearchService searchService;

    public SearchController(SearchService searchService){
        this.searchService = searchService;
    }


    @PostMapping
    public Page<GenericProductDto> getAllProducts(@RequestBody SearchRequestDto searchRequestDto){
        return searchService.getAllProducts(searchRequestDto.getQuery(), searchRequestDto.getPageNumber(), searchRequestDto.getSizeOfEachPage(), searchRequestDto.getSortParameters());
    }


}
