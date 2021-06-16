package com.github.rochedo.coffeemc.registry;

import com.github.rochedo.coffeemc.CoffeeMC;
import com.github.rochedo.coffeemc.gui.CoffeeMachineGUI;
import com.github.rochedo.coffeemc.gui.CrusherCoffeeGUI;
import com.github.rochedo.coffeemc.registry.blocks.entitys.machines.CoffeeMachineEntity;
import com.github.rochedo.coffeemc.registry.blocks.entitys.machines.CrusherCoffeeEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoffeeGUIs {
    public static BlockEntityType<CoffeeMachineEntity> COFFEE_MACHINE_ENTITY;
    public static ScreenHandlerType<CoffeeMachineGUI> COFFEE_MACHINE_HANDLER_TYPE;

    public static BlockEntityType<CrusherCoffeeEntity> CRUSHER_COFFEE_ENTITY;
    public static ScreenHandlerType<CrusherCoffeeGUI> CRUSHER_COFFEE_HANDLER_TYPE;

    public static void register() {
        COFFEE_MACHINE_ENTITY = FabricBlockEntityTypeBuilder.create(CoffeeMachineEntity::new, CoffeeBlocks.COFFEE_MACHINE).build(null);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(CoffeeMC.MODID, "coffee_machine_gui"), COFFEE_MACHINE_ENTITY);

        COFFEE_MACHINE_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(new Identifier(CoffeeMC.MODID, "coffee_machine_gui"), (int syncId, PlayerInventory inventory) -> {
            return new CoffeeMachineGUI(COFFEE_MACHINE_HANDLER_TYPE, syncId, inventory, ScreenHandlerContext.EMPTY);
        });

        CRUSHER_COFFEE_ENTITY = FabricBlockEntityTypeBuilder.create(CrusherCoffeeEntity::new, CoffeeBlocks.CRUSHER_COFFEE).build(null);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(CoffeeMC.MODID, "crusher_coffee_gui"), CRUSHER_COFFEE_ENTITY);

        CRUSHER_COFFEE_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(new Identifier(CoffeeMC.MODID, "crusher_coffee_gui"), (int syncId, PlayerInventory inventory) -> {
            return new CrusherCoffeeGUI(CRUSHER_COFFEE_HANDLER_TYPE, syncId, inventory, ScreenHandlerContext.EMPTY);
        });
    }
}
