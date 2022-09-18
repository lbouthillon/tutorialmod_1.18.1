package net.aboish.mineroleplayingmod.potion;

import net.aboish.mineroleplayingmod.MineRolePlayingMod;
import net.aboish.mineroleplayingmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.internal.ForgeBindings;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, MineRolePlayingMod.MOD_ID);

    public static final RegistryObject<Potion> BLEEDING_POTION = POTIONS.register("bleeding_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.BLEEDING.get(), 500, 0)));
    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
