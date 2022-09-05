package net.aboish.mineroleplayingmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MINE_ROLE_PLAYING_TAB = new CreativeModeTab("mineroleplayingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_SILVER.get());
        }
    };
}
