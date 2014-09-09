////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        JavaPlugin.java
// Description:
// Created:         09/09/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

import java.io.File;

/**
 * Wrapper for Bukkits JavaPlugin class
 *
 * @author prosicraft
 */
public class WrapperPlugin {

	private org.bukkit.plugin.java.JavaPlugin internal = null;

	public void setJavaPlugin(org.bukkit.plugin.java.JavaPlugin intrnl) {
		internal = intrnl;
	}

	// should be overridden
	public void onEnable() {
	}

	// should be overridden
	public void onDisable() {
	}

	// should be overridden
	public boolean onCommand(CommandSender sender, String cmdName, String[] args) {
		return false;
	}

	public Server getServer() {
		return new Server(internal.getServer());
	}

	public PluginDescription getDescription() {
		return new PluginDescription(internal.getDescription());
	}
	
	public org.bukkit.plugin.Plugin getInternalPlugin() {
		return (org.bukkit.plugin.Plugin)internal;
	}
	
	public File getDataFolder() {
		return internal.getDataFolder();
	}
}
