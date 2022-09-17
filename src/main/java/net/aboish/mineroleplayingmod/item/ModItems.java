package net.aboish.mineroleplayingmod.item;

import net.aboish.mineroleplayingmod.MineRolePlayingMod;
import net.aboish.mineroleplayingmod.block.ModBlocks;
import net.aboish.mineroleplayingmod.item.custom.HolyArmorItem;
import net.aboish.mineroleplayingmod.item.custom.PoisonedSwordItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(ModTiers.SILVER, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> POISONED_SILVER_SWORD = ITEMS.register("poisoned_silver_sword",
            () -> new PoisonedSwordItem(ModTiers.SILVER, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> POISONED_IRON_SWORD = ITEMS.register("poisoned_iron_sword",
            () -> new PoisonedSwordItem(Tiers.IRON, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> POISONED_DIAMOND_SWORD = ITEMS.register("poisoned_diamond_sword",
            () -> new PoisonedSwordItem(Tiers.DIAMOND, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> POISONED_STONE_SWORD = ITEMS.register("poisoned_stone_sword",
            () -> new PoisonedSwordItem(Tiers.STONE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> POISONED_WOODEN_SWORD = ITEMS.register("poisoned_wooden_sword",
            () -> new PoisonedSwordItem(Tiers.WOOD, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> POISONED_NETHERITE_SWORD = ITEMS.register("poisoned_netherite_sword",
            () -> new PoisonedSwordItem(Tiers.NETHERITE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModTiers.SILVER,1 , 1f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModTiers.SILVER, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModTiers.SILVER, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModTiers.SILVER, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new HolyArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> MAGIC_INFUSED_DUST = ITEMS.register("magic_infused_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));

    public static final RegistryObject<Item> ELVEN_BOW = ITEMS.register("elven_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB).durability(1000)));

    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ONION_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
