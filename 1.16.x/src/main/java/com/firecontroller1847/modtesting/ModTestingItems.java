package com.firecontroller1847.modtesting;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = ModTesting.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTestingItems {

    // Items

    // Block Items
    public static final BlockItem STUNE_BLOCK = new BlockItem(ModTestingBlocks.STUNE, new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS));

    // Register
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        ModTesting.LOGGER.debug("ModTestingItems#register(event)");
        IForgeRegistry<Item> registry = event.getRegistry();

        // Items

        // Block Items
        registry.register(STUNE_BLOCK.setRegistryName(Objects.requireNonNull(ModTestingBlocks.STUNE.getRegistryName())));
    }

}
