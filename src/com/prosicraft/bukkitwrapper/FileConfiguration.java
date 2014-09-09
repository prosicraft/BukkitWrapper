////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        FileConfiguration.java
// Description:
// Created:         09/10/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

import java.io.File;
import java.io.IOException;



// Hint: The configuration probably has to be recoded when switching to Sponge!



/**
 * 
 * @author prosicraft
 */
public class FileConfiguration {
	private org.bukkit.configuration.file.FileConfiguration internal = null;
	
	public FileConfiguration(org.bukkit.configuration.file.FileConfiguration intrnl) {
		internal = intrnl;
	}
	
	public boolean isConfigurationSection(String node) {
		return internal.isConfigurationSection(node);
	}
	
	public ConfigurationSection getConfigurationSection(String node) {
		return new ConfigurationSection(internal.getConfigurationSection(node));
	}
	
	public void save(File f) throws IOException {		
		internal.save(f);
	}
	
	public void set(String node, Object val) {
		internal.set(node, val);
	}
	
	public int getInt(String node, int def) {
		return internal.getInt(node, def);
	}
	
	public int getInt(String node) {
		return internal.getInt(node);
	}
	
	public double getDouble(String node, double def) {
		return internal.getDouble(node, def);		
	}
	
	public double getDouble(String node) {
		return internal.getDouble(node);
	}
	
	public String getString(String node, String def) {
		return internal.getString(node, def);
	}
	
	public String getString(String node) {
		return internal.getString(node);
	}
	
	public boolean getBoolean(String node, boolean def) {
		return internal.getBoolean(node, def);
	}
	
	public boolean getBoolean(String node) {
		return internal.getBoolean(node);
	}
	
	public long getLong(String node, long def) {
		return internal.getLong(node, def);
	}
	
	public long getLong(String node) {
		return internal.getLong(node);
	}
	
	public boolean isInt(String node) {
		return internal.isInt(node);
	}
	
	public boolean isDouble(String node) {
		return internal.isDouble(node);
	}
	
	public boolean isString(String node) {
		return internal.isString(node);
	}
	
	public boolean isBoolean(String node) {
		return internal.isBoolean(node);
	}
	
	public boolean isLong(String node) {
		return internal.isLong(node);
	}
}
