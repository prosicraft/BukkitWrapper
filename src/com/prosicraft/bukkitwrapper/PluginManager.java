////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        PluginManager.java
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
public class PluginManager {
	private org.bukkit.plugin.PluginManager internal = null;
	
	public PluginManager(org.bukkit.plugin.PluginManager intrnl) {
		internal = intrnl;
	}
	
	public void registerEvents(org.bukkit.event.Listener l, WrapperPlugin p) {		
		internal.registerEvents(l, p.getInternalPlugin());
	}
}
