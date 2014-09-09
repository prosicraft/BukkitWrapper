////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        CommandSender.java
// Description:
// Created:         09/09/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

/**
 *
 * @author prosicraft
 */
public class CommandSender {

	private org.bukkit.command.CommandSender internal = null;

	public CommandSender(CommandSender o) {
		internal = o.internal;
	}

	public CommandSender(org.bukkit.command.CommandSender intrnl) {
		internal = intrnl;
	}

	public boolean isPlayer() {
		return internal != null && (internal instanceof org.bukkit.entity.Player);
	}

	public Player toPlayer() {
		if (!isPlayer()) {
			return null;
		}

		return new Player((org.bukkit.entity.Player) internal);
	}

	public void sendMessage(String msg) {
		internal.sendMessage(msg);
	}

	public boolean isConsole() {
		return (internal instanceof org.bukkit.command.ConsoleCommandSender);
	}
}
