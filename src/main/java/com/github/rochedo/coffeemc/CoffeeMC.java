package com.github.rochedo.coffeemc;

import com.github.rochedo.coffeemc.registry.CoffeeBlocks;
import com.github.rochedo.coffeemc.registry.CoffeeGUIs;
import com.github.rochedo.coffeemc.registry.CoffeeItems;
import com.github.rochedo.coffeemc.registry.CoffeeRecipes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class CoffeeMC implements ModInitializer {
    public static final String MODID = "coffees";

    public static final ItemGroup COFFEE_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MODID, "general_coffees"),
            () -> new ItemStack(Items.BUCKET)
    );

    @Override
    public void onInitialize() {
        CoffeeItems.register();
        CoffeeBlocks.register();
        CoffeeGUIs.register();
        CoffeeRecipes.register();
    }
}
