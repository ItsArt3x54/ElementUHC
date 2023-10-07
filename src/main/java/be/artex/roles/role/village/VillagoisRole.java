package be.artex.roles.role.village;

import be.artex.roles.Role;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class VillagoisRole extends Role {
    public VillagoisRole() {
        super(1);
    }

    @Override
    public String getName() {
        return "Villagois";
    }

    @Override
    public String getId() {
        return "safe1";
    }

    @Override
    public String getMessage() {
        return "- Vous etes " +   ChatColor.GREEN + ChatColor.BOLD + "Villagois\n" + ChatColor.RESET + "- Vous devez gagner " + ChatColor.GREEN + ChatColor.BOLD + "Avec le village";
    }

    @Override
    protected void addItems(PlayerInventory inventory) {
        inventory.addItem(new ItemStack(Material.GOLDEN_APPLE, 3));
    }
}
