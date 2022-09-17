package net.aboish.mineroleplayingmod.util;

import net.aboish.mineroleplayingmod.MineRolePlayingMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MACHINES = null;

        private static TagKey<Block> tag(String name) {
            return BlockTags.create((new ResourceLocation(MineRolePlayingMod.MOD_ID, name)));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create((new ResourceLocation("forge", name)));
        }
    }

    public static class Items{
        public static TagKey<Item> SILVER_INGOT = forgeTag("ingots/silver");
        public static TagKey<Item> RAW_SILVER = forgeTag("raws/silver");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create((new ResourceLocation(MineRolePlayingMod.MOD_ID, name)));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create((new ResourceLocation("forge", name)));
        }
    }
}
