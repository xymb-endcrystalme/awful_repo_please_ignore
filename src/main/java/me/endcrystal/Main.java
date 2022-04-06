package me.endcrystal;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.entity.Player;
import org.bukkit.World.Environment;
import org.bukkit.block.Hopper;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.minecart.StorageMinecart;
import org.bukkit.entity.minecart.HopperMinecart;

import java.util.Map;
import java.util.HashSet;
import java.util.ArrayList;
import org.bukkit.configuration.file.FileConfiguration;
import com.github.puregero.multilib.MultiLib;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends JavaPlugin {
    public static Main getPlugin() {
        return (Main) getPlugin(Main.class);
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player p : Bukkit.getOnlinePlayers()) {
                    p.setViewDistance(ThreadLocalRandom.current().nextInt(24) + 8);
                }
            }
        }.runTaskTimer(this, 0L, 100L); // TODO
    }
}