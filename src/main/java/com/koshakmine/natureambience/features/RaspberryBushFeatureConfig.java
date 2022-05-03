package com.koshakmine.natureambience.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record RaspberryBushFeatureConfig(IntProvider height, BlockStateProvider block) implements FeatureConfig {
    public static final Codec<RaspberryBushFeatureConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            IntProvider.VALUE_CODEC.fieldOf("height").forGetter(RaspberryBushFeatureConfig::height),
            BlockStateProvider.TYPE_CODEC.fieldOf("block").forGetter(RaspberryBushFeatureConfig::block)
    ).apply(instance, instance.stable(RaspberryBushFeatureConfig::new)));
}
