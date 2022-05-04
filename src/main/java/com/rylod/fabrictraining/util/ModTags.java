package com.rylod.fabrictraining.util;

import com.rylod.fabrictraining.Training;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
                createTag("dowsing_rod_detectable_blocks");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Training.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> RUBIES = createCommonTag("rubies");
        public static final TagKey<Item> RUBY_NUGGETS = createCommonTag("ruby_nuggets");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Training.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
