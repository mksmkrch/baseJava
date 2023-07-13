package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.Arrays;
import java.util.List;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage extends AbstractStorage {
    protected static final int STORAGE_LIMIT = 10000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    public int size() {
        return size;
    }

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    @Override
    protected void doSave(Resume r, Object searchKey) {
        if (size == STORAGE_LIMIT) {
            throw new StorageException("Storage overflow", r.getUuid());
        } else {
            insertResume(r, (Integer) searchKey);
            size++;
        }
    }

    @Override
    protected void doUpdate(Resume r, Object searchKey) {
        storage[(Integer) searchKey] = r;
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return storage[(Integer) searchKey];
    }

    @Override
    protected void doDelete(Object searchKey) {
        removeResume((Integer) searchKey);
        storage[size - 1] = null;
        size--;
    }

    @Override
    public List<Resume> getAllSorted() {
        Resume[] tempStorage = Arrays.copyOf(storage, size);
        Arrays.sort(tempStorage, RESUME_COMPARATOR);
        return Arrays.asList(tempStorage);
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return (int) searchKey >= 0;
    }

    protected abstract void removeResume(int index);

    protected abstract void insertResume(Resume r, int index);
}
