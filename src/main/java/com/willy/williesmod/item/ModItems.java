package com.willy.williesmod.item;

import com.willy.williesmod.WilliesMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Official Item Names in lang/en_us.json
    public static final Item BOLLOCK = registerItem("bollock", new Item(new Item.Settings()));

    // Helper method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WilliesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WilliesMod.LOGGER.info("Registering ModItems for " + WilliesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(entries -> {
            entries.add(BOLLOCK);
        });
    }
}
