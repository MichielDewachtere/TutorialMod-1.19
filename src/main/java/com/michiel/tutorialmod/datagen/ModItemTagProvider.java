package com.michiel.tutorialmod.datagen;

import com.michiel.tutorialmod.TutorialMod;
import com.michiel.tutorialmod.block.ModBlocks;
import com.michiel.tutorialmod.item.ModItems;
import com.michiel.tutorialmod.tag.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(generator, blockTags, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.GEMS)
                .add(ModItems.OPAL.get())
                .add(ModItems.RUBY.get());
        tag(Tags.Items.RAW_MATERIALS)
                .add(ModItems.RAW_RUBY.get());
        tag(Tags.Items.NUGGETS)
                .add(ModItems.OPAL_NUGGET.get());

        tag(ModTags.OPAL_ORES_ITEMS)
                .add(ModBlocks.OPAL_ORE.get().asItem());
        tag(ModTags.RUBY_ORES_ITEMS)
                .add(ModBlocks.RUBY_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get().asItem());
    }
}
