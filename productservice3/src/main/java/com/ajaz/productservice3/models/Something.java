package com.ajaz.productservice3.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Something extends BaseModel {
    private String someName;
}
