/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.llz.autocraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.llz.autocraft.item.TriggerCorrectorItem;
import net.llz.autocraft.item.IronPlateItem;
import net.llz.autocraft.item.IronForgingHammerItem;
import net.llz.autocraft.item.GoldPlateItem;
import net.llz.autocraft.item.BaseAlloyPlateItem;
import net.llz.autocraft.AutocraftMod;

public class AutocraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AutocraftMod.MODID);
	public static final DeferredItem<Item> PORTABLE_COBBLESTONE_GENERATOR;
	public static final DeferredItem<Item> TRIGGER_CORRECTOR;
	public static final DeferredItem<Item> IRON_PLATE;
	public static final DeferredItem<Item> GOLD_PLATE;
	public static final DeferredItem<Item> IRON_FORGING_HAMMER;
	public static final DeferredItem<Item> BASE_ALLOY_PLATE;
	public static final DeferredItem<Item> BASIC_BLAST_FURNACE;
	static {
		PORTABLE_COBBLESTONE_GENERATOR = block(AutocraftModBlocks.PORTABLE_COBBLESTONE_GENERATOR, new Item.Properties().fireResistant());
		TRIGGER_CORRECTOR = REGISTRY.register("trigger_corrector", TriggerCorrectorItem::new);
		IRON_PLATE = REGISTRY.register("iron_plate", IronPlateItem::new);
		GOLD_PLATE = REGISTRY.register("gold_plate", GoldPlateItem::new);
		IRON_FORGING_HAMMER = REGISTRY.register("iron_forging_hammer", IronForgingHammerItem::new);
		BASE_ALLOY_PLATE = REGISTRY.register("base_alloy_plate", BaseAlloyPlateItem::new);
		BASIC_BLAST_FURNACE = block(AutocraftModBlocks.BASIC_BLAST_FURNACE);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}