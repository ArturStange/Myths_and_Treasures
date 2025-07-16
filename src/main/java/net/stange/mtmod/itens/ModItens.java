package net.stange.mtmod.itens;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.stange.mtmod.MythsAndTreasures;

// Itens-Minérios:
public class ModItens {
//Bronze:
    //Bronze cru
    public static final Item RAW_BRONZE = registerItem( "raw_bronze", new Item(new Item.Settings().registryKey(
            RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MythsAndTreasures.MOD_ID,"raw_bronze")))));

    //Barra de Bronze
    public static final Item BRONZE_INGOT = registerItem( "bronze_ingot", new Item(new Item.Settings().registryKey(
            RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MythsAndTreasures.MOD_ID,"bronze_ingot")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MythsAndTreasures.MOD_ID, name), item);
    }

    public static void registerModItens(){
        MythsAndTreasures.LOGGER.info("Registering Mod Itens for" + MythsAndTreasures.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(RAW_BRONZE);
           entries.add(BRONZE_INGOT);
        });
    }
}
