package com.github.rochedo.coffeemc.registry.blocks.seeds;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;

public class CoffeeSeedsBase extends CropBlock {
    private Item item;

    public CoffeeSeedsBase() {
        super(FabricBlockSettings.copy(Blocks.WHEAT));
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return item;
    }
}
