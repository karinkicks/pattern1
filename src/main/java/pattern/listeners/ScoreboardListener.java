package pattern.listeners;

import pattern.slot.Slot;

public class ScoreboardListener implements EventListener{

    private String scoreboard;

    public ScoreboardListener(String scoreboard){
        this.scoreboard = scoreboard;
    }

    @Override
    public void update(String doctor, Slot slot) {
        System.out.println("Email to " + scoreboard + ": Someone has performed " + doctor + " operation with the following file: " + slot);
    }
}
