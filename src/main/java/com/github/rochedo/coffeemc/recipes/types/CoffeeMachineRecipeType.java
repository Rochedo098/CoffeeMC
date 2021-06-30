package com.github.rochedo.coffeemc.recipes.types;

import com.github.rochedo.coffeemc.recipes.CoffeeMachineRecipe;
import net.minecraft.recipe.RecipeType;

public class CoffeeMachineRecipeType implements RecipeType<CoffeeMachineRecipe> {
    private CoffeeMachineRecipeType() {}
    public static final CoffeeMachineRecipeType INSTANCE = new CoffeeMachineRecipeType();
    public static final String ID = "coffee_machine_recipe";
}
