package be.artex.roles.role.eau;

import be.artex.roles.Role;
import be.artex.utils.ItemStacks;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class EtreDeLeau extends Role {
    public EtreDeLeau() {
        super(1);
    }

    @Override
    public String getName() {
        return "Etre de leau";
    }

    @Override
    public String getId() {
        return "eau1";
    }

    @Override
    public String getMessage() {
        return "- Vous etes " +   ChatColor.BLUE + ChatColor.BOLD + "un etre de l'eau.\n" + ChatColor.RESET + "- Vous devez gagner " + ChatColor.BLUE + ChatColor.BOLD + "Avec les etres de l'eau." + ChatColor.RESET + ChatColor.AQUA + ChatColor.BOLD + "\n \n Effets: \n \n" + ChatColor.RESET + "- Bottes " + ChatColor.BLUE + "Depth strider 3";
    }

    @Override
    protected void addItems(PlayerInventory inventory) {
        inventory.addItem(ItemStacks.eauBoots());
    }
}
