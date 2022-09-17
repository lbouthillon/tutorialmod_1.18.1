package net.aboish.mineroleplayingmod.world.feature.tree;

import net.aboish.mineroleplayingmod.world.feature.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class EbonyTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> m_203525_(Random p_204307_, boolean p_204308_) {
        return ModConfiguredFeatures.EBONY_TREE;
    }
}
