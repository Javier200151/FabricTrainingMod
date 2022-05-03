package com.rylod.fabrictraining;

import com.rylod.fabrictraining.registry.ModBlocks;
import com.rylod.fabrictraining.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Training implements ModInitializer {

    public static final String MOD_ID = "training";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
