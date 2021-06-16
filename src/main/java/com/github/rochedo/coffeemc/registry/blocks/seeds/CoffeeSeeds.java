package com.github.rochedo.coffeemc.registry.blocks.seeds;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class CoffeeSeeds extends CropBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D);
    protected CoffeeSeeds(Settings settings) {
        super(FabricBlockSettings.copyOf(Blocks.WHEAT));
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }


}
