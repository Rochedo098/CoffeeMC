package com.github.rochedo.coffeemc.registry;

import com.github.rochedo.coffeemc.CoffeeMC;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoffeeItems {
    public static final BucketItem CUP = new BucketItem(Fluids.EMPTY, new FabricItemSettings().group(CoffeeMC.COFFEE_GROUP));
    public static final MilkBucketItem COFFEE_CUP = new MilkBucketItem(new FabricItemSettings().maxCount(1).food(CoffeeFoodComponents.COFFEE_CUP_FOOD));
    public static final MilkBucketItem COFFEE_MILK_CUP = new MilkBucketItem(new FabricItemSettings().maxCount(1).food(CoffeeFoodComponents.COFFEE_MILK_CUP_FOOD));

    public static final Item COFFEE_BEANS = new Item(new FabricItemSettings().group(CoffeeMC.COFFEE_GROUP));
    public static final Item CRUSHED_COFFEE_BEANS = new Item(new FabricItemSettings().group(CoffeeMC.COFFEE_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "cup"), CUP);
        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "coffee_cup"), COFFEE_CUP);
        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "coffee_milk_cup"), COFFEE_MILK_CUP);

        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "coffee_beans"), COFFEE_BEANS);
        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "crushed_coffee_beans"), CRUSHED_COFFEE_BEANS);
    }
}
