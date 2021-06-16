package com.github.rochedo.coffeemc.registry;

import com.github.rochedo.coffeemc.CoffeeMC;
import com.github.rochedo.coffeemc.registry.blocks.machines.CoffeeMachineBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoffeeBlocks {
    public static final Block COFFEE_MACHINE = new CoffeeMachineBlock();

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(CoffeeMC.MODID, "coffee_machine"), COFFEE_MACHINE);
        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "coffee_machine"), new BlockItem(COFFEE_MACHINE, new FabricItemSettings().group(CoffeeMC.COFFEE_GROUP)));
    }
}
