package com.oitsjustjose.vtweaks.util;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.oitsjustjose.vtweaks.VTweaks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ConfigGUI extends GuiConfig
{
	public ConfigGUI(GuiScreen guiScreen)
	{
		super(guiScreen, getConfigElements(), VTweaks.MODID, false, false, GuiConfig.getAbridgedConfigPath(VTweaks.config.config.toString()));
	}

	private static List<IConfigElement> getConfigElements()
	{
		List<IConfigElement> list = Lists.newArrayList();

		list.add(new ConfigElement(VTweaks.config.MobTweaks));
		list.add(new ConfigElement(VTweaks.config.Enchantments));
		list.add(new ConfigElement(VTweaks.config.BlockTweaks));
		list.add(new ConfigElement(VTweaks.config.ItemTweaks));
		list.add(new ConfigElement(VTweaks.config.MiscFeatures));

		return list;
	}

	public static class GUIFactory implements IModGuiFactory
	{
		@Override
		public void initialize(Minecraft minecraftInstance)
		{
			
		}

		@Override
		public Class<? extends GuiScreen> mainConfigGuiClass()
		{
			return ConfigGUI.class;
		}

		@Override
		public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
		{
			return null;
		}

		@Override
		@SuppressWarnings("deprecation")
		public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
		{
			return null;
		}
	}
}