import org.bukkit.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;

import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.Material;

public class SchildPlugin extends JavaPlugin {

    public boolean onCommand (CommandSender sender, Command befehl, 
                                String befehlsname, String[] args) {

        Player spieler = (Player) sender;
        Location position = spieler.gettarg();
        position.setX(position.getX());

        World welt = spieler.getWorld();
        Block block1 = welt.getBlockAt(position);
        block1.setType(Material.OAK_SIGN() );


        Location position2 = spieler.getLocation();
        position2.setY(position.getY() - 1);
        Block block2 = welt.getBlockAt(position2);
        block2.setType(Material.BEDROCK);

        return true;  
    } 


}