////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        World.java
// Description:
// Created:         09/10/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prosicraft
 */
public class World {
	private org.bukkit.World internal = null;
	
	public World(org.bukkit.World intrnl) {
		internal = intrnl;
	}		
	
	public org.bukkit.World getInternal() {
		return internal;
	}
	
	public String getName() {
		return internal.getName();
	}
	
	public List<LivingEntity> getLivingEntities() {
		List<LivingEntity> res = new ArrayList<>();
		if (internal == null)
			return res;
		
		for (org.bukkit.entity.LivingEntity bukkitLivingEntity : internal.getLivingEntities()) {
			res.add(new LivingEntity(bukkitLivingEntity));
		}
		
		return res;
	}
	
	public Location getSpawnLocation() {
		return new Location(internal.getSpawnLocation());
	}
	
	public int getHighestBlockYAt(int x, int z) {
		return internal.getHighestBlockYAt(x, z);
	}
}
