package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

public class MapResumeStorage extends AbstractMapStorage {

    @Override
    protected Resume getSearchKey(String uuid) {
        return mapStorage.get(uuid);
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return (Resume) searchKey;
    }

    @Override
    protected void doDelete(Object searchKey) {
        mapStorage.remove(((Resume) searchKey).getUuid());
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
    protected boolean isExist(Object searchKey) {
        return searchKey != null;
    }
}
