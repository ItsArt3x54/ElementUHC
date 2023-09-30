package be.artex.commands;

import be.artex.elementuhc.ElementUHC;
import be.artex.utils.Compos;
import be.artex.utils.ItemStacks;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class MeetupCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        if (p.isOp()) {

            p.getWorld().setPVP(false);

            Collection<? extends Player> players = Bukkit.getOnlinePlayers();

            p.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "HOST" + ChatColor.RESET + " " + p.getDisplayName());

            for (Player player : players) {

                player.getInventory().clear();

                player.getInventory().addItem(ItemStacks.pickaxe());
                player.getInventory().addItem(ItemStacks.sword());
                player.getInventory().addItem(ItemStacks.lavaBucket());
                player.getInventory().addItem(ItemStacks.gAp());
                player.getInventory().addItem(ItemStacks.goldenCarrot());
                player.getInventory().addItem(ItemStacks.lavaBucket());
                player.getInventory().addItem(ItemStacks.cobbleStone());
                player.getInventory().addItem(ItemStacks.cobbleStone());
                player.getInventory().addItem(ItemStacks.waterBucket());
                player.getInventory().setBoots(ItemStacks.boots());
                player.getInventory().setLeggings(ItemStacks.leggings());
                player.getInventory().setChestplate(ItemStacks.chestplate());
                player.getInventory().setHelmet(ItemStacks.helmet());

                Random random1 = new Random();

                int x = random1.nextInt(400);

                int y = 100;

                int z = random1.nextInt(400);

                Location loc = new Location(p.getWorld(), x, y, z);

                y = loc.getWorld().getHighestBlockYAt(loc);
                loc.setY(y + 100);

                player.teleport(loc);

                player.setGameMode(GameMode.SURVIVAL);

                p.getWorld().getWorldBorder().setCenter(0, 0);
                p.getWorld().getWorldBorder().setSize(800);

                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999999, 0));

            }

            Bukkit.getScheduler().runTaskLater(ElementUHC.PLUGIN, () -> {

                ArrayList<String> compos = Compos.compos1();

                ArrayList<Player> solo = new ArrayList<>();
                ArrayList<Player> eclair = new ArrayList<>();
                ArrayList<Player> eau = new ArrayList<>();

                for (Player player : players) {

                    Random camps = new Random();
                    int camps2 = camps.nextInt(compos.size() + 1);

                    if (camps2 == 1) {
                        solo.add(player);

                        player.sendMessage("- Vous etes " +   ChatColor.GOLD + ChatColor.BOLD + "un etre corrompu.\n" + ChatColor.RESET + "- Vous devez gagner " + ChatColor.GOLD + ChatColor.BOLD + "Tous seul.");
                    } else if (camps2 == 2) {
                        eclair.add(player);

                        player.sendMessage("Vous etes "  + ChatColor.YELLOW + ChatColor.BOLD + "un etre de l'eclair.\n" + ChatColor.RESET + "Vous devez gagner avec " + ChatColor.YELLOW + ChatColor.BOLD + "les membres du cercle de l'eclair");
                    } else if (camps2 == 3){
                        eau.add(player);

                        player.sendMessage("Vous etes " +  ChatColor.BLUE + ChatColor.BOLD + "un etre de l'eau.\n" + ChatColor.RESET + "Vous devez gagner avec " + ChatColor.BLUE + ChatColor.BOLD + "les membres du cercle de l'eau");
                    } else {

                    }

                    player.sendTitle(ChatColor.RED + "PVP IS ENABLED", ChatColor.RED + "PVP IS ON!");
                }

                p.getWorld().setPVP(true);
            }, 20 * 60);
        }
        return true;
    }
}
