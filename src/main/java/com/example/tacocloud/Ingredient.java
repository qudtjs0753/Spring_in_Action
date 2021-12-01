package com.example.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Author: kbs
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
