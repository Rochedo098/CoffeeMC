package com.github.rochedo.coffeemc;

import com.github.rochedo.coffeemc.gui.CoffeeMachineGUI;
import com.github.rochedo.coffeemc.gui.CrusherCoffeeGUI;
import com.github.rochedo.coffeemc.registry.CoffeeGUIs;
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class CoffeeMCClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.<CoffeeMachineGUI, CottonInventoryScreen<CoffeeMachineGUI>>register(
                CoffeeGUIs.COFFEE_MACHINE_HANDLER_TYPE,
                (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title)
        );

        ScreenRegistry.<CrusherCoffeeGUI, CottonInventoryScreen<CrusherCoffeeGUI>>register(
                CoffeeGUIs.CRUSHER_COFFEE_HANDLER_TYPE,
                (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title)
        );
    }
}
