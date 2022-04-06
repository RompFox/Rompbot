import bwapi.*;

public class Rompbot extends DefaultBWListener {
    BWClient BWClient;
    Game  Game;
    EventHandler RompEventHandler;
    //MacroHandler RompMacroHandler;
    //MicroHandler RompMicroHandler;

    @Override
    public void onStart() {
            Game = BWClient.getGame();
    }

    @Override
    public void onFrame(){
        Game.drawTextScreen(100,100, "ROMPBOT ONLINE");
    }

    void run(){
            BWClient = new BWClient(this);
            BWClient.startGame();
            RompEventHandler = new EventHandler(BWClient);
            //RompMacroHandler = new MacroHandler(BWClient);
            //RompMicroHandler = new MicroHandler(BWClient);
    }

    public static void main(String[] args){
        new Rompbot().run();
    }



}
