package com.koshakmine.forestx;

import com.koshakmine.forestx.items.FoodItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Forestx implements ModInitializer {
    static String MOD_ID = "forestx";
    public static final Item Berrypie = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(6f).build()));
    public static final Item Raspberry = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Blackberry = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Cranberry = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "berry_pie"), Berrypie);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raspberry"), Raspberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackberry"), Blackberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cranberry"), Cranberry);
    }
}
