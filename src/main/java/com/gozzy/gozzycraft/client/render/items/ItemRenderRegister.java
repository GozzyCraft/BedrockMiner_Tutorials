package com.gozzy.gozzycraft.client.render.items;

import com.gozzy.gozzycraft.init.ModItems;
import com.gozzy.gozzycraft.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister 
{
	public static String modid = Reference.MOD_ID;
	
	public static void registerItemRenderer()
	{
		reg(ModItems.tutorialItem);
		reg(ModItems.item_gozzy_head);
	}
	
	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
