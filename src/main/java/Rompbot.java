import bwapi.*;

public class Rompbot extends DefaultBWListener {
    BWClient BWClient;
    Game  Game;

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
    }

    public static void main(String[] args){
        new Rompbot().run();
    }


}
