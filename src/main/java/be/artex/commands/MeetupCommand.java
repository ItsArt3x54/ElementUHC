package be.artex.commands;

import be.artex.elementuhc.ElementUHC;
import be.artex.roles.Role;
import be.artex.roles.Roles;
import be.artex.utils.ItemStacks;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
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

            Random random = new Random();
            for (Player player : players) {
                player.getInventory().clear();

                // Add base Kit
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

                // Teleports players to random locs

                int x = random.nextInt(400);
                int y = 0;
                int z = random.nextInt(400);

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

                for (Player player : players) {
                    Role role = this.findRole();
                    role.assign(player);

                    player.sendTitle(ChatColor.RED + "PVP IS ENABLED", ChatColor.RED + "PVP IS ON!");
                }

                p.getWorld().setPVP(true);
            }, 20 * 5);
        }
        return true;
    }

    private Role findRole() {
        Role role = Roles.getRandomRole();
        if (!role.stillAssignable()) {
            return this.findRole();
        }

        return role;
    }
}
