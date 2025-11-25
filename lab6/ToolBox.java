package KI304FirchukLab6;

import java.util.*;

public class ToolBox<T extends Comparable<T>> {
    private List<T> items;
    private int addedCount;

    public ToolBox() {
        items = new ArrayList<>();
        addedCount = 0;
    }


    public void addItem(T item) {
        addedCount++;
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public T findMin() {
        if (items.isEmpty()) return null;
        T min = items.get(0);
        for (T el : items) {
            if (el.compareTo(min) < 0) {
                min = el;
            }
        }
        return min;
    }

    public void printAll() {
        for (T el : items) {
            System.out.println(el);
        }
    }


    public int size() {
        return items.size();
    }

    public int getAddedCount() {
        return addedCount;
    }
}
