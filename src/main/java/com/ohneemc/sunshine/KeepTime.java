package com.ohneemc.sunshine;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class KeepTime implements Listener {

    private Sunshine plugin;
    public KeepTime(Sunshine sunshine) {
        this.plugin = sunshine;
    }

    @EventHandler (priority = EventPriority.HIGHEST)
    void keepTime(WeatherChangeEvent e){
        try {
            e.setCancelled(true);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
