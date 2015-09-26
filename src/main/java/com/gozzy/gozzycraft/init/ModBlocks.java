package com.gozzy.gozzycraft.init;

import com.gozzy.gozzycraft.blocks.BasicBlock;
import com.gozzy.gozzycraft.blocks.BlockProperties;
import com.gozzy.gozzycraft.blocks.ItemBlockMeta;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks 
{
	public static Block tutorialBlock;
	//public static BlockProperties propertiesBlock = new BlockProperties("block_properties", Material.rock, 3.0f, 3.0f);
	public static BlockProperties propertyBlock;
	
	public static void createBlocks() {
	    GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block");
	    //GameRegistry.registerBlock(BlockProperties.propertiesBlock, ItemBlockMeta.class, "block_properties");
	    GameRegistry.registerBlock(propertyBlock = new BlockProperties("block_properties", Material.rock, 3.0f, 3.0f), ItemBlockMeta.class, "block_properties");
	}
}
