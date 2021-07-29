import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SchlafAnzeigePlugin extends JavaPlugin implements Listener{
    
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(this, this);

    }


    @EventHandler
    public void onPlayerBed(PlayerBedEnterEvent e){

        Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + " m\u00F6chte gerne Schlafen");

    }
    @EventHandler
    public void onPlayerBed(PlayerBedLeaveEvent ee){

        Bukkit.broadcastMessage(ee.getPlayer().getDisplayName() + " hat genug geschlafen");
    }
}
