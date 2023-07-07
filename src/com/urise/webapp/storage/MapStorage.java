package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.HashMap;
import java.util.Map;

public class MapStorage extends AbstractStorage {

    Map<String, Resume> mapStorage = new HashMap<>();

    @Override
    protected int getIndex(String uuid) {
        if (mapStorage.containsKey(uuid)) return 1;
        return -1;
    }

    @Override
    protected Resume doGet(Object searchKey, String uuid) {
        return mapStorage.get(uuid);
    }

    @Override
    protected void doDelete(Object searchKey, String uuid) {
        mapStorage.remove(uuid);
    }

    @Override
    protected void doSave(Resume r, Object searchKey) {
        mapStorage.put(r.getUuid(), r);
    }

    @Override
    protected void doUpdate(Resume r, Object searchKey) {
        mapStorage.put(r.getUuid(), r);
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
