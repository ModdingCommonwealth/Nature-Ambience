package com.koshakmine.forestx.items;

import com.koshakmine.forestx.Forestx;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class BerryItem extends Item {

    public BerryItem(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        Hand hand = context.getHand();
        if(context.getPlayer().getStackInHand(hand).getItem() == Forestx.Raspberry) {
            context.getPlayer().getStackInHand(hand).setCount(0);
            context.getWorld().setBlockState(context.getBlockPos().up(), Forestx.RaspberryBush1.getDefaultState());

        }
        return super.useOnBlock(context);
    }
}
