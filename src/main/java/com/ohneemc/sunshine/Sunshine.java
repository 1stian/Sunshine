package com.ohneemc.sunshine;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class Sunshine extends JavaPlugin {

    @Override
    public void onDisable(){

    }

    @Override
    public void onEnable(){
        Metrics metrics = new Metrics(this);
        this.getServer().getPluginManager().registerEvents(new KeepTime(this), this);
    }
}
