package com.koshakmine.natureambience.items;

import com.koshakmine.natureambience.Natureambience;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public class BerryItem extends Item {

    public BerryItem(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        Hand hand = context.getHand();
        BlockPos pos = context.getBlockPos();
        if(context.getWorld().getBlockState(pos) == Blocks.GRASS_BLOCK.getDefaultState()) {
            if(context.getPlayer().getStackInHand(hand).getItem() == Natureambience.Raspberry) {
                context.getPlayer().getStackInHand(hand).setCount(0);
                context.getWorld().setBlockState(context.getBlockPos().up(), Natureambience.RaspberryBush.getDefaultState());

            } else {
                if(context.getPlayer().getStackInHand(hand).getItem() == Natureambience.Blackberry) {
                    context.getPlayer().getStackInHand(hand).setCount(0);
                    context.getWorld().setBlockState(context.getBlockPos().up(), Natureambience.BlackberryBush.getDefaultState());

                } else {
                    if(context.getPlayer().getStackInHand(hand).getItem() == Natureambience.Blueberry) {
                        context.getPlayer().getStackInHand(hand).setCount(0);
                        context.getWorld().setBlockState(context.getBlockPos().up(), Natureambience.BlueberryBush.getDefaultState());

                    } else {
                        if(context.getPlayer().getStackInHand(hand).getItem() == Natureambience.Cranberry) {
                            context.getPlayer().getStackInHand(hand).setCount(0);
                            context.getWorld().setBlockState(context.getBlockPos().up(), Natureambience.CranberryBush.getDefaultState());

                        }
                    }
                }
            }
        }

        return super.useOnBlock(context);
    }
}
