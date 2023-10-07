package be.artex.roles.role.feu;

import be.artex.roles.Role;
import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class EtreDuFeu extends Role {
    public EtreDuFeu() {
        super(1);
    }

    @Override
    public String getName() {
        return "Etre du feu";
    }

    @Override
    public String getId() {
        return "feu1";
    }

    @Override
    public String getMessage() {
        return "- Vous etes " +   ChatColor.RED + ChatColor.BOLD + "un etre du feu.\n" + ChatColor.RESET + "- Vous devez gagner " + ChatColor.RED + ChatColor.BOLD + "Avec les etres du feu." + ChatColor.RESET + ChatColor.AQUA + ChatColor.BOLD + "\n \n Effets: \n \n" + ChatColor.GOLD + ChatColor.BOLD + "- Fire resistance 1" + ChatColor.RESET + " Permanent" + ChatColor.RESET + ChatColor.AQUA + ChatColor.BOLD + "\n \n Particulariter: \n \n" + ChatColor.RESET + "- Quand vous taper un joueur il sera mit en" + ChatColor.GOLD + "feu.";
    }

    @Override
    protected void addEffects(List<PotionEffect> effects) {
        effects.add(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE,  0));
    }
}
