package net.aboish.mineroleplayingmod.damage_source;

import net.minecraft.world.damagesource.DamageSource;

public class ModDamageSource extends DamageSource {

    public ModDamageSource(String p_19333_) {
        super(p_19333_);
    }

    public static final ModDamageSource BLEEDING = (ModDamageSource) (new ModDamageSource("bleeding")).bypassArmor();
}
