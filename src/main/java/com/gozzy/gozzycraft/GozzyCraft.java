package com.gozzy.gozzycraft;

import com.gozzy.gozzycraft.creativetabs.GozzyTab;
import com.gozzy.gozzycraft.proxy.CommonProxy;
import com.gozzy.gozzycraft.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class GozzyCraft
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final GozzyTab GozzyCraft = new GozzyTab("GozzyCraft");
	
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	this.proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	this.proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	this.proxy.postInit(event);
    }
}
