package com.rylod.fabrictraining.registry.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModPoisonousSwordItem extends SwordItem {
    public ModPoisonousSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        //target.setFireTicks(100);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 2), attacker);
        return super.postHit(stack, target, attacker);
    }
}
