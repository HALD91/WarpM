package me.Hald91.Commands;

import me.Hald91.GUI.GuiBuilder;
import me.Hald91.GUI.WarpMenu;
import me.Hald91.Main;
import me.mattstudios.mfgui.gui.components.ItemBuilder;
import me.mattstudios.mfgui.gui.guis.Gui;
import me.mattstudios.mfgui.gui.guis.GuiItem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class CommandManager implements CommandExecutor {
    public static Player player;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Main main = JavaPlugin.getPlugin(Main.class);
        Player player = (Player) commandSender;


        if (command.getName().equalsIgnoreCase("Warp")) {
            if (commandSender.hasPermission("warp.use")) {

                if (args.length == 0) {
                    new GuiBuilder().openInventory2((HumanEntity) commandSender);
                    //commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.AQUA + "/Warp help" + " " + ChatColor.WHITE + "To see how you use this command"));
                }
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("List")) {
                        commandSender.sendMessage(ChatColor.AQUA + "Getting list.");
                        if (main.getConfig().getStringList("WarpLoc1").isEmpty() && main.getConfig().getStringList("WarpLoc2").isEmpty() && main.getConfig().getStringList("WarpLoc3").isEmpty() && main.getConfig().getStringList("WarpLoc4").isEmpty() && main.getConfig().getStringList("WarpLoc5").isEmpty() && main.getConfig().getStringList("WarpLoc6").isEmpty() && main.getConfig().getStringList("WarpLoc7").isEmpty() && main.getConfig().getStringList("WarpLoc8").isEmpty() && main.getConfig().getStringList("WarpLoc9").isEmpty()) {
                            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "no warps exists"));
                        }
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list10 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        for (String messages : list2) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        for (String messages : list3) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        for (String messages : list4) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        for (String messages : list5) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        for (String messages : list6) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        for (String messages : list7) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        for (String messages : list8) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        for (String messages : list9) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        for (String messages : list10) {
                            commandSender.sendMessage(ChatColor.WHITE + messages);
                        }
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("Help")) {
                        commandSender.sendMessage(ChatColor.GRAY + "-----------------" + ChatColor.GOLD + "Help" + ChatColor.GRAY + "---------------");
                        commandSender.sendMessage(" ");
                        commandSender.sendMessage(ChatColor.AQUA + "/Warp help" + ChatColor.WHITE + " " + "To see how you use this command");
                        commandSender.sendMessage(ChatColor.AQUA + "/Warp List" + ChatColor.WHITE + " " + "To see how many warps there has been sat");
                        commandSender.sendMessage(ChatColor.AQUA + "/Warp" + ChatColor.WHITE + " " + "To teleport to a warp (Opens a GUI)");
                        commandSender.sendMessage(ChatColor.AQUA + "/Warp reload" + ChatColor.WHITE + " " + "To reload the config");
                        commandSender.sendMessage(ChatColor.AQUA + "/Warp Set <WarpLoc1,2,3,4,5,6,7,8,9> <WarpName> <Name1,2,3,4,5,6,7,8,9>" + ChatColor.WHITE + " " + "To set a warp");
                        commandSender.sendMessage(ChatColor.AQUA + "/Warp Del <WarpLoc1,2,3,4,5,6,7,8,9> <WarpName>" + ChatColor.WHITE + " " + "To delete a warp");
                        commandSender.sendMessage(ChatColor.AQUA + "/warp SetPrefix <Prefix>" + ChatColor.WHITE + " " + "To set your own prefix");
                        commandSender.sendMessage(" ");
                        commandSender.sendMessage("-----------------------------------------------------");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("Reload")) {
                        if (commandSender.hasPermission("warp.admin.reload")) {
                            main.reloadConfig();
                            main.getConfig().options().header("###########################\n" +
                                    "#####                 #####\n" +
                                    "####                   ####\n" +
                                    "###   Author: HALD91    ###\n" +
                                    "###   Version: 1.4.5.7  ###\n" +
                                    "####                   ####\n" +
                                    "#####                 #####\n" +
                                    "###########################\n" +
                                    "\n" +
                                    "\n" +
                                    "## UPS!!\n" +
                                    "## All items needs to be with caps-look.\n" +
                                    "## example\n" +
                                    "## Item0: DIAMOND_SWORD\n" +
                                    "## Choose your own Item around the Warps(ArItem:). To give the item no name use \"None\" (ArName:)\n" +
                                    "Set your own prefix here on commands in chat or on the warp menu.");
                            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + ChatColor.RED + " " + "Config" + " " + ChatColor.WHITE + "has been reload"));
                            return true;
                        }
                    }
                }
            }
            if (args.length == 2) {
                if (args[0].equalsIgnoreCase("SetPrefix")) {
                    if (commandSender.hasPermission("warp.admin.setprefix")) {
                        if (!args[1].isEmpty()) {
                            main.getConfig().set("Prefix", args[1]);
                            main.saveConfig();
                            commandSender.sendMessage(ChatColor.WHITE + "Your new prefix" + ChatColor.RESET + " " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString()));
                        }
                        return true;
                    }
                }
            }
            if (args.length == 3) {
                if (commandSender.hasPermission("warp.admin.del")) {
                    if (args[0].equalsIgnoreCase("Del")) {
                        if (!args[1].isEmpty()) {
                            if (!args[2].isEmpty()) {
                                ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("" + args[1]);
                                for (String messages2 : list3) {
                                    if (messages2.contains(args[2])) {
                                        list3.remove(messages2);
                                        main.getConfig().set(args[1], list3);
                                        main.saveConfig();
                                        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.AQUA + args[2] + ChatColor.WHITE + " " + "has been deleted"));
                                        break;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
            if (args.length == 4) {
                if (commandSender.hasPermission("warp.admin.set")) {
                    if (args[0].equalsIgnoreCase("Set")) {
                        if (!args[1].isEmpty()) {
                            if (!args[2].isEmpty()) {
                                if (args[2].contains("&") && (args[2].contains("1") || (args[2].contains("2") || (args[2].contains("3") || (args[2].contains("4") || (args[2].contains("5") || (args[2].contains("6") || (args[2].contains("7") || (args[2].contains("8") || (args[2].contains("9") || (args[2].contains("a") || (args[2].contains("b") || (args[2].contains("c") || (args[2].contains("d") || (args[2].contains("e") || (args[2].contains("f"))))))))))))))))) {
                                    commandSender.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + org.bukkit.ChatColor.WHITE + "using color codes on the warp name arent allow."));
                                } else {
                                    if (!args[3].isEmpty()) {
                                        String x = valueOf(player.getLocation().getX());
                                        String y = valueOf(player.getLocation().getY());
                                        String z = valueOf(player.getLocation().getZ());
                                        ArrayList<String> list = (ArrayList<String>) main.getConfig().getStringList("" + args[1]);

                                        main.getConfig();
                                        list.add("Name: " + args[2] + " x: " + x + " y: " + y + " z: " + z);

                                        main.getConfig().set(args[1], list);
                                        main.getConfig().set(args[3], args[2]);

                                        main.getConfig().options().header("###########################\n" +
                                                "#####                 #####\n" +
                                                "####                   ####\n" +
                                                "###   Author: HALD91    ###\n" +
                                                "###   Version: 1.4.5.7  ###\n" +
                                                "####                   ####\n" +
                                                "#####                 #####\n" +
                                                "###########################\n" +
                                                "\n" +
                                                "\n" +
                                                "## UPS!!\n" +
                                                "## All items needs to be with caps-look.\n" +
                                                "## example\n" +
                                                "## Item0: DIAMOND_SWORD\n" +
                                                "## Choose your own Item around the plugins. To give the item no name use \"None\"\n" +
                                                "Set your own prefix here on commands in chat or on the warp menu.\n");
                                        main.saveConfig();
                                        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.AQUA + args[2] + ChatColor.WHITE + " " + "set at:" + " " + "X:" + " " + ChatColor.GRAY + x + " " + ChatColor.WHITE + "Y:" + " " + ChatColor.GRAY + y + " " + ChatColor.WHITE + "Z:" + " " + ChatColor.GRAY + z));
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}








