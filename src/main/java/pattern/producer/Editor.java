package pattern.producer;

import pattern.slot.Slot;

public class Editor {
    public ManagerEditor events;
    private Slot slot;

    public Editor() {
        this.events = new ManagerEditor("Ivanova", "Volkov");
    }

    public void visitDoctor(String doctor, Slot slot) {
        events.notify(doctor, slot);
    }
}
