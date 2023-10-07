package be.artex.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStacks {
    public static ItemStack sword() {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
        item.setItemMeta(itemMeta);

        return item;
    }

    public static ItemStack helmet() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
        item.setItemMeta(itemMeta);

        return item;
    }

    public static ItemStack chestplate() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
        item.setItemMeta(itemMeta);

        return item;
    }

    public static ItemStack leggings() {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
        item.setItemMeta(itemMeta);

        return item;
    }

    public static ItemStack boots() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
        item.setItemMeta(itemMeta);

        return item;
    }

    public static ItemStack gAp() {
        return new ItemStack(Material.GOLDEN_APPLE, 13);
    }

    public static ItemStack lavaBucket() {
        return new ItemStack(Material.LAVA_BUCKET);
    }

    public static ItemStack goldenCarrot() {
        return new ItemStack(Material.GOLDEN_CARROT, 64);
    }

    public static ItemStack pickaxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.DIG_SPEED, 3, false);
        item.setItemMeta(itemMeta);

        return item;
    }

    public static ItemStack cobbleStone() {
        return new ItemStack(Material.COBBLESTONE, 64);
    }

    public static ItemStack waterBucket() {
        return new ItemStack(Material.WATER_BUCKET);
    }

    public static ItemStack eauBoots() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
        itemMeta.addEnchant(Enchantment.DEPTH_STRIDER, 3, false);
        item.setItemMeta(itemMeta);

        return item;
    }

}
