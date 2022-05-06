package com.rylod.fabrictraining.registry.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModWisteriaFlowerBlock extends FlowerBlock {
    public ModWisteriaFlowerBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
        super(suspiciousStewEffect, effectDuration, settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient()) {
            if (entity instanceof LivingEntity) {
                if (entity instanceof ZombieEntity) {
                    LivingEntity livingEntity = ((LivingEntity) entity);
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 40)); // 20 ticks is a second
                } else {
                    LivingEntity livingEntity = ((LivingEntity) entity);
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 40)); // 20 ticks is a second
                }
            }
        }

        super.onEntityCollision(state, world, pos, entity);
    }
}
