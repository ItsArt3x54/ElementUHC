package be.artex.roles;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public abstract class Role implements Listener {
    private final int maxAssigns;
    private int assignedCount;

    public Role(int maxAssigns) {
        this.maxAssigns = maxAssigns;
    }

    public boolean stillAssignable() {
        return this.assignedCount < this.maxAssigns;
    }

    public void assign(Player player) {
        if (!this.stillAssignable()) {
            throw new UnsupportedOperationException(this.getName() + " can only be assigned " + this.maxAssigns + "!");
        }

        // Item
        this.addItems(player.getInventory());

        // Effect
        List<PotionEffect> effects = new ArrayList<>();
        this.addEffects(effects);
        player.addPotionEffects(effects);

        // Attributes
        this.addAttributes(player);

        // Send Message
        player.sendMessage(this.getMessage());

        // Internal
        Roles.markPlayerRole(player, this);

        this.assignedCount++;
    }

    public void decreaseAssignCount() {
        this.assignedCount--;
    }

    public abstract String getName();
    public abstract String getId();
    public abstract String getMessage();

    protected void addItems(PlayerInventory inventory) {
    }

    protected void addEffects(List<PotionEffect> effects) {
    }

    protected void addAttributes(Player player) {
    }

    public void onNight(Player player) {
    }

    public void onDay(Player player) {
    }

    @EventHandler
    public void onPlayerDie(PlayerDeathEvent e) {
        Roles.unMarkPlayer(e.getEntity());
    }
}
