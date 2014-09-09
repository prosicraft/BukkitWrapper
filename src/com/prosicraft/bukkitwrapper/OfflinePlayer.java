////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        OfflinePlayer.java
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
public class OfflinePlayer {

	private org.bukkit.OfflinePlayer internal;

	public OfflinePlayer(OfflinePlayer o) {
		internal = o.internal;
	}

	public OfflinePlayer(org.bukkit.OfflinePlayer intrnl) {
		internal = intrnl;
	}

	public boolean isOnlinePlayer() {
		return internal != null && (internal instanceof org.bukkit.entity.Player);
	}
	
	public Player getPlayer() {
		if (!isOnlinePlayer()) {
			return null;
		}

		return new Player((org.bukkit.entity.Player) internal);
	}

	public String getName() {
		return internal.getName();
	}

	// use this as rarely as possible!
	public org.bukkit.OfflinePlayer getInternal() {
		return internal;
	}
	
	public UUID getUniqueId() {
		return internal.getUniqueId();
	}
}
