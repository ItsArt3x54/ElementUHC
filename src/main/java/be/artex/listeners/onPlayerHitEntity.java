package be.artex.listeners;

import be.artex.roles.Role;
import be.artex.roles.Roles;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.Random;

public class onPlayerHitEntity implements Listener {
    @EventHandler
    public void onPlayerHit(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {

            Player p = (Player) e.getDamager();
            Role playerRole = Roles.getPlayerRole(p);

            if (playerRole == null) {
                return;
            }

            if (playerRole.getId().equals("feu1") || playerRole.getId().equals("feu2")) {
                Random random = new Random();
                int randomNumber = random.nextInt(11);

                if (randomNumber < 10) {
                    e.getEntity().setFireTicks(5 * 20);
                    return;
                }
            }
        }
    }
}
