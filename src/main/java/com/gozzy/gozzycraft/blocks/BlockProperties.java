package com.gozzy.gozzycraft.blocks;

import java.util.List;
import java.util.Random;

import com.gozzy.gozzycraft.GozzyCraft;
import com.gozzy.gozzycraft.init.ModBlocks;
import com.gozzy.gozzycraft.init.ModItems;
import com.gozzy.gozzycraft.proberties.BlockPropertiesProperties;
import com.gozzy.gozzycraft.proberties.BlockPropertiesProperties.EnumType;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockProperties extends Block implements IMetaBlockName
{
	public static final PropertyEnum TYPE = PropertyEnum.create("type", BlockPropertiesProperties.EnumType.class);
	
	public BlockProperties(String unloclaizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unloclaizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setCreativeTab(GozzyCraft.GozzyCraft);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.WHITE));
	}
	
	/**
	 * This methods returns a BlockState which contains every property the block has
	 */
	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[]{TYPE});
	}
	
	/**
	 * The next two methods are used to convert a IBlockState into metadata and the other way round
	 */
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState et = null;
		
		switch (meta)
		{
		case 0: et = getDefaultState().withProperty(TYPE, EnumType.WHITE);
		break;
		case 1: et = getDefaultState().withProperty(TYPE, EnumType.BLACK);
		break;
		case 2: et = getDefaultState().withProperty(TYPE, EnumType.GREEN);
		break;
		}
		return et;
		//return getDefaultState().withProperty(TYPE, meta == 0 ? EnumType.WHITE : EnumType.BLACK);
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumType type = (EnumType) state.getValue(TYPE);
		return type.getID();
	}
	
	/**
	 * The next method makes the Block appear in both states in the creative tab
	 */
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list)
	{
		list.add(new ItemStack(item, 1, 0)); // Meat 0
		list.add(new ItemStack(item, 1, 1)); // Meat 1
		list.add(new ItemStack(item, 1, 2)); // Meat 2
	}

	@Override
	public String getSpecialName(ItemStack stack) 
	{
		int meta = stack.getItemDamage();
		switch (meta)
		{
		case 0: return "white";
		case 1: return "black";
		case 2: return "green";
		default: return "invalid";
		
		}
		
		//return stack.getItemDamage() == 0 ? "white" : "black";
	}
	
	/**
	 * The next class is for the pick block behaviour to get the block with the right meta data
	 */
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
	}
}


