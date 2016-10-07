package com.beamfield.tectocraft.item;

import com.beamfield.tectocraft.TectoCraft;
import com.beamfield.tectocraft.reference.Reference;

import net.minecraft.item.Item;

public class ItemTectoCraft extends Item{
	public ItemTectoCraft(String itemName) {
		setItemName(this, itemName);
		setCreativeTab(TectoCraft.creativeTab);
	}
	public static void setItemName(Item item, String itemName) {
		item.setRegistryName(Reference.MODID, itemName);
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
}
