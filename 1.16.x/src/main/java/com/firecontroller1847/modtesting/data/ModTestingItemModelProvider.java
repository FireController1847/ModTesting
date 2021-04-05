package com.firecontroller1847.modtesting.data;

import com.firecontroller1847.modtesting.ModTesting;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModTestingItemModelProvider extends ItemModelProvider {

    // Constructor
    public ModTestingItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ModTesting.MOD_ID, existingFileHelper);
    }

    // Register Models
    @Override
    protected void registerModels() {
        withExistingParent("stune", modLoc("block/stune"));
    }

}
