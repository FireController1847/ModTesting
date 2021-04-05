package com.firecontroller1847.modtesting;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.loot.BlockLootTables;

public class ModTestingBlockLootTables extends BlockLootTables {

    @Override
    protected void addTables() {
        ModTesting.LOGGER.debug("ModTestingBlockLootTables#addTables()");
        this.add(ModTestingBlocks.STUNE, block -> createSingleItemTableWithSilkTouch(block, Blocks.COBBLESTONE));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        ModTesting.LOGGER.debug("ModTestingBlockLootTables#getKnownBlocks()");
        return ModTestingBlocks.all();
    }

}
