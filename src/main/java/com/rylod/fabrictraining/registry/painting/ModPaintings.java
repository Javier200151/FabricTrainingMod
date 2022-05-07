package com.rylod.fabrictraining.registry.painting;

import com.rylod.fabrictraining.Training;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.awt.*;


public class ModPaintings {

    public static final PaintingMotive MARATHON = registerPainting("marathon", new PaintingMotive(16,16));
    public static final PaintingMotive FAMILY = registerPainting("family", new PaintingMotive(16,32));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive){
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Training.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings(){
        Training.LOGGER.info("Registering paintings for "+Training.MOD_ID);
    }
}
