package com.beamfield.tectocraft;

import com.beamfield.tectocraft.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabTectoCraft extends CreativeTabs{
	private final Item iconItem;

	public CreativeTabTectoCraft() {
		super(Reference.MODID);
		iconItem = (Items.RECORD_CAT);
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Items.RECORD_CAT;
	}

}
