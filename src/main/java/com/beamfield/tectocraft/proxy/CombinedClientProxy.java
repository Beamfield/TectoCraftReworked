package com.beamfield.tectocraft.proxy;

import net.minecraft.entity.player.EntityPlayer;


import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;

public class CombinedClientProxy implements IProxy{
	
	private final Minecraft MINECRAFT = Minecraft.getMinecraft();

	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doClientRightClick() {
		// TODO Auto-generated method stub
		
	}
	@Nullable
	@Override
	public EntityPlayer getClientPlayer() {
		return MINECRAFT.thePlayer;
	}
	
}
