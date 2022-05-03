package com.koshakmine.natureambience.client;

import com.koshakmine.natureambience.Natureambience;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class NatureambienceClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Natureambience.RaspberryBush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Natureambience.BlackberryBush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Natureambience.BlueberryBush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Natureambience.CranberryBush, RenderLayer.getCutout());
    }
}
