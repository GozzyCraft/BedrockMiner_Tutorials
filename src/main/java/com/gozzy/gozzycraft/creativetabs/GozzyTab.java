package com.gozzy.gozzycraft.creativetabs;

import com.gozzy.gozzycraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class GozzyTab extends CreativeTabs{

	public GozzyTab(String label) 
	{
		super(label);
		this.setBackgroundImageName("gozzycraft.png");
		this.setNoTitle();
	}

	@Override
	public Item getTabIconItem() 
	{
		return ModItems.item_gozzy_head;
	}

}
