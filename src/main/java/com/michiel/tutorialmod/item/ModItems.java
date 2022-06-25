package com.michiel.tutorialmod.item;

import com.michiel.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEM_TAB)));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEM_TAB)));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEM_TAB)));
    public static final RegistryObject<Item> OPAL_NUGGET = ITEMS.register("opal_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEM_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
