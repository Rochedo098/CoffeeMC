package com.github.rochedo.coffeemc.registry.items;

import com.github.rochedo.coffeemc.CoffeeMC;
import com.github.rochedo.coffeemc.api.CoffeeQuality;
import com.github.rochedo.coffeemc.registry.CoffeeFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class CoffeeCup extends Item {
    public static Settings settings;
    public static CoffeeQuality quality;

    public CoffeeCup(CoffeeQuality coffeeQuality) {
        super(settings);
        quality = coffeeQuality;
    }

    public static void getQuality() {
        switch(quality) {
            case POOR:
                settings = new FabricItemSettings().food(CoffeeFoodComponents.POOR_COFFEE_CUP).group(CoffeeMC.COFFEE_GROUP);
            case GOOD:
                settings = new FabricItemSettings().food(CoffeeFoodComponents.GOOD_COFFEE_CUP).group(CoffeeMC.COFFEE_GROUP);
            case GREAT:
                settings = new FabricItemSettings().food(CoffeeFoodComponents.GREAT_COFFEE_CUP).group(CoffeeMC.COFFEE_GROUP);
            default:
                settings = new FabricItemSettings().food(CoffeeFoodComponents.POOR_COFFEE_CUP).group(CoffeeMC.COFFEE_GROUP);
        }
    }
}
