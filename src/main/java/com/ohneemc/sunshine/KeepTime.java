package com.ohneemc.sunshine;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class KeepTime implements Listener {

    public KeepTime(Sunshine sunshine) {
    }

    @EventHandler
    void keepTime(WeatherChangeEvent e){
        try {
            e.getWorld().setStorm(false);
            e.getWorld().setThundering(false);
            e.getWorld().setTime(4303);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
