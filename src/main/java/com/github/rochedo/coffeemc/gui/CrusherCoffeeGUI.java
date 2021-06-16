package com.github.rochedo.coffeemc.gui;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.LiteralText;

public class CrusherCoffeeGUI extends SyncedGuiDescription {
    public CrusherCoffeeGUI(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(type, syncId, playerInventory, getBlockInventory(context, 8), null);

        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(128, 130);

        WItemSlot slot = WItemSlot.of(blockInventory, 0, 2, 1);
        root.add(slot, 4, 3,8 ,8);

        WItemSlot slot1 = WItemSlot.of(blockInventory, 0, 1, 1);
        root.add(slot1, 8, 3,8 ,8);

        WLabel label = new WLabel(new LiteralText("Test"), 0x000000);
        root.add(label, 0, 8, 2, 1);

        root.add(this.createPlayerInventoryPanel(), 2,5);

        root.validate(this);
    }
}
