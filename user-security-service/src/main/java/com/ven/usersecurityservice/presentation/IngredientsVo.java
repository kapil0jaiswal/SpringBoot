package com.ven.usersecurityservice.presentation;

public class IngredientsVo {
	private Long ingredientId;
	private String ingredientsName ;
	private String ingredientsDesc ;
	private String availableQuantiy ;
	
	
	//empty constructor
	public IngredientsVo() {}
	
	/**
	 * @param ingredientId
	 * @param ingredientsName
	 * @param ingredientsDesc
	 * @param availableQuantiy
	 */
	public IngredientsVo(Long ingredientId, String ingredientsName, String ingredientsDesc, String availableQuantiy) {
		super();
		this.ingredientId = ingredientId;
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
