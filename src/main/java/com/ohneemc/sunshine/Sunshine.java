package com.ohneemc.sunshine;

import de.leonhard.storage.Toml;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class Sunshine extends JavaPlugin {

    private Toml settings = new Toml("settings", getDataFolder().toString());
    private Toml pSet(){return settings;}

    public int time = 4303;

    @Override
    public void onDisable(){

    }

    @Override
    public void onEnable(){
        Metrics metrics = new Metrics(this);

        //Set defaults
        pSet().setDefault("Sunshine.TickToKeep", 4303);

        //Load settings
        if (loadSettings()) getServer().getLogger().info("Settings loaded! Tick to keep: " + time);

        //Events
        this.getServer().getPluginManager().registerEvents(new KeepTime(this), this);
        this.getServer().getPluginManager().registerEvents(new JoinEvent(this), this);
    }

    private boolean loadSettings(){
        try{
            pSet().getInt("Sunshine.TickToKeep");
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
