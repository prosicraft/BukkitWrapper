////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        Location.java
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
public class Location {

	private org.bukkit.Location internal = null;

	public Location(org.bukkit.Location intrnl) {
		internal = intrnl;
	}
	
	public Location(World w, double x, double y, double z, float pitch, float yaw) {
		internal = new org.bukkit.Location(w.getInternal(), x, y, z, pitch, yaw);
	}
	
	public Location(World w, double x, double y, double z) {
		internal = new org.bukkit.Location(w.getInternal(), x, y, z);
	}
	
	public org.bukkit.Location getInternal() {
		return internal;
	}

	public double getX() {
		return internal.getX();
	}

	public double getY() {
		return internal.getY();
	}

	public double getZ() {
		return internal.getZ();
	}
	
	public float getPitch() {
		return internal.getPitch();
	}
	
	public float getYaw() {
		return internal.getYaw();
	}

	public int getBlockX() {
		return internal.getBlockX();
	}

	public int getBlockY() {
		return internal.getBlockY();
	}

	public int getBlockZ() {
		return internal.getBlockZ();
	}

	public Chunk getChunk() {
		return new Chunk(internal.getChunk());
	}

	public World getWorld() {
		return new World(internal.getWorld());
	}		
}
