/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.llz.autocraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.llz.autocraft.AutocraftMod;

public class AutocraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AutocraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB_MACHINE = REGISTRY.register("tab_machine",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.autocraft.tab_machine")).icon(() -> new ItemStack(AutocraftModBlocks.PORTABLE_COBBLESTONE_GENERATOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AutocraftModBlocks.PORTABLE_COBBLESTONE_GENERATOR.get().asItem());
				tabData.accept(AutocraftModBlocks.BASIC_BLAST_FURNACE.get().asItem());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB_TOOL = REGISTRY.register("tab_tool",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.autocraft.tab_tool")).icon(() -> new ItemStack(AutocraftModItems.IRON_FORGING_HAMMER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AutocraftModItems.TRIGGER_CORRECTOR.get());
				tabData.accept(AutocraftModItems.IRON_FORGING_HAMMER.get());
			}).withTabsBefore(TAB_MACHINE.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB_MATERIAL = REGISTRY.register("tab_material",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.autocraft.tab_material")).icon(() -> new ItemStack(AutocraftModItems.BASE_ALLOY_PLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AutocraftModItems.IRON_PLATE.get());
				tabData.accept(AutocraftModItems.GOLD_PLATE.get());
				tabData.accept(AutocraftModItems.BASE_ALLOY_PLATE.get());
			}).withTabsBefore(TAB_TOOL.getId()).build());
}