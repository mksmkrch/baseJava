package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

public class MapUuidStorage extends AbstractMapStorage {

    @Override
    protected String getSearchKey(String uuid) {
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
}
