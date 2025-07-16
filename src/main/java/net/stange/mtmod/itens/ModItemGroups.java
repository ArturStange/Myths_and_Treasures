package net.stange.mtmod.itens;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.stange.mtmod.MythsAndTreasures;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class ModItemGroups {

    public static final ItemGroup MYTHS_AND_TREASURES_ITEMS_GROUPS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MythsAndTreasures.MOD_ID, "myths_and_treasures_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItens.BRONZE_INGOT))
                    .displayName(Text.translatable("itemgroup.myths_and_treasures.myths_and_treasures_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItens.BRONZE_INGOT);
                        entries.add(ModItens.RAW_BRONZE);
                    })
                    .build());

    public static void registerItemGroups() {
        MythsAndTreasures.LOGGER.info("Registering Item Groups for" + MythsAndTreasures.MOD_ID);
    }
}
