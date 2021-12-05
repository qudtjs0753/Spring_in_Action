package com.example.tacocloud.data;

import com.example.tacocloud.Ingredient;

/**
 * @Author: kbs
 */
public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient save(Ingredient ingredient);
}
