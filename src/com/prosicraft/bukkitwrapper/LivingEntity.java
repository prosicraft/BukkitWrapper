////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        LivingEntity.java
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
public class LivingEntity extends Entity {
	private org.bukkit.entity.LivingEntity internal = null;
	
	public LivingEntity(org.bukkit.entity.Entity intrnlEntity) {
		super(intrnlEntity);
	}
	
	public LivingEntity(org.bukkit.entity.LivingEntity intrnl) {
		super((org.bukkit.entity.Entity)intrnl);
		internal = intrnl;				
	}		
	
	@Override
	public void remove() {
		internal.remove();
	}
}
