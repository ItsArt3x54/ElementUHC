package be.artex.elementuhc;

import be.artex.commands.MeetupCommand;
import be.artex.listeners.Bugs;
import be.artex.listeners.Nerfs;

import be.artex.listeners.onPlayerHitEntity;
import be.artex.roles.Roles;
import be.artex.roles.role.eau.EtreDeLeau;
import be.artex.roles.role.feu.EtreDuFeu;
import be.artex.roles.role.solo.EtreCorrompuRole;
import be.artex.roles.role.terre.EtreDeLaTerre;
import be.artex.roles.role.tunder.EtreDuTonerre;
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
        this.getServer().getPluginManager().registerEvents(new onPlayerHitEntity(), this);

        // Register roles
        Roles.register(new EtreCorrompuRole());

    }
}
