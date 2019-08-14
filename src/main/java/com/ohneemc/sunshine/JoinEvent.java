package com.ohneemc.sunshine;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    public JoinEvent(Sunshine sunshine) {
    }

    @EventHandler
    void setTime(PlayerJoinEvent e){
        e.getPlayer().getWorld().setTime(4303);
    }
}
