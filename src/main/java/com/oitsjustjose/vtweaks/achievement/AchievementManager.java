package com.oitsjustjose.vtweaks.achievement;

import com.oitsjustjose.vtweaks.util.Config;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

public class AchievementManager
{
	public static Achievement rebirth;

	public static void initialize()
	{
		if (Config.rebirth)
			rebirth = new Achievement("achievement.rebirth", "rebirth", 7, 15, Items.experience_bottle, AchievementList.spawnWither).setSpecial().registerStat();
	}
}