////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        PluginDescription.java
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
public class PluginDescription {
	private org.bukkit.plugin.PluginDescriptionFile internal = null;
	
	public PluginDescription(org.bukkit.plugin.PluginDescriptionFile intrnl) {
		internal = intrnl;
	}
	
	public String getVersion() {
		return internal.getVersion();
	}
}
