package be.artex.roles.role.solo;

import be.artex.roles.Role;
import be.artex.utils.ItemStacks;
import org.bukkit.ChatColor;
import org.bukkit.PortalType;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class EtreCorrompuRole extends Role {
    public EtreCorrompuRole() {
        super(1);
    }

    @Override
    public String getName() {
        return "Etre corrompu";
    }

    @Override
    public String getId() {
        return "solo1";
    }

    @Override
    public String getMessage() {
        return "- Vous etes " +   ChatColor.GOLD + ChatColor.BOLD + "un etre corrompu.\n" + ChatColor.RESET + "- Vous devez gagner " + ChatColor.GOLD + ChatColor.BOLD + "Tous seul." + ChatColor.RESET + ChatColor.AQUA + ChatColor.BOLD + "\n \n Effets: \n \n" + ChatColor.RED + ChatColor.BOLD + "- Strength 1" + ChatColor.RESET + " Permanent \n" +  ChatColor.AQUA + ChatColor.BOLD + "- Speed 1 " + ChatColor.RESET + " Permanent \n" + ChatColor.GRAY + ChatColor.BOLD + "- Resistance 1" + ChatColor.RESET + " Permanent";
    }

    @Override
    protected void addEffects(List<PotionEffect> effects) {
        effects.add(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE,  0));
        effects.add(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE,  0));
        effects.add(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE,  0));
    }
}
