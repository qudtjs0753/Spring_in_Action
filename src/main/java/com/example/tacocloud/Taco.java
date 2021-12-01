package com.example.tacocloud;

import lombok.Data;

import java.util.List;

/**
 * @Author: kbs
 */
@Data
public class Taco {
    private String name;
    private List<String> ingredients;

}
