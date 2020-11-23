package me.Hald91.GUI;

import me.Hald91.Commands.CommandManager;
import me.Hald91.Main;
import me.mattstudios.mfgui.gui.components.ItemBuilder;
import me.mattstudios.mfgui.gui.guis.Gui;
import me.mattstudios.mfgui.gui.guis.GuiItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class WarpMenu implements Listener {
    Main main = JavaPlugin.getPlugin(Main.class);
    Gui gui = new Gui(6, "test");
    ArrayList<String> list = new ArrayList<>();
    GuiItem Filleritem = ItemBuilder.from(Material.BLUE_STAINED_GLASS_PANE).setName(ChatColor.DARK_PURPLE + "").asGuiItem(event -> {
       //Handler
       event.setCancelled(true);
    });

    public GuiItem WarpMenu1(){
        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("Items");
        for (String messages2 : list3) {
            if (!(messages2.contains("Ingui: true"))) {
                list3.remove(messages2);
            } else {
                GuiItem message3 = ItemBuilder.from(Material.getMaterial(messages2.replace("Item: ", ""))).setName(messages2.replace("Name: ", "")).asGuiItem();
            }
        }
        return null;
    }

    public void maingui(Player player) {
        gui.open(player);

        for (int i = 0; i < 54; i++) {
            gui.setItem(i, Filleritem);
        }
        gui.setItem(4, WarpMenu1());

    }


}
