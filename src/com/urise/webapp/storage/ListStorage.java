package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.List;

public class ListStorage extends AbstractStorage {

    private final List<Resume> listStorage = new ArrayList<>();

    @Override
    protected int getIndex(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (uuid.equals(listStorage.get(i).getUuid())) return i;
        }
        return -1;
    }

    @Override
    protected Resume doGet(Object searchKey, String uuid) {
        return listStorage.get((Integer) searchKey);
    }

    @Override
    protected void doDelete(Object searchKey, String uuid) {
        listStorage.remove((int) searchKey);
    }

    @Override
    protected void doSave(Resume r, Object searchKey) {
        listStorage.add(r);
    }

    @Override
    protected void doUpdate(Resume r, Object searchKey) {
        listStorage.set((Integer) searchKey, r);
    }

    @Override
    public void clear() {
        listStorage.clear();
    }

    @Override
    public Resume[] getAll() {
        return listStorage.toArray(new Resume[size()]);
    }

    @Override
    public int size() {
        return listStorage.size();
    }
}
