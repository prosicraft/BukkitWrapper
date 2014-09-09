////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        Entity.java
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
public class Entity {
	private org.bukkit.entity.Entity internal = null;
	
	public Entity(org.bukkit.entity.Entity intrnl) {
		internal = intrnl;
	}
	
	public Location getLocation() {
		return new Location(internal.getLocation());
	}
	
	public EntityType getType() {
		return EntityType.valueOf(internal.getType().name());
	}
	
	public void remove() {
		internal.remove();
	}
}
