////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        Player.java
// Description:
// Created:         09/09/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

import java.util.UUID;

/**
 *
 * @author prosicraft
 */
public class Player {

	private org.bukkit.entity.Player internal = null;

	public Player(Player o) {
		internal = o.internal;
	}

	public Player(org.bukkit.entity.Player intrnl) {
		internal = intrnl;
	}

	public OfflinePlayer getOfflinePlayer() {
		if (internal == null || !(internal instanceof org.bukkit.OfflinePlayer)) {
			return null;
		}

		return new OfflinePlayer((org.bukkit.OfflinePlayer) internal);
	}

	public void sendMessage(String msg) {
		internal.sendMessage(msg);
	}

	public boolean hasPermission(String perm) {
		return internal.hasPermission(perm);
	}

	public boolean isOp() {
		return internal.isOp();
	}

	public String getName() {
		return internal.getName();
	}

	public Location getLocation() {
		return new Location(internal.getLocation());
	}
	
	public World getWorld() {
		return new World(internal.getWorld());
	}
	
	public void teleport(Location l) {
		internal.teleport(l.getInternal());
	}
	
	public UUID getUniqueId() {
		return internal.getUniqueId();
	}
	
	public CommandSender getCommandSender() {
		return new CommandSender((org.bukkit.command.CommandSender)internal);
	}
}
