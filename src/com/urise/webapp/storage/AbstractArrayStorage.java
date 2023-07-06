package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage extends AbstractStorage {
    protected static final int STORAGE_LIMIT = 10000;
    protected final Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    @Override
    protected void doSave(Resume r, int index) {
        if (size == STORAGE_LIMIT) {
            throw new StorageException("Storage overflow", r.getUuid());
        } else {
            insertResume(r, index);
            size++;
        }
    }

    @Override
    protected void doUpdate(Resume r, int index) {
        storage[index] = r;
    }

    @Override
    protected Resume doGet(int index) {
        return storage[index];
    }

    @Override
    protected void doDelete(int index) {
        removeResume(index);
        storage[size - 1] = null;
        size--;
    }

    @Override
    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    protected abstract void removeResume(int index);

    protected abstract void insertResume(Resume r, int index);
}
