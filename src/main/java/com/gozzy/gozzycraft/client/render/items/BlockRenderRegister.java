package com.gozzy.gozzycraft.client.render.items;

import com.gozzy.gozzycraft.blocks.BlockProperties;
import com.gozzy.gozzycraft.init.ModBlocks;
import com.gozzy.gozzycraft.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister 
{
	public static String modid = Reference.MOD_ID;
	
	public static void registerBlockRenderer()
	{
		reg(ModBlocks.tutorialBlock);
		reg(ModBlocks.propertyBlock, 0, "block_properties_white");
		reg(ModBlocks.propertyBlock, 1, "block_properties_black");
		reg(ModBlocks.propertyBlock, 2, "block_properties_green");
	}

	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void reg(Block block, int meta, String file)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
	
	public static void preInit()
	{
		ModelBakery.addVariantName(Item.getItemFromBlock(ModBlocks.propertyBlock), "gozzycraft:block_properties_white", "gozzycraft:block_properties_black", "gozzycraft:block_properties_green");
	}
}
