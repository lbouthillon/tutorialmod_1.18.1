package net.aboish.mineroleplayingmod.world.feature;


import net.aboish.mineroleplayingmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EBONY_TREE =
            FeatureUtils.m_206488_("ebony", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.EBONY_LOG.get()),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(ModBlocks.EBONY_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());



    public static final Holder<PlacedFeature> EBONY_CHECKED = PlacementUtils.m_206513_("ebony_checked", EBONY_TREE,
            PlacementUtils.m_206493_(ModBlocks.EBONY_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> EBONY_SPAWN =
            FeatureUtils.m_206488_("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(EBONY_CHECKED,
                            0.5F)), EBONY_CHECKED));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.m_206488_("silver_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, 9));


}
