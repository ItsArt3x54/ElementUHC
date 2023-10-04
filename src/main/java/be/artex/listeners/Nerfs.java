package be.artex.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;

public class Nerfs implements Listener {
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {

        Entity entity = event.getEntity();
        Entity edamager = event.getDamager();
        double damage = event.getDamage();

        ///nerf strength
        if(edamager instanceof Player damager) {

            if(damager.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
                Collection<PotionEffect> pe = damager.getActivePotionEffects();
                for(PotionEffect effect : pe) {
                    if(effect.getType().equals(PotionEffectType.INCREASE_DAMAGE)) {
                        if(effect.getAmplifier() == 0) {
                            damage = damage / 2.3;
                            damage = damage * 1.15;
                        }
                        if(effect.getAmplifier() == 1) {
                            damage = damage / 3.6;
                            damage = damage * 1.25;
                        }
                    }
                }
            }
        }

        ///nerf resistance
        if(entity instanceof Player player) {

            if(player.hasPotionEffect(PotionEffectType.DAMAGE_RESISTANCE)) {
                Collection<PotionEffect> pe = player.getActivePotionEffects();
                for(PotionEffect effect : pe) {
                    if(effect.getType().equals(PotionEffectType.DAMAGE_RESISTANCE)) {
                        if(effect.getAmplifier() == 0) {
                            damage = damage / 0.80;
                            damage = damage * 0.85;
                        }
                        if(effect.getAmplifier() == 1) {
                            damage = damage / 0.60;
                            damage = damage * 0.75;
                        }
                        if(effect.getAmplifier() == 2) {
                            damage = damage / 0.40;
                            damage = damage * 0.45;
                        }
                    }
                }
            }
        }

        event.setDamage(damage);

    }
}
