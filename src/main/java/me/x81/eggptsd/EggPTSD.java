package me.x81.eggptsd;

import org.bukkit.plugin.java.JavaPlugin;

public final class EggPTSD extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("clearEgg").setExecutor(new clearEgg());
        getServer().getPluginManager().registerEvents(new eventHandler(), this);
    }

    @Override
    public void onDisable() {}
}
