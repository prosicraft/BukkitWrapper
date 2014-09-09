////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        YamlConfiguration.java
// Description:
// Created:         09/10/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

import java.io.File;



// Hint: The configuration probably has to be recoded when switching to Sponge!



/**
 *
 * @author prosicraft
 */
public class YamlConfiguration {	
	public static FileConfiguration loadConfiguration(File f) {
		return new FileConfiguration(org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(f));
	}
}
