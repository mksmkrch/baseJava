package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.model.Resume;


public abstract class AbstractStorage implements Storage {

    @Override
    public void save(Resume r) {
        Object searchKey = getIndex(r.getUuid());
        if (isExist(searchKey)) {
            getExistingSearchKey(r.getUuid());
        }
        doSave(r, searchKey);
    }

    @Override
    public void update(Resume r) {
        Object searchKey = getIndex(r.getUuid());
        if (!isExist(searchKey)) {
            getNotExistingSearchKey(r.getUuid());
        } else {
            doUpdate(r, searchKey);
        }
    }

    @Override
    public Resume get(String uuid) {
        Object searchKey = getIndex(uuid);
        if (!isExist(searchKey)) {
            getNotExistingSearchKey(uuid);
        }
        return doGet(searchKey, uuid);
    }

    @Override
    public void delete(String uuid) {
        Object searchKey = getIndex(uuid);
        if (!isExist(searchKey)) {
            getNotExistingSearchKey(uuid);
        } else {
            doDelete(searchKey, uuid);
        }
    }

    protected abstract int getIndex(String uuid);

    protected abstract Resume doGet(Object searchKey, String uuid);

    protected abstract void doDelete(Object searchKey, String uuid);

    protected abstract void doSave(Resume r, Object searchKey);

    protected abstract void doUpdate(Resume r, Object searchKey);

    protected boolean isExist(Object searchKey){
        return (int) searchKey >= 0;
    }

    private void getExistingSearchKey(String uuid) {
        throw new ExistStorageException(uuid);
    }

    private void getNotExistingSearchKey(String uuid) {
        throw new NotExistStorageException(uuid);
    }

}
