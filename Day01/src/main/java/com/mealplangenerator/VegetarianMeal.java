package com.mealplangenerator;

public class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian Meal";
    }

    @Override
    public boolean isValidMeal() {
        return true;
    }
}