package com.beamfield.tectocraft.init;

import com.beamfield.tectocraft.TectoCraft;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.relauncher.Side;

public class ModMessages {
	private static int messageID = 0;
	public static void registerMessages(){
		
	}
	private static <REQ extends IMessage, REPLY extends IMessage> void registerMessage(Class<? extends IMessageHandler<REQ, REPLY>> messageHandler, Class<REQ> requestMessageType, Side receivingSide) {
		TectoCraft.network.registerMessage(messageHandler, requestMessageType, messageID++, receivingSide);
	}
}
