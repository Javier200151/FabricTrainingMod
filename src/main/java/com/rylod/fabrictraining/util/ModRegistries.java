package com.rylod.fabrictraining.util;

import com.rylod.fabrictraining.Training;
import com.rylod.fabrictraining.registry.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuff() {
        registerFuels();
    }

    private static void registerFuels(){
        Training.LOGGER.info("Registering fuels for "+Training.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.SUPER_COAL, 200);
    }
}
