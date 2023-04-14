package com.tarfu.monnaiesmc.item;

import com.tarfu.monnaiesmc.MonnaiesMc;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MonnaiesMc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MONNAIES_TAB;

    @SubscribeEvent
    public static void RegisterCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MONNAIES_TAB = event.registerCreativeModeTab( new ResourceLocation(MonnaiesMc.MOD_ID, "monnaies_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.PIECE_OR.get())).title(Component.translatable("creativemodetab.monnaies_tab")));
    }
}
