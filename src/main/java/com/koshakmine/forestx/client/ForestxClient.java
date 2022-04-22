package com.koshakmine.forestx.client;

import com.koshakmine.forestx.Forestx;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class ForestxClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Forestx.RaspberryBush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Forestx.BlackberryBush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Forestx.BlueberryBush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Forestx.CranberryBush, RenderLayer.getCutout());
    }
}
