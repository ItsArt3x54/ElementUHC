package be.artex.roles.role.terre;

import be.artex.roles.Role;
import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class EtreDeLaTerre extends Role {
    public EtreDeLaTerre() {
        super(1);
    }

    @Override
    public String getName() {
        return "Etre de la terre";
    }

    @Override
    public String getId() {
        return "terre1";
    }

    @Override
    public String getMessage() {
        return "- Vous etes " +   ChatColor.GREEN + ChatColor.BOLD + "un etre de la terre.\n" + ChatColor.RESET + "- Vous devez gagner " + ChatColor.GREEN + ChatColor.BOLD + "Avec les etres de la terre." + ChatColor.RESET + ChatColor.AQUA + ChatColor.BOLD + "\n \n Effets: \n \n" + ChatColor.GRAY + ChatColor.BOLD + "- Resistance 1" + ChatColor.RESET + " Permanent";
    }

    @Override
    protected void addEffects(List<PotionEffect> effects) {
        effects.add(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE,  0));
    }
}
