package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;
import java.util.Objects;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private final Resume[] storage = new Resume[10000];
    private int size = 0;

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    public void update(Resume r) {
        int position = checkResume(r.getUuid());
        if (position < 0) {
            System.out.println(notExistsResume(r.getUuid()));
        } else {
            storage[position] = r;
        }
    }

    public void save(Resume r) {
        int position = checkResume(r.getUuid());
        if (position > 0) {
            System.out.println("Resume with UUID: " + r.getUuid() + " already present");
        } else if (size > storage.length) {
            System.out.println("Storage is full.");
        } else {
            storage[size] = r;
            size++;
        }
    }

    public Resume get(String uuid) {
        int position = checkResume(uuid);
        if (position < 0) {
            System.out.println(notExistsResume(uuid));
            return null;
        } else {
            return storage[position];
        }
    }

    public void delete(String uuid) {
        int position = checkResume(uuid);
        if (position < 0) {
            System.out.println(notExistsResume(uuid));
        } else {
            storage[position] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    public int size() {
        return size;
    }

    private int checkResume(String uuid) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(uuid, storage[i].getUuid())) {
                return i;
            }
        }
        return -1;
    }

    private String notExistsResume(String uuid) {
        return ("No resume with UUID: " + uuid);
    }
}
