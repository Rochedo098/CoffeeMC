package com.github.rochedo.coffeemc.registry.blocks.seeds;

import net.minecraft.block.CropBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;

public class CoffeeSeedsBase extends CropBlock {
    private Item item;

    public CoffeeSeedsBase(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return item;
    }
}
