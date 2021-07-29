import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Abschluss extends JavaPlugin {

    
    public void onEnable() {
        
    }
     public void onDisable() { }

     public boolean onCommand(CommandSender sender, Command befehl, String befehlsname, String [] args) {
       
       Player spieler = (Player) sender;
       World welt = spieler.getWorld();

       //Bukkit.createBossBar(key, "Danke fürs Zuhören", #04f9ff, style, flags)
       BossBar bossBar = Bukkit.createBossBar("Danke f\u00fcrs Zuh\u00f6uren", BarColor.YELLOW, BarStyle.SOLID);

       for(Player spieler2 : Bukkit.getOnlinePlayers()) {
       bossBar.addPlayer(spieler2);
      }
        bossBar.show();

       spieler.sendTitle("Dies war die Pr\u00e4sentation", "des Kurses Minecraft Plugins", 1, 600, 1);

       return false;
     }

}