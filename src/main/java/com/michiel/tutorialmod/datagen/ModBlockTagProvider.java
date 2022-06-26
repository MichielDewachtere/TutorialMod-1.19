package com.michiel.tutorialmod.datagen;

import com.michiel.tutorialmod.TutorialMod;
import com.michiel.tutorialmod.block.ModBlocks;
import com.michiel.tutorialmod.datagen.loot.ModBlockLootTables;
import com.michiel.tutorialmod.tag.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get());

        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.RUBY_BLOCK.get());
        tag(Tags.Blocks.ORES)
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get());

        tag(ModTags.OPAL_ORES)
                .add(ModBlocks.OPAL_ORE.get());
        tag(ModTags.RUBY_ORES)
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get());

    }
}
