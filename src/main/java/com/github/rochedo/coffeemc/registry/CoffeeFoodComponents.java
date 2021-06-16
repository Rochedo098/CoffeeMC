package com.github.rochedo.coffeemc.registry;

import net.minecraft.item.FoodComponent;

public class CoffeeFoodComponents {
    private static final FoodComponent.Builder COFFEE_CUP_BUILDER = new FoodComponent.Builder().hunger(5).saturationModifier(0.5F);
    public static final FoodComponent COFFEE_CUP_FOOD = COFFEE_CUP_BUILDER.build();

    private static final FoodComponent.Builder COFFEE_MILK_CUP_BUILDER = new FoodComponent.Builder().hunger(6).saturationModifier(0.4F);
    public static final FoodComponent COFFEE_MILK_CUP_FOOD = COFFEE_MILK_CUP_BUILDER.build();
}
