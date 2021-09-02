package me.x81.eggptsd;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class eventHandler implements Listener {
    @EventHandler
    public void onEntityPickupItem (EntityPickupItemEvent event) {
        if (event.getItem().getItemStack().getType() != Material.EGG) return;
        if (event.getEntity().getType() != EntityType.ZOMBIE) return;

        event.getEntity().setHealth(0);
    }
}