package be.artex.commands;

import be.artex.elementuhc.ElementUHC;
import be.artex.utils.ItemStacks;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
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

                Bukkit.getScheduler().runTaskLater(ElementUHC.PLUGIN, () -> {
                    p.getWorld().setPVP(true);
                    player.sendTitle(ChatColor.RED + "PVP IS ENABLED", ChatColor.RED + "PVP IS ON!");
                }, 20 * 60);
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999999, 0));

            }
        }
        return true;
    }
}
