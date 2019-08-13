package com.ohneemc.sunshine;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class KeepTime implements Listener {

    public KeepTime(Sunshine sunshine) {
    }

    @EventHandler
    void keepTime(WeatherChangeEvent e){
        e.getWorld().setWeatherDuration(0);
        e.getWorld().setTime(4303);
    }
}
