package net.aboish.mineroleplayingmod.block.custom;

import io.netty.handler.codec.mqtt.MqttProperties;
import net.aboish.mineroleplayingmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class OnionPlantBlock extends CropBlock {
    public static final int MAX_AGE = 5;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;
    public static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D)};

    public OnionPlantBlock(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    public void randomTick(BlockState p_49667_, ServerLevel p_49668_, BlockPos p_49669_, Random p_49670_) {
        if (p_49670_.nextInt(2) != 0) {
            super.randomTick(p_49667_, p_49668_, p_49669_, p_49670_);
        }

    }

    @Override
    protected int getBonemealAgeIncrease(Level p_49663_) {
        return super.getBonemealAgeIncrease(p_49663_)/2;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.ONION_SEEDS.get();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_49665_) {
        p_49665_.add(AGE);
    }

    @Override
    public VoxelShape getShape(BlockState p_49672_, BlockGetter p_49673_, BlockPos p_49674_, CollisionContext p_49675_) {
        return SHAPE_BY_AGE[p_49672_.getValue(this.getAgeProperty())];
    }


}
