////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        PlayerMoveEvent.java
// Description:
// Created:         09/10/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

/**
 *
 * @author prosicraft
 */
public class PlayerMoveEvent {

	private org.bukkit.event.player.PlayerMoveEvent internal = null;

	public PlayerMoveEvent(org.bukkit.event.player.PlayerMoveEvent intrnl) {
		internal = intrnl;
	}

	public Player getPlayer() {
		return new Player(internal.getPlayer());
	}

	public boolean isCancelled() {
		return internal.isCancelled();
	}

	public void setCancelled(boolean state) {
		internal.setCancelled(state);
	}

	public Location getTo() {
		return new Location(internal.getTo());
	}

	public Location getFrom() {
		return new Location(internal.getFrom());
	}
}
