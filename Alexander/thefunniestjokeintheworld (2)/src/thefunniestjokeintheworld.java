import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import java.util.concurrent.TimeUnit;
import org.bukkit.Bukkit;

public class thefunniestjokeintheworld extends JavaPlugin{
    public void onEnable() {

    }
    public void onDisable() {

    }
    public boolean onCommand(CommandSender sender, Command befehl, String  befehlsname, String[] args) {
 
        Player spieler = (Player) sender; 

        if(befehlsname.equals("tell_me_the_funniest_joke_in_the_world")) {
            sender.sendMessage("Wenn ist das Nunst\u00FCck git und Slotermeyer? Ja Beiherhund das Oder die Flipperwaldt gersput!"); 
            try {
             TimeUnit.SECONDS.sleep(5);
             } 
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
             e.printStackTrace();
             }

         spieler.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 20, 3));
         spieler.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 3));
        }

        if(befehlsname.equals("wenn_ist_das_nunstueck_git_und_slotermeyer?_ja_beiherhund_das_oder_die_flipperwaldt_gersput!")) {
    
          
            Bukkit.broadcastMessage("<" + spieler.getDisplayName() + "> Wenn ist das Nunst\u00FCck git und Slotermeyer? Ja Beiherhund das Oder die Flipperwaldt gersput!");
            
                try {
                TimeUnit.SECONDS.sleep(2);
                } 
                    catch (InterruptedException e) {
                   // TODO Auto-generated catch block
                e.printStackTrace();
                }
                for(Entity entity : spieler.getNearbyEntities(25, 8, 25)) {
                    if(entity instanceof LivingEntity)
                    ((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.HARM, 20, 3));}

            }
        
    return true;
    }

    }