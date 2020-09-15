/**
 * 
 */
package com.ven.usersecurityservice.service;

import java.util.List;

import com.ven.usersecurityservice.presentation.IngredientsVo;

/**
 * @author Kapil
 *
 */

public interface IngredientService {

	public List<IngredientsVo> findAll();
}
