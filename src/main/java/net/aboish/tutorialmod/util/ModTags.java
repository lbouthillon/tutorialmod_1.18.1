package net.aboish.tutorialmod.util;

import net.aboish.tutorialmod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> MACHINES = null;

        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional((new ResourceLocation(TutorialMod.MOD_ID, name)));
        }

        private static Tags.IOptionalNamedTag<Block> forgeTag(String name) {
            return BlockTags.createOptional((new ResourceLocation("forge", name)));
        }
    }

    public static class Items{
        public static Tags.IOptionalNamedTag<Item> SILVER_INGOT = forgeTag("ingots/silver");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional((new ResourceLocation(TutorialMod.MOD_ID, name)));
        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return ItemTags.createOptional((new ResourceLocation("forge", name)));
        }
    }
}
