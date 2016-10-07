package com.beamfield.tectocraft.init;

import java.util.HashSet;
import java.util.Set;

import com.beamfield.tectocraft.item.ItemTectoniumShard;
import com.beamfield.tectocraft.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

@ObjectHolder(Reference.MODID)
public class ModItems {
	public static class ArmorMaterials {
		//public static final ItemArmor.ArmorMaterial ARMOUR_MATERIAL_REPLACEMENT = EnumHelper.addArmorMaterial(Constants.RESOURCE_PREFIX + "replacement", Constants.RESOURCE_PREFIX + "replacement", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, (float) 0);
	}

	public static class ToolMaterials {
		//public static final Item.ToolMaterial TOOL_MATERIAL_GLOWSTONE = EnumHelper.addToolMaterial("glowstone", 1, 5, 0.5f, 1.0f, 10);
	}
	
	@ObjectHolder("tectonium_shard")
	public static final ItemTectoniumShard TECTONIUM_SHARD = new ItemTectoniumShard("tectonium_shard");
	public static void initialiseItems() {
		
	}
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		public static final Set<Item> ITEMS = new HashSet<>();
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			final Item[] items = {
					TECTONIUM_SHARD
			};

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final Item item : items) {
				registry.register(item);
				ITEMS.add(item);
			}
		}
	}
}
