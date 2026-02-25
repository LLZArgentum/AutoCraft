/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.llz.autocraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.llz.autocraft.block.PortableCobblestoneGeneratorBlock;
import net.llz.autocraft.block.BasicBlastFurnaceBlock;
import net.llz.autocraft.AutocraftMod;

public class AutocraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AutocraftMod.MODID);
	public static final DeferredBlock<Block> PORTABLE_COBBLESTONE_GENERATOR;
	public static final DeferredBlock<Block> BASIC_BLAST_FURNACE;
	static {
		PORTABLE_COBBLESTONE_GENERATOR = REGISTRY.register("portable_cobblestone_generator", PortableCobblestoneGeneratorBlock::new);
		BASIC_BLAST_FURNACE = REGISTRY.register("basic_blast_furnace", BasicBlastFurnaceBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}