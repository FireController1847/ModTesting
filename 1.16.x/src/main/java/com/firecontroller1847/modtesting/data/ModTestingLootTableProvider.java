package com.firecontroller1847.modtesting.data;

import com.firecontroller1847.modtesting.ModTestingBlockLootTables;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModTestingLootTableProvider extends LootTableProvider {

    // Constructor
    public ModTestingLootTableProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    // Get Tables
    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(Pair.of(ModTestingBlockLootTables::new, LootParameterSets.BLOCK));
    }

    // Validate
    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((a, b) -> LootTableManager.validate(validationtracker, a, b));
    }

}
