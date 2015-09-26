package com.gozzy.gozzycraft.proxy;

import com.gozzy.gozzycraft.crafting.ModCrafting;
import com.gozzy.gozzycraft.init.ModBlocks;
import com.gozzy.gozzycraft.init.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModItems.createItems();
    	ModBlocks.createBlocks();
    }
    
    public void init(FMLInitializationEvent event) 
    {
    	ModCrafting.initCrafting();
    }

    public void postInit(FMLPostInitializationEvent event) 
    {

    }

}
