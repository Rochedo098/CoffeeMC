package com.github.rochedo.coffeemc.recipes.serializers;


import com.github.rochedo.coffeemc.CoffeeMC;
import com.github.rochedo.coffeemc.recipes.CoffeeMachineRecipe;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoffeeMachineRecipeSerializer implements RecipeSerializer<CoffeeMachineRecipe> {
    private CoffeeMachineRecipeSerializer() {}
    public static final CoffeeMachineRecipeSerializer INSTANCE = new CoffeeMachineRecipeSerializer();
    public static final Identifier ID = new Identifier(CoffeeMC.MODID + ":coffee_machine_recipe");

    @Override
    public CoffeeMachineRecipe read(Identifier id, JsonObject json) {
        CoffeeMachineRecipe.Format format = new Gson().fromJson(json, CoffeeMachineRecipe.Format.class);
        Ingredient input1 = Ingredient.fromJson(format.input1);
        Ingredient input2 = Ingredient.fromJson(format.input2);
        Item outputItem = Registry.ITEM.getOrEmpty(new Identifier(format.output)).get();
        ItemStack output = new ItemStack(outputItem, format.outputAmount);

        return new CoffeeMachineRecipe(id, input1, input2, output, format.fuel);
    }

    @Override
    public void write(PacketByteBuf buf, CoffeeMachineRecipe recipe) {
        recipe.getInput1().write(buf);
        recipe.getInput2().write(buf);
        buf.writeItemStack(recipe.getOutput());
        buf.writeDouble(recipe.getFuel());
    }

    @Override
    public CoffeeMachineRecipe read(Identifier id, PacketByteBuf buf) {
        Ingredient input1 = Ingredient.fromPacket(buf);
        Ingredient input2 = Ingredient.fromPacket(buf);
        ItemStack output = buf.readItemStack();
        double fuel = buf.readDouble();

        return new CoffeeMachineRecipe(id, input1, input2, output, fuel);
    }
}
