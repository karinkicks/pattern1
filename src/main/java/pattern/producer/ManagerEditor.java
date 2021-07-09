package pattern.producer;

import pattern.listeners.EventListener;
import pattern.slot.Slot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerEditor {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public ManagerEditor(String... doctors) {
        for (String doctor : doctors) {
            this.listeners.put(doctor, new ArrayList<>());
        }
    }

    public void subscribe(String doctor, EventListener listener) {
        List<EventListener> users = listeners.get(doctor);
        users.add(listener);
    }

    public void unsubscribe(String doctor, EventListener listener) {
        List<EventListener> users = listeners.get(doctor);
        users.remove(listener);
    }

    public void notify(String doctor, Slot slot) {
        List<EventListener> users = listeners.get(doctor);
        for (EventListener listener : users) {
            listener.update(doctor, slot);
        }
    }
}

