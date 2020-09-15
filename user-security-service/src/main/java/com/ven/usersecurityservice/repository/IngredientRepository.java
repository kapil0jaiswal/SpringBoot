/**
 * 
 */
package com.ven.usersecurityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ven.usersecurityservice.domain.Ingredients;


/**
 * @author Kapil
 *
 */
@Repository
public interface IngredientRepository extends JpaRepository<Ingredients,Long> {

}