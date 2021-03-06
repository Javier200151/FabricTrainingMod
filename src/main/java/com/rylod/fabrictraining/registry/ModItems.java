package com.rylod.fabrictraining.registry;

import com.rylod.fabrictraining.Training;
import com.rylod.fabrictraining.registry.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = registerItems("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_NUGGET = registerItems("ruby_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RAW_RUBY = registerItems("raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item SUPER_COAL = registerItems("super_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item SANCOCHO = registerItems("sancocho",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY).food(ModFoodComponents.SANCOCHO)));

    public static final Item SENZU_BEAN = registerItems("senzu_bean",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY).food(ModFoodComponents.SENZU_BEAN)));

    public static final Item DOWSING_ROD = registerItems("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.RUBY).maxDamage(16)));

    public static final Item RUBY_SWORD = registerItems("ruby_sword",
            new ModPoisonousSwordItem(ModToolMaterial.RUBY, 3, 2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_PICKAXE = registerItems("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterial.RUBY, 2, 1.5f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_AXE = registerItems("ruby_axe",
            new ModAxeItem(ModToolMaterial.RUBY, 5, 0.2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_SHOVEL = registerItems("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 1, 1.5f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_HOE = registerItems("ruby_hoe",
            new ModHoeItem(ModToolMaterial.RUBY, 1, 1.5f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_HELMET = registerItems("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_CHESTPLATE = registerItems("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_LEGGINGS = registerItems("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_BOOTS = registerItems("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY_DUST = registerItems("ruby_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item DATA_TABLET = registerItems("data_tablet",
            new DataTableItem(new FabricItemSettings().group(ModItemGroup.RUBY).maxCount(1)));

    public static final Item SENZU_SEEDS = registerItems("senzu_seeds",
            new AliasedBlockItem(ModBlocks.SENZU_VINE, new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RY_BOW = registerItems("ry_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.RUBY).maxDamage(650)));

    public static Item registerItems(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Training.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Training.LOGGER.info("Registering mod items for "+Training.MOD_ID);
    }
}
