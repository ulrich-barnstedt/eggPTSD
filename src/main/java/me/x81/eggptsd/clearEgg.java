package me.x81.eggptsd;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;

public class clearEgg implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int count = 0;

        for (World world : Bukkit.getServer().getWorlds()) {
            for (Entity entity : world.getEntities()) {
                if (!validator.checkEggZombie(entity)) continue;

                ((Zombie) entity).setHealth(0);
                count++;
            }
        }

        sender.sendMessage("Killed " + count + " egg-zombies");
        return true;
    }
}