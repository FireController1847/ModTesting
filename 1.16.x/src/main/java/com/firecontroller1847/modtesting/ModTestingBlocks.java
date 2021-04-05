package com.firecontroller1847.modtesting;

import com.firecontroller1847.modtesting.blocks.StuneBlock;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = ModTesting.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTestingBlocks {

    // Blocks
    public static final Block STUNE = new StuneBlock("stune");

    // Returns all blocks
    public static ArrayList<Block> all() {
        ArrayList<Block> blocks = new ArrayList<>();
        blocks.add(ModTestingBlocks.STUNE);
        return blocks;
    }

    // Register
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        ModTesting.LOGGER.debug("ModTestingBlocks#register(event)");
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(STUNE);
    }

}
