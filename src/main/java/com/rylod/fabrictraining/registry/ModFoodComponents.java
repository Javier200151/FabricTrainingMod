package com.rylod.fabrictraining.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SANCOCHO = (new FoodComponent.Builder()).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent SENZU_BEAN = (new FoodComponent.Builder()).hunger(10).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 3), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2500, 2), 1.0F).alwaysEdible().build();
}