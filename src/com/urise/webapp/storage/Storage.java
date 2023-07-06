package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public interface Storage {

    void clear();

    Resume[] getAll();

    int size();

    void save(Resume r);

    void update(Resume r);

    Resume get(String uuid);

    void delete(String uuid);
}
