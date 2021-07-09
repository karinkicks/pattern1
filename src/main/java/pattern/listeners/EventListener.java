package pattern.listeners;

import pattern.slot.Slot;

public interface EventListener
{
    void update(String eventType, Slot slot);
}
