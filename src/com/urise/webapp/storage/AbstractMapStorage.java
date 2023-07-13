package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapStorage extends AbstractStorage {

    Map<String, Resume > mapStorage = new HashMap<>();

    @Override
    public void clear() {
        mapStorage.clear();
    }

    @Override
    public List<Resume> getAllSorted() {
        List<Resume> tempList = new ArrayList<>(mapStorage.values());
        tempList.sort(RESUME_COMPARATOR);
        return tempList;
    }

    @Override
    public int size() {
        return mapStorage.size();
    }
}
