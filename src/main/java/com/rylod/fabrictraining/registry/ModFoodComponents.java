package com.rylod.fabrictraining.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SANCOCHO = (new FoodComponent.Builder()).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).hunger(4).saturationModifier(0.3F).build();
}
