package com.firecontroller1847.modtesting.data;


import com.firecontroller1847.modtesting.ModTesting;
import com.firecontroller1847.modtesting.ModTestingBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModTestingBlockStateProvider extends BlockStateProvider {

    // Constructor
    public ModTestingBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ModTesting.MOD_ID, existingFileHelper);
    }

    // Register States & Models
    @Override
    protected void registerStatesAndModels() {
        // Stune Block State & Models
        ModelFile stuneModel = models().cubeAll("stune", modLoc("block/stune"));
        ModelFile stuneMirroredModel = models().withExistingParent("stune_mirrored", mcLoc("block/cube_mirrored_all")).texture("all", modLoc("block/stune"));
        getVariantBuilder(ModTestingBlocks.STUNE)
            .forAllStates(state -> new ConfiguredModel[] {
                ConfiguredModel.builder().modelFile(stuneModel).buildLast(),
                ConfiguredModel.builder().modelFile(stuneMirroredModel).buildLast(),
                ConfiguredModel.builder().modelFile(stuneModel).rotationY(180).buildLast(),
                ConfiguredModel.builder().modelFile(stuneMirroredModel).rotationY(180).buildLast()
            });
    }

}
