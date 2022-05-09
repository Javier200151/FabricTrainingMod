package com.rylod.fabrictraining.registry.custom;

import com.rylod.fabrictraining.registry.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class SenzuVineBlock extends CropBlock {
    public SenzuVineBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.SENZU_SEEDS;
    }
}
