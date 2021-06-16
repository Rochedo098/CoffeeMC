package com.github.rochedo.coffeemc.registry.blocks.entitys.machines;

import com.github.rochedo.coffeemc.api.ImplementedInventory;
import com.github.rochedo.coffeemc.gui.CrusherCoffeeGUI;
import com.github.rochedo.coffeemc.registry.CoffeeGUIs;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class CrusherCoffeeEntity extends BlockEntity implements ImplementedInventory, NamedScreenHandlerFactory {
    static final int INVENTORY_SIZE = 8;
    DefaultedList<ItemStack> items = DefaultedList.ofSize(INVENTORY_SIZE, ItemStack.EMPTY);

    public CrusherCoffeeEntity(BlockPos pos, BlockState state) {
        super(CoffeeGUIs.CRUSHER_COFFEE_ENTITY, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Crusher Coffee");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new CrusherCoffeeGUI(CoffeeGUIs.CRUSHER_COFFEE_HANDLER_TYPE, syncId, inv, ScreenHandlerContext.create(world, pos));
    }
}
