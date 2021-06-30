package com.github.rochedo.coffeemc.registry;

import net.minecraft.item.FoodComponent;

public class CoffeeFoodComponents {
    // Coffees Quality
    private static final FoodComponent.Builder POOR_COFFEE_CUP_BUILDER = new FoodComponent.Builder().hunger(2).saturationModifier(0.5F);
    public static final FoodComponent POOR_COFFEE_CUP = POOR_COFFEE_CUP_BUILDER.build();

    private static final FoodComponent.Builder GOOD_COFFEE_CUP_BUILDER = new FoodComponent.Builder().hunger(2).saturationModifier(1.5F);
    public static final FoodComponent GOOD_COFFEE_CUP = GOOD_COFFEE_CUP_BUILDER.build();

    private static final FoodComponent.Builder GREAT_COFFEE_CUP_BUILDER = new FoodComponent.Builder().hunger(2).saturationModifier(3.0F);
    public static final FoodComponent GREAT_COFFEE_CUP = GREAT_COFFEE_CUP_BUILDER.build();

    // Coffee Variants
    private static final FoodComponent.Builder COFFEE_MILK_CUP_BUILDER = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F);
    public static final FoodComponent COFFEE_MILK_CUP_FOOD = COFFEE_MILK_CUP_BUILDER.build();
}
