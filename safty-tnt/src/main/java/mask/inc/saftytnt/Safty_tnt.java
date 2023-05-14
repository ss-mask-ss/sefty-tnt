package mask.inc.saftytnt;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Safty_tnt extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof org.bukkit.entity.TNTPrimed) {
            if (event.getEntity() instanceof Player) {
                event.setCancelled(true);
                // プレイヤーにダメージを与える処理を追加することができます
                // 例: ((Player) event.getEntity()).damage(5);
            }
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
