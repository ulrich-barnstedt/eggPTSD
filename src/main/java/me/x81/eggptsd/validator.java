package me.x81.eggptsd;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;

public class validator {
    static boolean checkEggZombie (Entity assumedZombie) {
        if (!(assumedZombie instanceof Zombie)) return false;
        Zombie zombie = (Zombie) assumedZombie;

        if (zombie.getEquipment() == null) return false;
        if (zombie.getEquipment().getItemInMainHand().getAmount() == 0) return false;
        if (zombie.getEquipment().getItemInMainHand().getType() != Material.EGG) return false;

        return true;
    }
}
