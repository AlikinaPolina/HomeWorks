package data;

import java.util.ArrayList;

public class ArrayDb implements Db {

    private ArrayList<Object> arr = new ArrayList();

    @Override
    public void save(Object obj) throws DbException {
        arr.add(obj);
    }

    @Override
    public Object[] findAll() throws DbException {
        Object[] objects = new Object[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            objects[i] = arr.get(i);
        }
        return objects;
    }
}