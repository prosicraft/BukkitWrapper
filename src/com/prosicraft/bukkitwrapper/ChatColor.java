////////////////////////////////////////////////////////////////////////////////
//
// BukkitWrapper Source File
// Copyright (c) 2014, prosicraft
// ----------------------------------------------------------------------------
// Filename:        ChatColor.java
// Description:
// Created:         09/09/2014 by prosicraft
// ----------------------------------------------------------------------------
// History:
//
////////////////////////////////////////////////////////////////////////////////

package com.prosicraft.bukkitwrapper;

/**
 * Wrapper for Bukkits ChatColor Enumeration. We use a rewrite as a class here!
 *
 * @author prosicraft
 */
public class ChatColor {

	public static final char COLOR_CHAR = '\u00A7';

	public static String BLACK = new String(new char[]{COLOR_CHAR, '0'});
	public static String DARK_BLUE = new String(new char[]{COLOR_CHAR, '1'});
	public static String DARK_GREEN = new String(new char[]{COLOR_CHAR, '2'});
	public static String DARK_AQUA = new String(new char[]{COLOR_CHAR, '3'});
	public static String DARK_RED = new String(new char[]{COLOR_CHAR, '4'});
	public static String DARK_PURPLE = new String(new char[]{COLOR_CHAR, '5'});
	public static String GOLD = new String(new char[]{COLOR_CHAR, '6'});
	public static String GRAY = new String(new char[]{COLOR_CHAR, '7'});
	public static String DARK_GRAY = new String(new char[]{COLOR_CHAR, '8'});
	public static String BLUE = new String(new char[]{COLOR_CHAR, '9'});
	public static String GREEN = new String(new char[]{COLOR_CHAR, 'a'});
	public static String AQUA = new String(new char[]{COLOR_CHAR, 'b'});
	public static String RED = new String(new char[]{COLOR_CHAR, 'c'});
	public static String LIGHT_PURPLE = new String(new char[]{COLOR_CHAR, 'd'});
	public static String YELLOW = new String(new char[]{COLOR_CHAR, 'e'});
	public static String WHITE = new String(new char[]{COLOR_CHAR, 'f'});
	public static String MAGIC = new String(new char[]{COLOR_CHAR, 'k'});
	public static String BOLD = new String(new char[]{COLOR_CHAR, 'l'});
	public static String STRIKETHROUGH = new String(new char[]{COLOR_CHAR, 'm'});
	public static String UNDERLINE = new String(new char[]{COLOR_CHAR, 'n'});
	public static String ITALIC = new String(new char[]{COLOR_CHAR, 'o'});
	public static String RESET = new String(new char[]{COLOR_CHAR, 'r'});

	private String val = WHITE;

	public ChatColor() {
		val = WHITE;
	}

	public ChatColor(ChatColor o) {
		val = o.val;
	}
}
