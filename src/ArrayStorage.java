import java.util.Arrays;
import java.util.Objects;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;
    void clear() {
        Arrays.fill(storage, null);
        size = 0;
    }

    void save(Resume r) {
        int index = Math.max(size, 0);
        storage[index] = r;
        size++;
    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(uuid, storage[i].toString())) return storage[i];
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(uuid, storage[i].toString())) {
                storage[i] = storage[size-1];
                storage[size-1] = null;
                size --;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }
}
