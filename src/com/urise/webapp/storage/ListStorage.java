package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.List;

public class ListStorage extends AbstractStorage {

    List<Resume> listStorage = new ArrayList<>();

    @Override
    protected int getIndex(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (uuid.equals(listStorage.get(i).getUuid())) return i;
        }
        return -1;
    }

    @Override
    protected Resume doGet(int index) {
        return listStorage.get(index);
    }

    @Override
    protected void doDelete(int index) {
        listStorage.remove(index);
    }

    @Override
    protected void doSave(Resume r, int index) {
        listStorage.add(r);
    }

    @Override
    protected void doUpdate(Resume r, int index) {
        listStorage.set(index, r);
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
