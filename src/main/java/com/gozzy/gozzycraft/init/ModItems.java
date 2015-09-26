package com.gozzy.gozzycraft.init;

import com.gozzy.gozzycraft.items.ItemBasicItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems
{
	public static Item tutorialItem;
	public static Item item_gozzy_head;
	
	public static void createItems()
	{
		GameRegistry.registerItem(tutorialItem = new ItemBasicItem("tutorial_item"), "tutorial_item");
		GameRegistry.registerItem(item_gozzy_head = new ItemBasicItem("item_gozzy_head"), "item_gozzy_head");		
	}
}
