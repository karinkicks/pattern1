package pattern.listeners;

import pattern.slot.Slot;

public class WorkEmailListener implements EventListener{
    private String email;

    public WorkEmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String doctor, Slot slot) {
        System.out.println("Email to " + email + ": Someone has performed " + doctor + " operation with the following file: " + slot);
    }
}
