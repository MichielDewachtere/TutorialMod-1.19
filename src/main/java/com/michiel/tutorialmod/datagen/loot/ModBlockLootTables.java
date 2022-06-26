package com.michiel.tutorialmod.datagen.loot;

import com.michiel.tutorialmod.block.ModBlocks;
import com.michiel.tutorialmod.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.OPAL_BLOCK.get());

        this.add(ModBlocks.RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.OPAL_ORE.get(), ModItems.OPAL_NUGGET.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
