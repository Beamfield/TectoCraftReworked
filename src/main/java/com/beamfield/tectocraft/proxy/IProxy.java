package com.beamfield.tectocraft.proxy;

import net.minecraft.entity.player.EntityPlayer;

import javax.annotation.Nullable;

public interface IProxy {
	void preInit();

	void init();

	void postInit();

	void doClientRightClick();
	
	@Nullable
	EntityPlayer getClientPlayer();
}
