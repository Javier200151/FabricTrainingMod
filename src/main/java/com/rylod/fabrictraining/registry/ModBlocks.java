package com.rylod.fabrictraining.registry;

import com.rylod.fabrictraining.Training;
import com.rylod.fabrictraining.registry.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),
            ModItemGroup.RUBY, "tooltip.training.ruby_block");

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.RUBY);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ModStoneBottonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4.0f).requiresTool().noCollision()), ModItemGroup.RUBY);

    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(4.0f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new ModStairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL)
                    .strength(4.0f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.RUBY);

    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.RUBY);

    public static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK,new Identifier(Training.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(Training.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(Training.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(Training.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        Training.LOGGER.info("Registering mod items for "+Training.MOD_ID);
    }
}
