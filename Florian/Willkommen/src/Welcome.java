import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Welcome extends JavaPlugin implements Listener{
    

    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(this, this);
        
        super.onEnable();
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

        this.getLogger().info(e.getPlayer().getDisplayName() + " ist auf den Server geh\u00fcpft");
        String m = ChatColor.translateAlternateColorCodes('6', e.getPlayer().getDisplayName());
        String mm = ChatColor.translateAlternateColorCodes('b', " ist auf den Server geh\u00fcpft");
        e.setJoinMessage(m + mm);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent ee){

        String m = ChatColor.translateAlternateColorCodes('6', ee.getPlayer().getDisplayName());
        ee.setQuitMessage(m + " ist vom Server gefallen");
    }
}
