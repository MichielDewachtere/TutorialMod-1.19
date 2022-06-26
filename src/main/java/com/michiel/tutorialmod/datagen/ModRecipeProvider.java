package com.michiel.tutorialmod.datagen;

import com.michiel.tutorialmod.block.ModBlocks;
import com.michiel.tutorialmod.datagen.loot.ModBlockLootTables;
import com.michiel.tutorialmod.item.ModItems;
import com.michiel.tutorialmod.tag.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }




    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> p_176532_) {

        //shaped crafting recipe
        ShapedRecipeBuilder.shaped(ModBlocks.OPAL_BLOCK.get(), 1)
                .define('#', ModItems.OPAL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(p_176532_,"opal_block_from_opal");
        ShapedRecipeBuilder.shaped(ModItems.OPAL.get(),1)
                .define('#', ModItems.OPAL_NUGGET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_opal_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL_NUGGET.get()).build()))
                .save(p_176532_,"opal_from_opal_nugget");
        ShapedRecipeBuilder.shaped(ModBlocks.RUBY_BLOCK.get(),1)
                .define('#', ModItems.RUBY.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(p_176532_,"ruby_block_from_ruby");

        //shapeless crafting recipe
        ShapelessRecipeBuilder.shapeless(ModItems.OPAL.get(),9)
                .requires(ModBlocks.OPAL_BLOCK.get())
                .unlockedBy("has_opal_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.OPAL_BLOCK.get()).build()))
                .save(p_176532_, "opal_from_opal_block");
        ShapelessRecipeBuilder.shapeless(ModItems.OPAL_NUGGET.get(),9)
                .requires(ModItems.OPAL.get())
                .unlockedBy("has_opal_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(p_176532_, "opal_nugget_from_opal");
        ShapelessRecipeBuilder.shapeless(ModItems.RUBY.get(),9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy("has_ruby_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RUBY_BLOCK.get()).build()))
                .save(p_176532_, "ruby_from_ruby_block");
        //smelting recipe
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_RUBY.get()),
                ModItems.RUBY.get(),1f,200)
                .unlockedBy("has_item", has(ModItems.RAW_RUBY.get()))
                .save(p_176532_,"ruby_from_smelting_raw_ruby");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModTags.RUBY_ORES_ITEMS),
                ModItems.RAW_RUBY.get(),1f,200)
                .unlockedBy("has_ore", has(ModTags.RUBY_ORES_ITEMS))
                .save(p_176532_,"raw_ruby_from_smelting_ruby_ores");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModTags.OPAL_ORES_ITEMS),
                        ModItems.OPAL_NUGGET.get(),1f,200)
                .unlockedBy("has_ore", has(ModTags.OPAL_ORES_ITEMS))
                .save(p_176532_,"opal_nugget_from_smelting_opal_ores");

        //blasting recipe
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_RUBY.get()),
                        ModItems.RUBY.get(),1f,100)
                .unlockedBy("has_item", has(ModItems.RAW_RUBY.get()))
                .save(p_176532_,"ruby_from_blasting_raw_ruby");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModTags.RUBY_ORES_ITEMS),
                        ModItems.RAW_RUBY.get(),1f,100)
                .unlockedBy("has_ore", has(ModTags.OPAL_ORES_ITEMS))
                .save(p_176532_,"raw_ruby_from_blasting_ruby_ores");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModTags.OPAL_ORES_ITEMS),
                        ModItems.OPAL_NUGGET.get(),1f,100)
                .unlockedBy("has_ore", has(ModTags.OPAL_ORES_ITEMS))
                .save(p_176532_,"opal_nugget_from_blasting_opal_ores");
    }

}
