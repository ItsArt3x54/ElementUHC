package be.artex.roles.role;

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
        return "- Vous etes " +   ChatColor.GOLD + ChatColor.BOLD + "un etre corrompu.\n" + ChatColor.RESET + "- Vous devez gagner " + ChatColor.GOLD + ChatColor.BOLD + "Tous seul.";
    }

    @Override
    protected void addItems(PlayerInventory inventory) {
        inventory.addItem(ItemStacks.boost());
    }

    @Override
    protected void addEffects(List<PotionEffect> effects) {
        effects.add(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE,  0));
    }
}
