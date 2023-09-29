package be.artex.utils;

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
        ItemStack item = new ItemStack(Material.IRON_HELMET);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
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
        ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 13);

        return item;
    }

    public static ItemStack lavaBucket() {
        ItemStack item = new ItemStack(Material.LAVA_BUCKET);

        return item;
    }

    public static ItemStack goldenCarrot() {
        ItemStack item = new ItemStack(Material.GOLDEN_CARROT, 64);

        return item;
    }

    public static ItemStack pickaxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addEnchant(Enchantment.DIG_SPEED, 3, false);
        item.setItemMeta(itemMeta);

        return item;
    }

    public static ItemStack cobbleStone() {
        ItemStack item = new ItemStack(Material.COBBLESTONE, 64);

        return item;
    }

    public static ItemStack waterBucket() {
        ItemStack item = new ItemStack(Material.WATER_BUCKET);

        return item;
    }

}
