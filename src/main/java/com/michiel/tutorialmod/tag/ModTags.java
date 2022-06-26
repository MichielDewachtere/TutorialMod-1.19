package com.michiel.tutorialmod.tag;

import com.michiel.tutorialmod.TutorialMod;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static final TagKey<Block> RUBY_ORES = BlockTags.create(new ResourceLocation(TutorialMod.MOD_ID, "ruby_ores"));
    public static final TagKey<Item> RUBY_ORES_ITEMS = ItemTags.create(new ResourceLocation(TutorialMod.MOD_ID, "ruby_ores"));
    public static final TagKey<Block> OPAL_ORES = BlockTags.create(new ResourceLocation(TutorialMod.MOD_ID, "opal_ores"));
    public static final TagKey<Item> OPAL_ORES_ITEMS = ItemTags.create(new ResourceLocation(TutorialMod.MOD_ID, "opal_ores"));
}
