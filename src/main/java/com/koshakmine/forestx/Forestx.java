package com.koshakmine.forestx;

import com.koshakmine.forestx.items.BerryItem;
import com.koshakmine.forestx.items.FoodItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Forestx implements ModInitializer {
    static String MOD_ID = "forestx";
    //Items
    public static final Item Berrypie = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(6f).build()));
    public static final Item Raspberry = new BerryItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Blackberry = new BerryItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Cranberry = new BerryItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Blueberry = new BerryItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    //Blocks
    public static final SweetBerryBushBlock RaspberryBush1 = new SweetBerryBushBlock(FabricBlockSettings.of(Material.PLANT));
    //Registry
    @Override
    public void onInitialize() {
        //Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "berry_pie"), Berrypie);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raspberry"), Raspberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackberry"), Blackberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cranberry"), Cranberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blueberry"), Blueberry);
        //Blocks
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bush_raspberry1"), RaspberryBush1);
    }
}
