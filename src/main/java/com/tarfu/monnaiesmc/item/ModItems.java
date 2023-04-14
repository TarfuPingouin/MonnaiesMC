package com.tarfu.monnaiesmc.item;

import com.tarfu.monnaiesmc.MonnaiesMc;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MonnaiesMc.MOD_ID);

    public static final RegistryObject<Item> PIECE_BRONZE = ITEMS.register("piece_bronze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIECE_ARGENT = ITEMS.register("piece_argent",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIECE_OR = ITEMS.register("piece_or",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
