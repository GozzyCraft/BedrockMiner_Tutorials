package com.gozzy.gozzycraft.proberties;

import net.minecraft.util.IStringSerializable;

public class BlockPropertiesProperties 
{
	public enum EnumType implements IStringSerializable
	{
		WHITE(0, "white"),
		BLACK(1, "black"),
		GREEN(2, "green");
		
		private int ID;
		private String name;
		
		private EnumType(int ID, String name)
		{
			this.ID = ID;
			this.name = name;
		}
			
		@Override
		public String getName() 
		{
			return name;
		}
		
		public int getID()
		{
			return ID;
		}
		
		@Override
		public String toString() 
		{
		    return getName();
		}
	}
}
