package me.Hald91.GUI;

import com.sk89q.commandbook.util.TeleportPlayerIterator;
import me.Hald91.Commands.CommandManager;
import me.Hald91.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GuiBuilder implements Listener {

    private final Inventory grant;
    public Player pe;
    Main main = JavaPlugin.getPlugin(Main.class);
    String prefix = ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString());
    String item1 = main.getConfig().getStringList("Items").toString();

    public GuiBuilder() {
        grant = Bukkit.createInventory(null, 27, "" + prefix);
        setitems();
    }

    public void setitems(){
        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");

        grant.setItem(0, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(1, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(2, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(3, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(4, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(5, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(6, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(7, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(8, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));

        for (String messages1 : list1) {
            if (messages1.contains(main.getConfig().getString("Name1").toString())){
                grant.setItem(9, createguiItem2(Material.getMaterial(main.getConfig().getString("Item1").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString())));
            }
        }
        for (String messages2 : list2) {
            if (messages2.contains(main.getConfig().getString("Name2").toString())){
                grant.setItem(10, createguiItem2(Material.getMaterial(main.getConfig().getString("Item2").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString())));
            }
        }
        for (String messages3 : list3) {
            if (messages3.contains(main.getConfig().getString("Name3").toString())){
                grant.setItem(11, createguiItem2(Material.getMaterial(main.getConfig().getString("Item3").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString())));
            }
        }
        for (String messages4 : list4) {
            if (messages4.contains(main.getConfig().getString("Name4").toString())){
                grant.setItem(12, createguiItem2(Material.getMaterial(main.getConfig().getString("Item4").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString())));
            }
        }
        for (String messages5 : list5) {
            if (messages5.contains(main.getConfig().getString("Name5").toString())){
                grant.setItem(13, createguiItem2(Material.getMaterial(main.getConfig().getString("Item5").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString())));
            }
        }
        for (String messages6 : list6) {
            if (messages6.contains(main.getConfig().getString("Name6").toString())){
                grant.setItem(14, createguiItem2(Material.getMaterial(main.getConfig().getString("Item6").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString())));
            }
        }
        for (String messages7 : list7) {
            if (messages7.contains(main.getConfig().getString("Name7").toString())){
                grant.setItem(15, createguiItem2(Material.getMaterial(main.getConfig().getString("Item7").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString())));
            }
        }
        for (String messages8 : list8) {
            if (messages8.contains(main.getConfig().getString("Name8").toString())){
                grant.setItem(16, createguiItem2(Material.getMaterial(main.getConfig().getString("Item8").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString())));
            }
        }
        for (String messages9 : list9) {
            if (messages9.contains(main.getConfig().getString("Name9").toString())){
                grant.setItem(17, createguiItem2(Material.getMaterial(main.getConfig().getString("Item9").toString()), "" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString())));
            }
        }


        grant.setItem(18, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(19, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(20, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(21, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(22, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(23, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(24, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(25, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
        grant.setItem(26, createguiItem2(Material.getMaterial(main.getConfig().getString("ArItem").toString()), " "));
    }

    protected ItemStack createguiItem2(final Material material, final String name, final String... lore){
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);

        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }
    /*
       Open inventory grant.
     */
    public void openInventory2(final HumanEntity ent){
        ent.openInventory(grant);
    }

    @EventHandler
    public void interact2(final InventoryClickEvent event) {
        final Player p3 = (Player) event.getWhoClicked();
        Material item1 = Material.getMaterial(main.getConfig().getString("Item1").toString());

        if (event.getView().getTitle().equalsIgnoreCase("" + prefix)) {
            if (p3.getPlayer() != null) {
                if (event.getCurrentItem() != null) {
                    if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item1").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item2").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item3").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item4").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item5").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item6").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item7").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item8").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("Item9").toString())) {
                        ArrayList<String> list1 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc1");
                        ArrayList<String> list2 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc2");
                        ArrayList<String> list3 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc3");
                        ArrayList<String> list4 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc4");
                        ArrayList<String> list5 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc5");
                        ArrayList<String> list6 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc6");
                        ArrayList<String> list7 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc7");
                        ArrayList<String> list8 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc8");
                        ArrayList<String> list9 = (ArrayList<String>) main.getConfig().getStringList("WarpLoc9");


                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()))) {
                            event.setCancelled(true);
                            for (String messages1 : list1) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages1.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name1").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()))) {
                            event.setCancelled(true);
                            for (String messages2 : list2) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages2.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name2").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()))) {
                            event.setCancelled(true);
                            for (String messages3 : list3) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages3.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name3").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()))) {
                            event.setCancelled(true);
                            for (String messages4 : list4) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages4.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name4").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()))) {
                            event.setCancelled(true);
                            for (String messages5 : list5) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages5.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name5").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()))) {
                            event.setCancelled(true);
                            for (String messages6 : list6) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages6.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name6").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()))) {
                            event.setCancelled(true);
                            for (String messages7 : list7) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages7.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name7").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()))) {
                            event.setCancelled(true);
                            for (String messages8 : list8) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages8.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name8").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        } else if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()))) {
                            event.setCancelled(true);
                            for (String messages9 : list9) {
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + " " + p3.getName() + String.valueOf(messages9.toString()).replace(",", "").replace("Name: " + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Name9").toString()), "").replace(" x: ", " ").replace(" y: ", " ").replace(" z: ", " ").replace("[", "").replace("]", "").replace("&", ""));
                            }
                            p3.closeInventory();
                        }
                    } else if (event.getCurrentItem().getType() == Material.getMaterial(main.getConfig().getString("ArItem").toString())) {
                        if ((event.getCurrentItem().getItemMeta()).getDisplayName().equalsIgnoreCase("" + ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("ArName").toString().replace("None", " ")))) {
                            event.setCancelled(true);
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventoryClick2(final InventoryClickEvent e){
        if (e.getInventory() != grant) return;
        e.setCancelled(true);
        final ItemStack clickedItem = e.getCurrentItem();
        if (clickedItem == null || clickedItem.getType() == Material.BLUE_STAINED_GLASS_PANE) return;
        final Player p3 = (Player) e.getWhoClicked();

    }

    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e){
        if (e.getInventory() == grant){
            e.setCancelled(true);
        }
    }

}
