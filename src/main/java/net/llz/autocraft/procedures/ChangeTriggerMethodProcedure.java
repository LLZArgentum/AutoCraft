package net.llz.autocraft.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.llz.autocraft.init.AutocraftModItems;

public class ChangeTriggerMethodProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		String trigger_return = "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AutocraftModItems.TRIGGER_CORRECTOR.get() && entity.isShiftKeyDown()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip4 ? blockstate.getValue(_getip4) : -1) == 0) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				trigger_return = Component.translatable("info.pcg.triggermethod.change").getString() + "" + Component.translatable("status.pcg.triggermethod.2").getString();
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip9 ? blockstate.getValue(_getip9) : -1) == 1) {
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				trigger_return = Component.translatable("info.pcg.triggermethod.change").getString() + "" + Component.translatable("status.pcg.triggermethod.3").getString();
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip14 ? blockstate.getValue(_getip14) : -1) == 2) {
				{
					int _value = 3;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				trigger_return = Component.translatable("info.pcg.triggermethod.change").getString() + "" + Component.translatable("status.pcg.triggermethod.4").getString();
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip19 ? blockstate.getValue(_getip19) : -1) == 3) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				trigger_return = Component.translatable("info.pcg.triggermethod.change").getString() + "" + Component.translatable("status.pcg.triggermethod.1").getString();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(trigger_return), true);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AutocraftModItems.TRIGGER_CORRECTOR.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip27 ? blockstate.getValue(_getip27) : -1) == 0) {
				trigger_return = Component.translatable("info.pcg.triggermethod.check").getString() + "" + Component.translatable("status.pcg.triggermethod.1").getString();
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip31 ? blockstate.getValue(_getip31) : -1) == 1) {
				trigger_return = Component.translatable("info.pcg.triggermethod.check").getString() + "" + Component.translatable("status.pcg.triggermethod.2").getString();
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip35 ? blockstate.getValue(_getip35) : -1) == 2) {
				trigger_return = Component.translatable("info.pcg.triggermethod.check").getString() + "" + Component.translatable("status.pcg.triggermethod.3").getString();
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("trigger_method") instanceof IntegerProperty _getip39 ? blockstate.getValue(_getip39) : -1) == 3) {
				trigger_return = Component.translatable("info.pcg.triggermethod.check").getString() + "" + Component.translatable("status.pcg.triggermethod.4").getString();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(trigger_return), true);
		}
	}
}