package com.github.rochedo.coffeemc.registry;

import com.github.rochedo.coffeemc.CoffeeMC;
import com.github.rochedo.coffeemc.registry.blocks.machines.CoffeeMachineBlock;
import com.github.rochedo.coffeemc.registry.blocks.machines.CrusherCoffeeBlock;
import com.github.rochedo.coffeemc.registry.blocks.seeds.CoffeeSeedsBase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoffeeBlocks {
    public static final Block COFFEE_MACHINE = new CoffeeMachineBlock();
    public static final Block CRUSHER_COFFEE = new CrusherCoffeeBlock();

    public static final CropBlock COFFEE_SEEDS = new CoffeeSeedsBase(FabricBlockSettings.copyOf(Blocks.WHEAT));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(CoffeeMC.MODID, "coffee_machine"), COFFEE_MACHINE);
        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "coffee_machine"), new BlockItem(COFFEE_MACHINE, new FabricItemSettings().group(CoffeeMC.COFFEE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(CoffeeMC.MODID,  "crusher_coffee_machine"), CRUSHER_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "crusher_coffee_machine"), new BlockItem(CRUSHER_COFFEE, new FabricItemSettings().group(CoffeeMC.COFFEE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(CoffeeMC.MODID, "coffee_seeds"), COFFEE_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(CoffeeMC.MODID, "coffee_seeds"), new BlockItem(COFFEE_SEEDS, new FabricItemSettings().group(CoffeeMC.COFFEE_GROUP)));
    }
}
