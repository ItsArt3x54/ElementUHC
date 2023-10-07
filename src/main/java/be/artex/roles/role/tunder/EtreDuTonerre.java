package be.artex.roles.role.tunder;

import be.artex.roles.Role;
import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class EtreDuTonerre extends Role {
    public EtreDuTonerre() {
        super(1);
    }

    @Override
    public String getName() {
        return "Etre du tonerre";
    }

    @Override
    public String getId() {
        return "tndr1";
    }

    @Override
    public String getMessage() {
        return "-Vous etes " + ChatColor.YELLOW + ChatColor.BOLD + "un etre deu tonerre.\n" + ChatColor.RESET + "- Vous devez gagner " + ChatColor.YELLOW + ChatColor.BOLD + "Avec les etres du tonerre.\n" + ChatColor.RESET + ChatColor.AQUA + ChatColor.BOLD + "\n \n Effets: \n \n - Speed 1 " + ChatColor.RESET + "permanent";
    }

    @Override
    protected void addEffects(List<PotionEffect> effects) {
        effects.add(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE,  0));
    }
}
