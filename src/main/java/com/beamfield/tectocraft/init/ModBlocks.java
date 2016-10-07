package com.beamfield.tectocraft.init;

import java.util.HashSet;
import java.util.Set;

import com.beamfield.tectocraft.reference.Reference;
import com.beamfield.tectocraft.util.Constants;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

@ObjectHolder(Reference.MODID)
public class ModBlocks {
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<ItemBlock>();
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			final IForgeRegistry<Block> registry = event.getRegistry();
		}
		@SubscribeEvent
		public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
			
		}
		public static void registerTileEntities() {
		}
		private static void registerTileEntity(Class<? extends TileEntity> tileEntityClass) {
			GameRegistry.registerTileEntity(tileEntityClass, Constants.RESOURCE_PREFIX + tileEntityClass.getSimpleName().replaceFirst("TileEntity", ""));
		}
	}
}
