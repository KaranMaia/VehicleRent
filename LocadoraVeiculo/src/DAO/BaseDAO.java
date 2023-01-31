package DAO;

import java.util.HashMap;

public abstract class BaseDAO<ID, T> {
    
    public void insert(HashMap<ID, T> list, ID id, T object) {
        list.put(id, object);
    }

    public void delete(HashMap<ID, T> list, ID id) {
        list.remove(id);
    }

    public void update(HashMap<ID, T> list, ID id, T object) {
        list.put(id, object);
    }

    public abstract HashMap<ID, T> getAll(HashMap<ID, T> list);

    public abstract T getById(HashMap<ID, T> list, ID id);

}
