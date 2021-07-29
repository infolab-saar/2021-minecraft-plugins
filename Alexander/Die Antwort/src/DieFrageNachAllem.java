import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.concurrent.TimeUnit;

public class DieFrageNachAllem extends JavaPlugin{
    public void onEnable() { }
    public void onDisable() { }

    public boolean onCommand(CommandSender sender,
                             Command befehl, 
                             String  befehlsname, 
                             String[] args) {
        
                                
        if(befehlsname.equals("what_is_the_answer_to_the_ultimate_question_of_life_universe_and_everything")) {
            
          sender.sendMessage("<" + sender + "> I'll have to think about it.");   

         sender.sendMessage("<Deep Thought> I'll have to think about it.");   

            try {
             TimeUnit.MINUTES.sleep(10);
             } 
            catch (InterruptedException e) {
               // TODO Auto-generated catch block
             e.printStackTrace();
           }

          sender.sendMessage("<Deep Thought> The answer is fourty-two");   
        }
        if(befehlsname.equals("fourty-two??!")) {

          sender.sendMessage("<" + sender + "> fourty-two??!");

          try {
            TimeUnit.SECONDS.sleep(2);
          } 
           catch (InterruptedException e) {
               // TODO Auto-generated catch block
            e.printStackTrace();
          }

            sender.sendMessage("<Deep Thought> I checked it very thoroughly and that quite definitely the answer.");
            try {
                TimeUnit.SECONDS.sleep(5);
              } 
               catch (InterruptedException e) {
                   // TODO Auto-generated catch block
                e.printStackTrace();
              }
            sender.sendMessage("<Deep Thought> I think the problem, to be quite honest with you, is that you've never actually known what the question is.");
        }
        return true;
    }
    
} 