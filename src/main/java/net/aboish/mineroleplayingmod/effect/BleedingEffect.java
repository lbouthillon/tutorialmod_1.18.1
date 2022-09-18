package net.aboish.mineroleplayingmod.effect;

import net.aboish.mineroleplayingmod.damage_source.ModDamageSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class BleedingEffect extends MobEffect {

    protected BleedingEffect(MobEffectCategory p_19451_, int p_19452_) {
        super(p_19451_, p_19452_);
    }

    @Override
    public void applyEffectTick(LivingEntity p_19467_, int p_19468_) {
        p_19467_.hurt(ModDamageSource.BLEEDING, 1.0F);
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        int i = 40 >> p_19456_;
        if (i > 0) {
            return p_19455_ % i == 0;
        } else {
            return true;
        }
    }
}
