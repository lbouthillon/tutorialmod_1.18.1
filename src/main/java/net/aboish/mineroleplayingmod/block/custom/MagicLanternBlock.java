package net.aboish.mineroleplayingmod.block.custom;

import net.aboish.mineroleplayingmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;


public class MagicLanternBlock extends Block {
    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public MagicLanternBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND) {
            boolean currentState = pState.getValue(LIT);
            if (pPlayer.getMainHandItem().getItem() == ModItems.MAGIC_INFUSED_DUST.get() && !currentState){
                pLevel.setBlock(pPos, pState.setValue(LIT, Boolean.TRUE), 3);
                pPlayer.getMainHandItem().shrink(1);
            }
            else if (pPlayer.getMainHandItem().getItem() == Items.AIR){
                pLevel.setBlock(pPos, pState.setValue(LIT, Boolean.FALSE), 3);
            }

        }

        return InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder){
        pBuilder.add(LIT);
    }

}
