package net.llz.autocraft.procedures;

import net.minecraft.network.chat.Component;

public class TipTextTriggerCorrectorProcedure {
	public static String execute() {
		return Component.translatable("tiptext.trigger_corrector.line1").getString() + "\n" + Component.translatable("tiptext.trigger_corrector.line2").getString();
	}
}