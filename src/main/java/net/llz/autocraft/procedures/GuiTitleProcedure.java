package net.llz.autocraft.procedures;

import net.minecraft.network.chat.Component;

public class GuiTitleProcedure {
	public static String execute() {
		return Component.translatable("gui.portablecobblestonegenerator.title").getString();
	}
}