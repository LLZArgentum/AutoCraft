package net.llz.autocraft.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class ProcessPortableCobblestoneGeneratorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 0) {
			if (blockstate.getBlock().getStateDefinition().getProperty("active_status") instanceof BooleanProperty _getbp3 && blockstate.getValue(_getbp3)) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("enable_status") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
				}
			} else {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("enable_status") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
			}
		} else if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip7 ? blockstate.getValue(_getip7) : -1) == 1) {
			if (blockstate.getBlock().getStateDefinition().getProperty("active_status") instanceof BooleanProperty _getbp9 && blockstate.getValue(_getbp9)) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("enable_status") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
			} else {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("enable_status") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
				}
			}
		}
		if ((blockstate.getBlock().getStateDefinition().getProperty("enable_status") instanceof BooleanProperty _getbp13 && blockstate.getValue(_getbp13)
				|| (blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip15 ? blockstate.getValue(_getip15) : -1) == 2)
				&& !((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip17 ? blockstate.getValue(_getip17) : -1) == 3)) {
			if (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).getCount() < 64) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}