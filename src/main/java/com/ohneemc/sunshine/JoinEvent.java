package com.ohneemc.sunshine;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    private Sunshine plugin;
    public JoinEvent(Sunshine plugin){this.plugin = plugin;}

    @EventHandler
    void setTime(PlayerJoinEvent e){
        e.getPlayer().getWorld().setTime(plugin.time);
    }
}
