package me.Hald91;

import me.Hald91.Commands.CommandManager;
import me.Hald91.GUI.GuiBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.logging.Logger;

public class Main extends JavaPlugin {

    public FileConfiguration config = getConfig();
    public List<String> world = config.getStringList("");
    public List<String> coords = config.getStringList("");
    public String prefix = config.getString("Prefix");


    @Override
    public void onEnable() {
        Logger.getLogger("starter");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        //this.getServer().getPluginManager().registerEvents(new WarpMenu(), this);
        getCommand("Warp").setExecutor(new CommandManager());
        getServer().getPluginManager().registerEvents((Listener)new GuiBuilder(), (Plugin) this);

    }

    @Override
    public void onDisable() {
    }
}
