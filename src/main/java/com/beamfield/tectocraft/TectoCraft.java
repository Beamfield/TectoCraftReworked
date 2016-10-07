package com.beamfield.tectocraft;

import java.util.UUID;

import com.beamfield.tectocraft.init.ModBlocks;
import com.beamfield.tectocraft.init.ModCapabilities;
import com.beamfield.tectocraft.init.ModItems;
import com.beamfield.tectocraft.init.ModMessages;
import com.beamfield.tectocraft.init.ModRecipes;
import com.beamfield.tectocraft.proxy.IProxy;
import com.beamfield.tectocraft.reference.Reference;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
@Mod(modid = Reference.MODID, name = Reference.MODNAME, acceptedMinecraftVersions = "[1.10.2]", guiFactory = "beamfield.tectocraft.config.GuiConfigFactoryTectoCraft")
public class TectoCraft {
	public static final CreativeTabTectoCraft creativeTab = new CreativeTabTectoCraft();
	
	
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Logger.setLogger(event.getModLog());
		FMLLog.bigWarning("Random UUID: %s", UUID.randomUUID().toString());
		ModCapabilities.registerCapabilities();
		ModMessages.registerMessages();
		//ModBlocks.registerTileEntities();
		ModItems.initialiseItems();
		proxy.preInit();
		}
	
	@SidedProxy(clientSide = "com.beamfield.tectocraft.proxy.CombinedClientProxy", serverSide = "beamfield.tectocraft.proxy.DedicatedServerProxy")
	public static IProxy proxy;
	@Instance(Reference.MODID)
	public static TectoCraft instance;
	public static SimpleNetworkWrapper network;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//ModRecipes.registerRecipes();
		//ModRecipes.removeCraftingRecipes();
		//ModMapGen.registerWorldGenerators();
		//ModEntities.addSpawns();

		//NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		FMLInterModComms.sendMessage("Waila", "register", "beamfield.tectocraft.compat.waila.WailaCompat.register");

		proxy.init();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		proxy.postInit();

	}
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
	}
}
	