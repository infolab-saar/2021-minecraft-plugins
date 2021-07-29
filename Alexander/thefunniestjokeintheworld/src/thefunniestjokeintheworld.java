import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.concurrent.TimeUnit;

import org.bukkit.Location;

public class thefunniestjokeintheworld extends JavaPlugin{
    public void onEnable() {

    }
    public void onDisable() {

    }
    public boolean onCommand(CommandSender sender, Command befehl, String  befehlsname, String[] args) {
 
        Player spieler = (Player) sender; 

        sender.sendMessage("Wenn ist das NunstU+00FCck git und Slotermeyer? Ja Beiherhund das Oder die Flipperwaldt gersput!"); 

        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Location position = spieler.getLocation();

        position.getWorld().spawnEntity(position, EntityType.PRIMED_TNT);
        position.getWorld().spawnEntity(position, EntityType.PRIMED_TNT);
        spieler.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 20, 3));
        spieler.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 3));

        return true;
    }
    
} 