import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;
import org.bukkit.Location;

public class WarpPointPlugin extends JavaPlugin {
    public void onEnable() {
    }

    public void onDisable() {
    }

    public boolean onCommand(CommandSender sender, Command befehl, String befehlsname, String[] args) {

        Player spieler = (Player) sender; 
        Location position = spieler.getLocation();

        if(befehlsname.equals("setwarp")){

            this.getConfig().set(spieler.getDisplayName(), position);
            this.saveConfig();
        }

        if(befehlsname.equals("gowarp")){

         Location position2 = this.getConfig().getLocation(spieler.getDisplayName());

         spieler.teleport(position2);
        }
    
    return true;
}
}
