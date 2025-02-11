package com.mealplangenerator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class MealPlanGeneratorTest {
    private MealPlanGenerator generator;
    private VegetarianMeal vegetarianMeal;
    private VeganMeal veganMeal;
    private KetoMeal ketoMeal;
    private HighProteinMeal highProteinMeal;

    @BeforeEach
    void setUp() {
        generator = new MealPlanGenerator();
        vegetarianMeal = new VegetarianMeal();
        veganMeal = new VeganMeal();
        ketoMeal = new KetoMeal();
        highProteinMeal = new HighProteinMeal();
    }

    @Test
    void testAddValidMeals() {
        Meal<VegetarianMeal> vegMeal = new Meal<>("Paneer Tikka", vegetarianMeal);
        Meal<VeganMeal> veganSalad = new Meal<>("Vegan Salad", veganMeal);

        generator.addMeal(vegMeal);
        generator.addMeal(veganSalad);

        List<Meal<? extends MealPlan>> meals = generator.getMeals();
        assertEquals(2, meals.size());
        assertEquals("Paneer Tikka", meals.get(0).getMealName());
        assertEquals("Vegan Salad", meals.get(1).getMealName());
    }

    @Test
    void testGenerateMealPlan_ValidMeal() {
        generator.generateMealPlan(vegetarianMeal);
        assertTrue(vegetarianMeal.isValidMeal(), "Meal should be valid");
    }

    @Test
    void testGenerateMealPlan_InvalidMeal() {
        MealPlan invalidMeal = new MealPlan() {
            @Override
            public boolean isValidMeal() {
                return false;
            }

            @Override
            public String getMealType() {
                return "Invalid Meal";
            }
        };

        generator.generateMealPlan(invalidMeal);
        assertFalse(invalidMeal.isValidMeal(), "Meal should be invalid");
    }
}