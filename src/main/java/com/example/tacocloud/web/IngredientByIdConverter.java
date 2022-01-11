package com.example.tacocloud.web;

import com.example.tacocloud.Ingredient;
import com.example.tacocloud.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Author: kbs
 */

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepository){
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id){
        Optional<Ingredient> optionalIngredient = ingredientRepository.findById(id);
        return optionalIngredient.isPresent() ?
                optionalIngredient.get() : null;
    }
}
