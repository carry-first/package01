package com.test2.stringBuilder.Generic.Dao;

import java.util.*;

public class DAO<T> {
    private Map<String, T> map = new HashMap();

    //    增
    public void add(String id, T t) {
        map.put(id, t);
    }

    //    删
    public boolean remove(String id) {
        if (map.containsKey(id)) {
            map.remove(id);
            return true;
        }
        return false;
    }

    //    改
    public boolean upData(String id, T t) {
        if (map.containsKey(id)) {
            map.put(id, t);
            return true;
        }
        return false;
    }

    //    查
    public List<T> query() {
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T value : values) {
            list.add(value);
        }
        return list;
    }
}
