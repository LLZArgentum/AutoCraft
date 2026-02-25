/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.llz.autocraft.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.llz.autocraft.client.gui.GUIPortableCobblestoneGeneratorScreen;

@EventBusSubscriber(Dist.CLIENT)
public class AutocraftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(AutocraftModMenus.GUI_PORTABLE_COBBLESTONE_GENERATOR.get(), GUIPortableCobblestoneGeneratorScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}