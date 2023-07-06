package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.model.Resume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListStorageTest {

    public Storage listStorage = new ListStorage();

    private static final String UUID_1 = "uuid1";
    private static final String UUID_2 = "uuid2";
    private static final String UUID_3 = "uuid3";
    private static final String UUID_4 = "uuid4";
    private static final String UUID_NOT_EXIST = "dummy";

    private static final Resume RESUME_1 = new Resume(UUID_1);
    private static final Resume RESUME_2 = new Resume(UUID_2);
    private static final Resume RESUME_3 = new Resume(UUID_3);
    private static final Resume RESUME_4 = new Resume(UUID_4);

    @Before
    public void setUp() {
        listStorage.clear();
        listStorage.save(RESUME_1);
        listStorage.save(RESUME_2);
        listStorage.save(RESUME_3);
    }

    @Test
    public void size() throws Exception {
        assertSize(3);
    }

    @Test
    public void save() throws Exception {
        listStorage.save(RESUME_4);
        assertSize(4);
        assertGet(RESUME_4);
    }

    @Test(expected = ExistStorageException.class)
    public void saveExist() throws Exception {
        listStorage.save(RESUME_1);
    }

    @Test
    public void clear() throws Exception {
        listStorage.clear();
        assertSize(0);
    }

    @Test
    public void update() throws Exception {
        Resume resumeUpdate = RESUME_3;
        listStorage.update(resumeUpdate);
        assertSame(listStorage.get(UUID_3), resumeUpdate);
    }

    @Test(expected = NotExistStorageException.class)
    public void updateNotExist() throws Exception {
        listStorage.update(new Resume(UUID_NOT_EXIST));
    }

    @Test
    public void get() throws Exception {
        assertGet(RESUME_1);
        assertGet(RESUME_2);
        assertGet(RESUME_3);
    }

    @Test(expected = NotExistStorageException.class)
    public void getNotExist() throws Exception {
        listStorage.get(UUID_NOT_EXIST);
    }

    @Test(expected = NotExistStorageException.class)
    public void delete() throws Exception {
        listStorage.delete(UUID_3);
        assertSize(2);
        listStorage.get(UUID_3);
    }

    @Test(expected = NotExistStorageException.class)
    public void deleteNotExist() throws Exception {
        listStorage.delete(UUID_NOT_EXIST);
    }

    @Test
    public void getAll() throws Exception {
        Resume[] expected = new Resume[]{RESUME_1, RESUME_2, RESUME_3};
        assertArrayEquals(expected, listStorage.getAll());
    }

    private void assertSize(int size) {
        assertEquals(size, listStorage.size());
    }

    private void assertGet(Resume resume) {
        assertEquals(resume, listStorage.get(resume.getUuid()));
    }
}
