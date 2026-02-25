package net.llz.autocraft.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class IronForgingHammerItem extends Item {
	public IronForgingHammerItem() {
		super(new Item.Properties().durability(160));
	}

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}