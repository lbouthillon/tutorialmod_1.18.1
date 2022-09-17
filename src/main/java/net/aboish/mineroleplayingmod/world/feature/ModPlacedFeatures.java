package net.aboish.mineroleplayingmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> EBONY_PLACED = PlacementUtils.m_206509_("ebony_placed",
            ModConfiguredFeatures.EBONY_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 1)));

    public static final Holder<PlacedFeature> SILVER_ORE_PLACED = PlacementUtils.m_206509_("ebony_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(14, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-70),VerticalAnchor.aboveBottom(80))));

}
