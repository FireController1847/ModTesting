package com.firecontroller1847.modtesting.blocks;

import com.firecontroller1847.modtesting.ModTesting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class StuneBlock extends Block {

    // Constructor
    public StuneBlock(String name) {
        super(Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f));
        this.setRegistryName(ModTesting.MOD_ID, name);
    }

}
