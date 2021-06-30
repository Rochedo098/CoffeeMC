package com.github.rochedo.coffeemc.registry;

import com.github.rochedo.coffeemc.CoffeeMC;
import com.github.rochedo.coffeemc.recipes.CoffeeMachineRecipe;
import com.github.rochedo.coffeemc.recipes.serializers.CoffeeMachineRecipeSerializer;
import com.github.rochedo.coffeemc.recipes.types.CoffeeMachineRecipeType;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoffeeRecipes {
    public static RecipeType<CoffeeMachineRecipe> COFFEE_MACHINE_RECIPE_TYPE;

    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, CoffeeMachineRecipeSerializer.ID, CoffeeMachineRecipeSerializer.INSTANCE);
        COFFEE_MACHINE_RECIPE_TYPE = Registry.register(Registry.RECIPE_TYPE, new Identifier(CoffeeMC.MODID, CoffeeMachineRecipeType.ID), CoffeeMachineRecipeType.INSTANCE);
    }
}
