////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        Chunk.java
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
public class Chunk {

	private org.bukkit.Chunk internal = null;

	public Chunk(org.bukkit.Chunk intrnl) {
		internal = intrnl;
	}

	public int getX() {
		return internal.getX();
	}
	
	public int getZ() {
		return internal.getZ();
	}
}
