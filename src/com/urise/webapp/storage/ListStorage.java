package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.List;

public class ListStorage extends AbstractStorage {

    private final List<Resume> listStorage = new ArrayList<>();

    @Override
    protected Object getSearchKey(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (uuid.equals(listStorage.get(i).getUuid())) return i;
        }
        return -1;
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return listStorage.get((Integer) searchKey);
    }

    @Override
    protected void doDelete(Object searchKey) {
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
    protected boolean isExist(Object searchKey) {
        return (int) searchKey >= 0;
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
