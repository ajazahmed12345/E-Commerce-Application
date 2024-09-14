package com.ajaz.productservice3.controllers;

import com.ajaz.productservice3.dtos.GetProductTitlesRequestDto;
import com.ajaz.productservice3.services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/titles")
    List<String> getProductTitles(@RequestBody GetProductTitlesRequestDto request){
        return categoryService.getProductTitles(request.getUuids());
    }





}
