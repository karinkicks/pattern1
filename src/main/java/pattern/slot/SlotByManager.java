package pattern.slot;


public class SlotByManager implements Slot {
    @Override
    public Slot getSlot() {
        return new SlotByManager();
    }
}
