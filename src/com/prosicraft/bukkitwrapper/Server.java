////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        Server.java
// Description:
// Created:         09/10/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author prosicraft
 */
public class Server {

	private org.bukkit.Server internal = null;

	public Server(org.bukkit.Server intrnl) {
		internal = intrnl;
	}

	public List<OfflinePlayer> getOfflinePlayers() {
		List<OfflinePlayer> res = new ArrayList<>();
		if (internal == null) {
			return res;
		}

		for (org.bukkit.OfflinePlayer bukkitOfflinePlayer : internal.getOfflinePlayers()) {
			res.add(new OfflinePlayer(bukkitOfflinePlayer));
		}

		return res;
	}
	
	public List<Player> getOnlinePlayers() {
		List<Player> res = new ArrayList<>();
		if (internal == null) {
			return res;
		}		
		
		for (org.bukkit.entity.Player bukkitOnlinePlayer : internal.getOnlinePlayers()) {
			res.add(new Player(bukkitOnlinePlayer));
		}
		
		return res;
	}
				
	public PluginManager getPluginManager() {
		return new PluginManager(internal.getPluginManager());
	}
	
	public void broadcastMessage(String msg) {
		internal.broadcastMessage(msg);
	}
	
	public World getWorld(String name) {
		return new World(internal.getWorld(name));
	}		
	
	public List<World> getWorlds() {
		List<World> res = new ArrayList<>();
		if (internal == null)
			return res;
		
		for (org.bukkit.World bukkitWorld : internal.getWorlds()) {
			res.add(new World(bukkitWorld));
		}
		
		return res;
	}
	
	public OfflinePlayer getOfflinePlayer(UUID id) {
		return new OfflinePlayer(internal.getOfflinePlayer(id));
	}
	
	
	
	
	public org.bukkit.scheduler.BukkitScheduler getBukkitScheduler() {
		return internal.getScheduler();
	}
	
	public org.bukkit.plugin.ServicesManager getBukkitServicesManager() {
		return internal.getServicesManager();
	}		
}
