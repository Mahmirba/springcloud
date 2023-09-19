package com.example.producer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductDto implements Serializable {
    private String name;
    private Integer age;
    private Integer id;
}
