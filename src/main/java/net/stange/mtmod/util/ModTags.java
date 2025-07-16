package net.stange.mtmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stange.mtmod.MythsAndTreasures;

public class ModTags {

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MythsAndTreasures.MOD_ID, name));
        }

        private static TagKey<Item> BRONZE_REPAIR = createTag("bronze_repair");
    }

    public static class Blocks {

        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze_tool");
        public static final TagKey <Block> INCORRECT_FOR_BRONZE_TOOL = createTag("incorrect_for_bronze_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MythsAndTreasures.MOD_ID, name));
        }
    }
}
