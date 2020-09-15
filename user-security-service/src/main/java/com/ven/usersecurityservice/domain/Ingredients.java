package com.ven.usersecurityservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ingredientId;
	
	@Column(name="ingredients_name")
	private String ingredientsName ;
	
	@Column(name="ingredients_desc")
	private String ingredientsDesc ;
	
	@Column(name="available_quantiy")
	private String availableQuantiy ;
	
	/**
	 * 
	 */
	public Ingredients() {
		super();
	}
	/**
	 * @param ingredientsName
	 * @param ingredientsDesc
	 * @param availableQuantiy
	 */
	public Ingredients(String ingredientsName, String ingredientsDesc, String availableQuantiy) {
		super();
		this.ingredientsName = ingredientsName;
		this.ingredientsDesc = ingredientsDesc;
		this.availableQuantiy = availableQuantiy;
	}
	/**
	 * @return the ingredientId
	 */
	public Long getIngredientId() {
		return ingredientId;
	}
	/**
	 * @param ingredientId the ingredientId to set
	 */
	public void setIngredientId(Long ingredientId) {
		this.ingredientId = ingredientId;
	}
	/**
	 * @return the ingredientsName
	 */
	public String getIngredientsName() {
		return ingredientsName;
	}
	/**
	 * @param ingredientsName the ingredientsName to set
	 */
	public void setIngredientsName(String ingredientsName) {
		this.ingredientsName = ingredientsName;
	}
	/**
	 * @return the ingredientsDesc
	 */
	public String getIngredientsDesc() {
		return ingredientsDesc;
	}
	/**
	 * @param ingredientsDesc the ingredientsDesc to set
	 */
	public void setIngredientsDesc(String ingredientsDesc) {
		this.ingredientsDesc = ingredientsDesc;
	}
	/**
	 * @return the availableQuantiy
	 */
	public String getAvailableQuantiy() {
		return availableQuantiy;
	}
	/**
	 * @param availableQuantiy the availableQuantiy to set
	 */
	public void setAvailableQuantiy(String availableQuantiy) {
		this.availableQuantiy = availableQuantiy;
	} 
	
}
