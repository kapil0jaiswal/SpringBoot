/**
 * 
 */
package com.ven.usersecurityservice.controller ;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ven.usersecurityservice.domain.Ingredients;
import com.ven.usersecurityservice.repository.IngredientRepository;

/**
 * @author Kapil
 *
 */
@RestController
public class IngredientsController {

	@Autowired
	IngredientRepository ingredientRepository ; 
	
	@GetMapping("/api/ingredients")
	public List<Ingredients> displayAll(){
		List<Ingredients> ingredients = ingredientRepository.findAll();
		return ingredients;
		
	}
	

	@GetMapping("/api/ingredients/{id}")
	public Optional<Ingredients> displayOne(@PathVariable Long id){
	Optional<Ingredients> ingredients = ingredientRepository.findById(id);
		return ingredients;
		
	}
	
	@DeleteMapping("/api/ingredients/{id}")
	public void deleteOne(@PathVariable Long id){
	 ingredientRepository.deleteById(id);
	
		
	}
	
	@PostMapping("/api/ingredients")
	public Ingredients saveIngredient(@RequestBody Ingredients ingredients) {
	
	Ingredients response = ingredientRepository.save(ingredients);
	return response ;
	
	}
	
	
    
}
