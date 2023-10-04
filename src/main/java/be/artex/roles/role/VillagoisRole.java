package be.artex.roles.role;

import be.artex.roles.Role;
import org.bukkit.ChatColor;

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
}
