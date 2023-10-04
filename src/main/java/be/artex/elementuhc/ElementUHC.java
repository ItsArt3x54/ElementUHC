package be.artex.elementuhc;

import be.artex.commands.MeetupCommand;
import be.artex.listeners.Bugs;
import be.artex.listeners.Nerfs;
import be.artex.roles.Roles;
import be.artex.roles.role.EtreCorrompuRole;
import org.bukkit.plugin.java.JavaPlugin;

public final class ElementUHC extends JavaPlugin {
    public static JavaPlugin PLUGIN;

    @Override
    public void onEnable() {
        PLUGIN = this;

        // Plugin startup logic
        this.getCommand("meetup").setExecutor(new MeetupCommand());
        this.getServer().getPluginManager().registerEvents(new Nerfs(), this);
        this.getServer().getPluginManager().registerEvents(new Bugs(), this);

        // Register roles
        Roles.register(new EtreCorrompuRole());
    }
}
