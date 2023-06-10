package com.supernoob.backroomsassets.block;

import com.supernoob.backroomsassets.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class FluorescentLight extends Block {

    public FluorescentLight(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(10) == 0) {
            world.playSound((double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5, ModSounds.FLUORESCENT_LIGHT_BUZZ_SOUND, SoundCategory.BLOCKS, 0.1f, 1f, false);
        }
    }
}