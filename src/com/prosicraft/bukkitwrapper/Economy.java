////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:	Economy.java
// Description:	Wrapper for Vaults Economy. Just in case this plugin is not
//		continued anymore...
// Created:	09/10/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

/**
 *
 * @author prosicraft
 */
public class Economy {
	private net.milkbowl.vault.economy.Economy internal = null;
	
	public Economy(net.milkbowl.vault.economy.Economy intrnl) {
		internal = intrnl;
	}
	
	public boolean hasAtLeast(OfflinePlayer p, double amount) {
		return internal.has(p.getInternal(), amount);
	}
	
	public void withdrawPlayer(OfflinePlayer p, double amount) {
		internal.withdrawPlayer(p.getInternal(), amount);
	}
	
	public void depositPlayer(OfflinePlayer p, double amount) {
		internal.depositPlayer(p.getInternal(), amount);
	}
	
	public boolean hasAccount(OfflinePlayer p) {
		return internal.hasAccount(p.getInternal());
	}
	
	public String getName() {
		return internal.getName();
	}
	
	public boolean isEnabled() {
		return internal.isEnabled();
	}
	
	public void createBank(String name, OfflinePlayer owner) {
		internal.createBank(name, owner.getInternal());
	}
	
	public double getBalance(OfflinePlayer p) {
		return internal.getBalance(p.getInternal());
	}
}
