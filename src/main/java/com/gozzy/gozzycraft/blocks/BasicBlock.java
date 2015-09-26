package com.gozzy.gozzycraft.blocks;

import com.gozzy.gozzycraft.GozzyCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block 
{

	public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setCreativeTab(GozzyCraft.GozzyCraft);
	}
	
	public BasicBlock(String unlocalizedName, float hardness, float resistance) 
	{
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public BasicBlock(String unlocalizedName) 
    {
        this(unlocalizedName, 2.0f, 10.0f);
    }

}
