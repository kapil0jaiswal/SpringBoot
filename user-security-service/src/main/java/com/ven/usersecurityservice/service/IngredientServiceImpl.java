package com.ven.usersecurityservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ven.usersecurityservice.presentation.IngredientsVo;

@Component
public class IngredientServiceImpl implements IngredientService {

	@Override
	public List<IngredientsVo> findAll() {
		ArrayList<IngredientsVo> ingredients = new ArrayList<>();
		ingredients.add(new IngredientsVo(1001L, "ingredientsName 1","ingredient Desc ", "pounds"));
		ingredients.add(new IngredientsVo(1002L, "ingredientsName 2","ingredient Desc ", "gallon"));
		ingredients.add(new IngredientsVo(1003L, "ingredientsName 3","ingredient Desc ", "pounds"));
		ingredients.add(new IngredientsVo(1004L, "ingredientsName 4","ingredient Desc ", "gallon"));
		ingredients.add(new IngredientsVo(1005L, "ingredientsName 5","ingredient Desc ", "pounds"));
		return ingredients;
	}

}
