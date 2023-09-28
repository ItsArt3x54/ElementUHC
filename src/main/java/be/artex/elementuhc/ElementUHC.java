package be.artex.elementuhc;

import be.artex.listeners.Nerfs;
import org.bukkit.plugin.java.JavaPlugin;

public final class ElementUHC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new Nerfs(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
