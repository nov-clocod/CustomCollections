package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T> {
    private List<T> items = new ArrayList<>();;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(T item) throws Exception {

        if (items.size() > maxSize) {
            throw new Exception("Max items exceeded");
        } else {
            items.add((T) item);
        }
    }

    public List<T> getItems() {
        return items;
    }
}
