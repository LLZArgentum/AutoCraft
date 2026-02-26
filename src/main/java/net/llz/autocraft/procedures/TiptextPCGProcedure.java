package net.llz.autocraft.procedures;

import net.minecraft.network.chat.Component;

public class TiptextPCGProcedure {
	public static String execute() {
		return Component.translatable("tiptext.pcg.line1").getString() + "\n" + "\n" + Component.translatable("tiptext.pcg.line2").getString() + "\n" + Component.translatable("tiptext.pcg.line3").getString();
	}
}