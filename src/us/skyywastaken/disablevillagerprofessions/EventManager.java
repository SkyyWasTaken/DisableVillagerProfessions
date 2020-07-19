package us.skyywastaken.disablevillagerprofessions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerCareerChangeEvent;

import static us.skyywastaken.disablevillagerprofessions.DisableVillagerProfessions.getPluginConfig;

public class EventManager implements Listener {
    @EventHandler
    public void onVillagerChangeProfession(VillagerCareerChangeEvent career) {
        if (!getPluginConfig().getBoolean("allowedProfessions." + career.getProfession().toString())) {
            career.setCancelled(true);
        }
    }
}
