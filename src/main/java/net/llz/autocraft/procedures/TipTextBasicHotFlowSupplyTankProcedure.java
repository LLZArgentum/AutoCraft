package net.llz.autocraft.procedures;

import net.minecraft.network.chat.Component;

public class TipTextBasicHotFlowSupplyTankProcedure {
	public static String execute() {
		return Component.translatable("tiptext.basic_hfst.line1").getString() + "\n" + "\n" + Component.translatable("tiptext.basic_hfst.line2").getString() + "\n" + Component.translatable("tiptext.basic_hfst.line3").getString();
	}
}