package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.HashMap;
import java.util.Map;

public class MapStorage extends AbstractStorage {

    Map<String, Resume> mapStorage = new HashMap<>();

    @Override
    protected Object getSearchKey(String uuid) {
        return uuid;
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return mapStorage.get((String) searchKey);
    }

    @Override
    protected void doDelete(Object searchKey) {
        mapStorage.remove((String) searchKey);
    }

    @Override
    protected void doSave(Resume r, Object searchKey) {
        mapStorage.put((String) searchKey, r);
    }

    @Override
    protected void doUpdate(Resume r, Object searchKey) {
        mapStorage.put((String) searchKey, r);
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return mapStorage.containsKey((String) searchKey);
    }

    @Override
    public void clear() {
        mapStorage.clear();
    }

    @Override
    public Resume[] getAll() {
        return mapStorage.values().toArray(new Resume[0]);
    }

    @Override
    public int size() {
        return mapStorage.size();
    }
}
