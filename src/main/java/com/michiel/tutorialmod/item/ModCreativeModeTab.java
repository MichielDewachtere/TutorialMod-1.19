package com.michiel.tutorialmod.item;

import com.michiel.tutorialmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BLOCK_TAB = new CreativeModeTab("blocktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.RUBY_BLOCK.get());
        }
    };
    public static final CreativeModeTab GEM_TAB = new CreativeModeTab("gemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };
}
