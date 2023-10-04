package be.artex.roles;

import be.artex.elementuhc.ElementUHC;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.*;

public final class Roles {
    private static final Map<String, Role> registeredRoles = new HashMap<>();
    private static final Map<UUID, String> savedPlayerRoles = new HashMap<>();

    public static void register(Role role) {
        Bukkit.getPluginManager().registerEvents(role, ElementUHC.PLUGIN);
        Roles.registeredRoles.putIfAbsent(role.getId(), role);
    }

    public static Role getRole(String id) {
        return Roles.registeredRoles.get(id);
    }

    public static Role getRandomRole() {
        return Roles.registeredRoles.values().stream().toList().get(new Random().nextInt(Roles.registeredRoles.size()));
    }

    public static void markPlayerRole(UUID uuid, String role) {
        Roles.savedPlayerRoles.put(uuid, role);
    }

    public static void markPlayerRole(Player player, Role role) {
        markPlayerRole(player.getUniqueId(), role.getId());
    }

    public static void unMarkPlayer(UUID uuid) {
        Roles.savedPlayerRoles.remove(uuid);
    }

    public static void unMarkPlayer(Player player) {
        unMarkPlayer(player.getUniqueId());
    }

    public static Role getPlayerRole(Player player) {
        String roleId = Roles.savedPlayerRoles.get(player.getUniqueId());
        return Roles.getRole(roleId);
    }
}
