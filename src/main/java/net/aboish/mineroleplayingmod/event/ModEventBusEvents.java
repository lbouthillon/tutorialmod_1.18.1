package net.aboish.mineroleplayingmod.event;

import net.aboish.mineroleplayingmod.MineRolePlayingMod;

import net.aboish.mineroleplayingmod.event.loot.OnionSeedsFromGrassAdditionModifier;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = MineRolePlayingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new OnionSeedsFromGrassAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(MineRolePlayingMod.MOD_ID,"onion_seeds_from_grass"))

        );
    }
}
