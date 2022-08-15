package net.ccbluex.liquidbounce.utils;

import de.enzaxd.viaforge.ViaForge;

public class FixEngine {
    /**
     * Fix for right-clicking
     * Made by vlouboos
     */
    public static boolean fixRightClick() {
        return ViaForge.getInstance().getVersion() > 47;
    }
}