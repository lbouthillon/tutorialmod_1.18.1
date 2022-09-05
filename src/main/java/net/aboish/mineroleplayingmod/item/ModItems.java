package net.aboish.mineroleplayingmod.item;

import net.aboish.mineroleplayingmod.MineRolePlayingMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineRolePlayingMod.MOD_ID);

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB).food(ModFoods.ONION)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
