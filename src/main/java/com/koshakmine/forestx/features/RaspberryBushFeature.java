package com.koshakmine.forestx.features;

import com.koshakmine.forestx.Forestx;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class RaspberryBushFeature extends Feature<RaspberryBushFeatureConfig> {
    public RaspberryBushFeature(Codec<RaspberryBushFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<RaspberryBushFeatureConfig> context) {
        BlockPos topPos = context.getWorld().getTopPosition(Heightmap.Type.OCEAN_FLOOR_WG, context.getOrigin());
        Direction offset = Direction.NORTH;

        for (int y = 0; y < 15; y++) {
            offset = offset.rotateYClockwise();
            context.getWorld().setBlockState(topPos.up(y).offset(offset), Forestx.RaspberryBush.getDefaultState(), 3);
        }

        return true;
    }
}
