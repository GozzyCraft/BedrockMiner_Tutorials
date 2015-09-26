package com.gozzy.gozzycraft.items;

import com.gozzy.gozzycraft.GozzyCraft;

import net.minecraft.item.Item;

public class ItemBasicItem extends Item 
{
	public ItemBasicItem(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GozzyCraft.GozzyCraft);
	}
}
