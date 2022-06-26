package com.michiel.tutorialmod.datagen;

import com.michiel.tutorialmod.TutorialMod;
import com.michiel.tutorialmod.block.ModBlocks;
import com.michiel.tutorialmod.datagen.loot.ModBlockLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TutorialMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.OPAL_BLOCK.get());
        simpleBlock(ModBlocks.OPAL_ORE.get());
        simpleBlock(ModBlocks.RUBY_BLOCK.get());
        simpleBlock(ModBlocks.RUBY_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_RUBY_ORE.get());
    }
}
