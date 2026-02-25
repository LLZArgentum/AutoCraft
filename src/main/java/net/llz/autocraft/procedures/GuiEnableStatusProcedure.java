package net.llz.autocraft.procedures;

import net.minecraft.network.chat.Component;

public class GuiEnableStatusProcedure {
	public static String execute() {
		return Component.translatable("gui.portablecobblestonegenerator.enablestatus").getString();
	}
}