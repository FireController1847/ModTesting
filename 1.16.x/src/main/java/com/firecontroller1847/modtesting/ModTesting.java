package com.firecontroller1847.modtesting;

import com.firecontroller1847.modtesting.data.ModTestingBlockStateProvider;
import com.firecontroller1847.modtesting.data.ModTestingItemModelProvider;
import com.firecontroller1847.modtesting.data.ModTestingLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModTesting.MOD_ID)
@Mod.EventBusSubscriber(modid = ModTesting.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTesting {

    // Constants
    public static final String MOD_ID = "modtesting";
    public static final String MOD_NAME = "ModTesting";
    public static final String MOD_VERSION = "1.0.0-SNAPSHOT";
    public static final Logger LOGGER = LogManager.getLogger(ModTesting.MOD_NAME);

    // Common Setup
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.debug("ModTesting#onCommonSetup(event)");
    }

    // Gather Data Event
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        LOGGER.debug("ModTesting#onGatherData(event)");
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        generator.addProvider(new ModTestingBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(new ModTestingItemModelProvider(generator, existingFileHelper));
        if (event.includeServer()) {
            generator.addProvider(new ModTestingLootTableProvider(generator));
        }
    }

}
