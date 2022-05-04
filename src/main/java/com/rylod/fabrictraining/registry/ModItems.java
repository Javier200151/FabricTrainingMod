package com.rylod.fabrictraining.registry;

import com.rylod.fabrictraining.Training;
import com.rylod.fabrictraining.registry.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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

    public static final Item DOWSING_ROD = registerItems("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.RUBY).maxDamage(16)));

    public static Item registerItems(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Training.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Training.LOGGER.info("Registering mod items for "+Training.MOD_ID);
    }
}
