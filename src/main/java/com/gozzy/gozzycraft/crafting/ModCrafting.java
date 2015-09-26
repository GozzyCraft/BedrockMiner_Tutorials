package com.gozzy.gozzycraft.crafting;

import com.gozzy.gozzycraft.init.ModBlocks;
import com.gozzy.gozzycraft.init.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting 
{
	public static void initCrafting()
	{
		//With Array
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[] {"##", "##", '#', ModItems.tutorialItem});
		
		//without Array
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), "##", "##", '#', ModItems.tutorialItem);
		
		// 4 Items of the tutorialItem -> tutorialBlock
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[] {"##", "##", '#', ModItems.tutorialItem});
		
		// 1 lapis and 1 redstone (shaplpess) -> tutorialItem
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[] {Items.redstone, new ItemStack(Items.dye, 1, 4)});
		
		// smelting a Diamond gives a tutorialItem back
		GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.tutorialItem), 1.0F);
		
		
		
	}
}
