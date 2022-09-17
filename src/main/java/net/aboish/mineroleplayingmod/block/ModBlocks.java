package net.aboish.mineroleplayingmod.block;

import net.aboish.mineroleplayingmod.MineRolePlayingMod;
import net.aboish.mineroleplayingmod.block.custom.MagicLanternBlock;
import net.aboish.mineroleplayingmod.block.custom.OnionPlantBlock;
import net.aboish.mineroleplayingmod.item.ModCreativeModeTab;
import net.aboish.mineroleplayingmod.item.ModItems;
import net.aboish.mineroleplayingmod.block.custom.ModFlammableRotatedPillarBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MineRolePlayingMod.MOD_ID);

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> LAVA_BLOCK = registerBlock("lava_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), new Item.Properties().fireResistant().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> LAVA_BRICK = registerBlock("lava_brick",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()),
            new Item.Properties().fireResistant().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> LAVA_BRICK_STAIRS = registerBlock("lava_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LAVA_BRICK.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()),
            new Item.Properties().fireResistant().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> LAVA_BRICK_SLAB = registerBlock("lava_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()),
            new Item.Properties().fireResistant().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> EBONY_FENCE = registerBlock("ebony_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(9f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> EBONY_FENCE_GATE = registerBlock("ebony_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(9f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> LAVA_BRICK_WALL = registerBlock("lava_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()),
            new Item.Properties().fireResistant().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> EBONY_BUTTON = registerBlock("ebony_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).noCollission()),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));



    public static final RegistryObject<Block> EBONY_PRESSURE_PLATE = registerBlock("ebony_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f)),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).noOcclusion()),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).noOcclusion()),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> MAGIC_LANTERN = registerBlock("magic_lantern",
            () -> new MagicLanternBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).noOcclusion().lightLevel(
                            (state) -> state.getValue(MagicLanternBlock.LIT) ? 15 : 0)),
            new Item.Properties().tab(ModCreativeModeTab.MINE_ROLE_PLAYING_TAB));

    public static final RegistryObject<Block> ONION_PLANT = registerBlockWithoutBlockItem("onion_plant",
            () -> new OnionPlantBlock(BlockBehaviour.Properties.of(Material.PLANT).noOcclusion()));

    private static <T extends Block>RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, Item.Properties itemProp){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, itemProp);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           Item.Properties itemProp){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), itemProp));
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItemFireResistant(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().fireResistant().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}



