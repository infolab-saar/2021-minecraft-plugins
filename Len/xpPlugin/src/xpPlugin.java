import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class xpPlugin extends JavaPlugin{
    public void onEnable() {

    }
    public void onDisable() {

    }
    public boolean onCommand(CommandSender sender, Command befehl, String  befehlsname, String[] args) {
 
        Player spieler = (Player) sender; 
        Location position = spieler.getLocation();
        position.setX(position.getX() + 2);

        World welt = spieler.getWorld();
        //Block block = welt.getBlockAt(position);
        //block.setType(Material.EXPERIENCE_BOTTLE);
        welt.spawnEntity(position, EntityType.EXPERIENCE_ORB);

        return true;
    }
    
} 