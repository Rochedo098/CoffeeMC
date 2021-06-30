package com.github.rochedo.coffeemc.recipes;

import com.github.rochedo.coffeemc.recipes.serializers.CoffeeMachineRecipeSerializer;
import com.github.rochedo.coffeemc.recipes.types.CoffeeMachineRecipeType;
import com.github.rochedo.coffeemc.registry.blocks.entitys.machines.CoffeeMachineEntity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class CoffeeMachineRecipe implements Recipe<CoffeeMachineEntity> {
    private final Identifier id;
    private final Ingredient input1;
    private final Ingredient input2;
    private final ItemStack output;
    private final double fuel;

    public CoffeeMachineRecipe(Identifier id, Ingredient input1, Ingredient input2, ItemStack output, double fuel) {
        this.id = id;
        this.input1 = input1;
        this.input2 = input2;
        this.output = output;
        this.fuel = fuel;
    }

    @Override
    public boolean matches(CoffeeMachineEntity inventory, World world) {
        return false;
    }

    @Override
    public ItemStack craft(CoffeeMachineEntity inventory) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getOutput() {
        return output.copy();
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return CoffeeMachineRecipeSerializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return CoffeeMachineRecipeType.INSTANCE;
    }

    public Ingredient getInput1() {
        return input1;
    }

    public Ingredient getInput2() {
        return input2;
    }

    public double getFuel() {
        return fuel;
    }

    public static class Format {
        public JsonElement input1;
        public JsonObject input2;
        public String output;
        public int outputAmount;
        public double fuel;
    }
}
