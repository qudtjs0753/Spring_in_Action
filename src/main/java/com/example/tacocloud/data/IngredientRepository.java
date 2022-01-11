package com.example.tacocloud.data;

import com.example.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: kbs
 */
//CrudRepository에는 CRUD 연산을 위한 많은 메서드가 선언되어있음.
    //첫번째 매개변수는 repository에 저장되는 개체타입
    //두번째 매개변수는 개체 ID 속성 타입.
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
