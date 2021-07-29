package com.drrotstein.helloworld;
import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {


        Bukkit.getPluginManager().registerEvents(this, this);
        

        //Bukkit.getWorld("").spawn(new Location(Bukkit.getWorld(""), 1, 2, 3), Sheep.class);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        System.out.println("NEUER SPIELER!!!!");

    }

}
