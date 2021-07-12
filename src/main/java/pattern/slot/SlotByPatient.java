package pattern.slot;

public class SlotByPatient implements Slot {
    @Override
    public Slot getSlot() {
        return new SlotByPatient();
    }
}
