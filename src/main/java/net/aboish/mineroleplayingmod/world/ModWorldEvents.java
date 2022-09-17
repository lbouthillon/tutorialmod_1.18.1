package net.aboish.mineroleplayingmod.world;

import net.aboish.mineroleplayingmod.MineRolePlayingMod;
import net.aboish.mineroleplayingmod.world.gen.ModOreGeneration;
import net.aboish.mineroleplayingmod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MineRolePlayingMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
    }
}