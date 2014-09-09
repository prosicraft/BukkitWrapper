/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prosicraft.bukkitwrapper;

/**
 *
 * @author prosicraft
 */
public enum EntityType {
	DROPPED_ITEM,
	EXPERIENCE_ORB,
	LEASH_HITCH,
	PAINTING,
	ARROW,
	SNOWBALL,
	FIREBALL,
	SMALL_FIREBALL,
	ENDER_PEARL,
	ENDER_SIGNAL,
	THROWN_EXP_BOTTLE,
	ITEM_FRAME,
	WITHER_SKULL,
	PRIMED_TNT,
	FALLING_BLOCK,
	FIREWORK,
	BOAT,
	MINECART,
	MINECART_COMMAND,		
	MINECART_CHEST,
	MINECART_FURNACE,
	MINECART_TNT,
	MINECART_HOPPER,
	MINECART_MOB_SPAWNER,
	COMPLEX_PART,
	ENDER_CRYSTAL,
	SPLASH_POTION,
	EGG,
	FISHING_HOOK,
	
	CREEPER,
	SKELETON,
	SPIDER,
	GIANT,
	ZOMBIE,
	SLIME,
	GHAST,
	PIG_ZOMBIE,
	ENDERMAN,
	CAVE_SPIDER,
	SILVERFISH,
	BLAZE,
	MAGMA_CUBE,
	ENDER_DRAGON,
	WITHER,
	BAT,
	WITCH,
	PIG,
	SHEEP,
	COW,
	CHICKEN,
	SQUID,
	WOLF,
	MUSHROOM_COW,
	SNOWMAN,
	OCELOT,
	IRON_GOLEM,
	HORSE,
	VILLAGER,
	PLAYER,	
	
	LIGHTNING,
	WEATHER,
	
	
	UNKNOWN;
	
	
	public boolean equalsBukkitEntityType(org.bukkit.entity.EntityType ty) {
		return name().equalsIgnoreCase(ty.name());
	}
}
