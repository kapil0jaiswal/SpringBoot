package com.ven.usersecurityservice.transformer;

import com.ven.usersecurityservice.domain.Ingredients;
import com.ven.usersecurityservice.presentation.IngredientsVo;

public class IngredientTransformer {

	
	public IngredientsVo tranformToIngredientVo(Ingredients ingredient){
		
		IngredientsVo ingredientsVo = new IngredientsVo();
		ingredientsVo.setIngredientId(ingredient.getIngredientId());
		ingredientsVo.setIngredientsName(ingredient.getIngredientsName());
		ingredientsVo.setIngredientsDesc(ingredient.getIngredientsDesc());
		ingredientsVo.setAvailableQuantiy(ingredient.getAvailableQuantiy());
		
		return ingredientsVo;
		
		
	}
	
public Ingredients tranformToIngredients(IngredientsVo ingredientsVo){
		
		Ingredients ingredients = new Ingredients();
		ingredients.setIngredientId(ingredientsVo.getIngredientId());
		ingredients.setIngredientsName(ingredientsVo.getIngredientsName());
		ingredients.setIngredientsDesc(ingredientsVo.getIngredientsDesc());
		ingredients.setAvailableQuantiy(ingredientsVo.getAvailableQuantiy());
		
		return ingredients;
		
		
	}
	
	
}
